public class BackgroundThread implements Runnable {
    protected static int failedLoaded = 0;

    @Override
    public void run() {
        int time = TaskTimeHelper.getAngkaRandom();

        try {
            Thread.sleep(time * 1000);
            if (time > 4) {
                System.out.println("Request Timeout");
                incrementFailedLoaded();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized static void incrementFailedLoaded() {
        failedLoaded++;
    }

    public synchronized static int getFailedLoaded() {
        return failedLoaded;
    }
}