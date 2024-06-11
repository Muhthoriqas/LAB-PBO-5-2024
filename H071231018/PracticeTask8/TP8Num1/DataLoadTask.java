package TP8Num1;

class DataLoadTask implements Runnable {

    private final String dataId;
    private final int dataLoadTime;

    public DataLoadTask(String dataId) {
        this.dataId = dataId;
        this.dataLoadTime = TaskTimeHelper.getRandomTime();
    }

    @Override
    public void run() {
        System.out.println("Loading data " + dataId + "...");

        try {
            Thread.sleep(dataLoadTime * 1000); // Simulate data loading time
            System.out.println("Data " + dataId + " loaded successfully.");
        } catch (InterruptedException e) {
            System.out.println("Data " + dataId + " loading failed.");
        }

        if (dataLoadTime > 4) {
            System.out.println("**Request Timeout for Data " + dataId + "**");
            dataLoadFailures++;
        }

        dataLoadedCount++;
    }
}
