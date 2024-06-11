package Tp8_1_H071231044;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        int backgroundThreads = 3;
        int uiThreads = 1;
        
        ExecutorService executorForBackgroundThread = Executors.newFixedThreadPool(backgroundThreads);
        ExecutorService executorForUIThread = Executors.newFixedThreadPool(uiThreads);

        System.out.println("Start load " + UiThread.data + " Data" );

        executorForUIThread.execute(UiThread.uiThread);
        for (int i = 0; i < UiThread.data; i++){
            executorForBackgroundThread.execute(BackgroundThread.backgroundThread);
        }
        executorForBackgroundThread.shutdown();
        executorForUIThread.shutdown();
    }
}

