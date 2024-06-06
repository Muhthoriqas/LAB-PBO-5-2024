package TP_8_1_H071231087;

public class BackgroundThread implements Runnable {
          public static int successfulLoaded = 0; 

          @Override
          public void run() {
              int time =  TaskTimeHelper.getAngkaRandom();
      
              try {
                  Thread.sleep(time * 1000);
                  if (time > 4) {
                      System.out.println("Request Timeout");
                  } else {
                      successfulLoaded++; 
                  }
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
          }
      
          public static int getSuccessfulLoaded() { 
              return successfulLoaded;
          } 
}
