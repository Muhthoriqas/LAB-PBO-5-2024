import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    static int jumlahData = 4;
    static UiThread uiThread = new UiThread();

    public static void main(String[] args) {
        uiThread.mulai(jumlahData);
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 0; i < jumlahData; i++) {
            executor.submit(new BackgroundThread());
        }
        executor.shutdown();

        try {
            int totalTime = 0;
            while (!executor.awaitTermination(1, TimeUnit.SECONDS)) {
                totalTime++;
                uiThread.checkData(totalTime);
            }
            int failedLoaded = BackgroundThread.getFailedLoaded();
            uiThread.taskFinish(totalTime, jumlahData - failedLoaded, failedLoaded);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
