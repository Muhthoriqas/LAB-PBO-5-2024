public class UiThread {
    protected void mulai(int jumlahData) {
        System.out.println("Start load " + jumlahData + " Data.");
    }

    protected void checkData(int detik) {
        System.out.println("Loading...(" + detik + "s)");
    }

    protected void taskFinish(int detik, int berhasil, int gagal) {
        if (gagal > 0) {
            System.out.println("Task Finish.");
            System.out.println("Time Execution : " + detik + "s");
            System.out.println(berhasil + " Data Successfully Loaded & " + gagal + " Data failed to load.");
        } else {
            System.out.println("Task Finish.");
            System.out.println("Time Execution : " + detik + "s");
            System.out.println("All data is successfully loaded");
        }
    }
}
