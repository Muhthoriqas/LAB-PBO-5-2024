package Tp8_1_H071231044;

class UiThread {
    static int dataLoadedCount = 0;
    static int dataFailedCount = 0;
    static long startTime;
    static long time;
    static int data = 4;

    static Runnable uiThread = new Runnable() {
        public void run() {
            startTime = System.currentTimeMillis();

            while (true){
                time = (System.currentTimeMillis() - startTime) / 1000;

                if (time > 0){
                    System.out.println("Loading... (" + time + "s)");

                    if (dataLoadedCount + dataFailedCount == data){
                        System.out.println();
                        System.out.println("Task Finish.");
                        System.out.println("Time Execution : " + time + "s");
                        if (dataFailedCount < 1){
                            System.out.println("All data is successfully loaded");
                            } 
                        else {
                            System.out.println(dataLoadedCount + " Data Succesfully loaded & " + dataFailedCount + " Data failed to load");
                            }
                        break;
                    }
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };
}
