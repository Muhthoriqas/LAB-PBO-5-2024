import java.util.Random;

public class TaskTimeHelper {
    public static void loading(){
        Random rand = new Random();
        int waktu = (rand.nextInt(6) + 1);
        try {
            Thread.sleep(waktu*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Main.dataLoad();
        if (waktu > 4) {
            System.out.println("Request Timeout");
            Main.gagal++;
        }
    }
}
