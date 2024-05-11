public class Pendidikan {
    int tingkat;
    String pend;

    public void match(String pendidikan) {
        this.pend = pendidikan;
        switch (pendidikan) {
            case "SD":
                sekolahAtas();
                break;
            case "SMP":
                sekolahMenengah();
                break;
            case "SMA":
                sekolahAtas();
                break;
            case "SMK":
                sekolahKejuruan();
                break;
            case "S1":
                strataSatu();
                break;
            case "S2":
                strataDua();
                break;
            case "S3":
                strataTiga();
                break;
        }
    }

    public void sekolahDasar() {
        this.tingkat = 1;
    }

    public void sekolahMenengah() {
        this.tingkat = 2;
    }

    public void sekolahAtas() {
        this.tingkat = 3;
    }

    public void sekolahKejuruan() {
        this.tingkat = 3;
    }

    public void strataSatu() {
        this.tingkat = 4;
    }

    public void strataDua() {
        this.tingkat = 5;
    }

    public void strataTiga() {
        this.tingkat = 6;
    }
}
