package Tp8_1_H071231044;

class BackgroundThread {
    static boolean isSuccess;

    static Runnable backgroundThread = new Runnable() {
        public void run() {
            int executionTime = TaskTimeHelper.getRandomExecutionTime();
            try {
                if (executionTime > 4){
                    Thread.sleep(5000);
                    System.out.println("Request Timeout");
                    isSuccess = false;
                } else {
                    Thread.sleep(executionTime * 1000);
                    isSuccess = true;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (UiThread.class){
                if (isSuccess) {
                    UiThread.dataLoadedCount++;
                }
                else{
                    UiThread.dataFailedCount++;
                }
            }
        }
    };
}
