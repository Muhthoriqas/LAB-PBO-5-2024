package TP_8_1_H071231087;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
          static int jumlahData = 4;
          static UiThread uiThread = new UiThread();
          static int failedLoaded = 0;
      
          public static void main(String[] args) {
              uiThread.mulai(jumlahData);
              ExecutorService executor = Executors.newFixedThreadPool(3);
      
              for (int i = 0; i < jumlahData; i++) {
                  BackgroundThread backgroundThread = new BackgroundThread(); 
                  executor.submit(backgroundThread);
              }
              executor.shutdown();
      
              try {
                  int totalTime = 0;
                  while (!executor.awaitTermination(1, TimeUnit.SECONDS)) {
                      totalTime++;
                      uiThread.checkData(totalTime);
                  }
      
                  failedLoaded = jumlahData - BackgroundThread.getSuccessfulLoaded(); 
                  int successfulLoaded = BackgroundThread.getSuccessfulLoaded(); 
                  
                  uiThread.taskFinish(totalTime, successfulLoaded, failedLoaded);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          } 
}
