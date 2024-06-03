import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main extends Thread{
    public static int gagal = 0;
    public static boolean status  = true;
    static int data = 0;

    public static synchronized void dataLoad(){
        Main.data++;
    }

    public void run(){
        System.out.println("Dimulai");
        //pakai while true supaya nanti bisa break ketika semua program selesai
        int i = 1;
        while (data < 4){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("Loading... (" + i + "s)");
            i++;
        }
        System.out.println("\nSelesai");
        System.out.println((4-Main.gagal) + " sukses dan " + Main.gagal + " gagal");
    }
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(4);
        Main UI = new Main();
        
        for (int i = 0; i < 4; i++) {
            executor.execute(new Runnable(){
                public void run() {
                    TaskTimeHelper.loading();
                }
            });
        }
        UI.start();

        executor.shutdown();
    }
}