import java.util.Scanner;

abstract class Kehidupan{
    Scanner input = new Scanner(System.in);
    abstract void prosesKehidupan();
}

class Pengalaman extends Kehidupan{
    private String pekerjaan;
    private double gaji;
    private String pendidikan;

    public String getPendidikan() {
        return pendidikan;
    }

    public void setPendidikan(String pendidikan) {
        this.pendidikan = pendidikan;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public double getGaji() {
        return gaji;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    @Override
    void prosesKehidupan(){
        System.out.println("Pendidikan terakhir (SD/SMP/SMA/SMK/S1/S2/S3) : ");
        setPendidikan(input.next());
        input.nextLine();
        if (!validasiPendidikan()){
            System.out.println("Pendidikan tidak valid! masukkan lagi!");
            prosesKehidupan();
        }
    }

    boolean validasiPendidikan(){
        if (!this.pendidikan.equals("SD") &&
            !this.pendidikan.equals("SMP") &&
            !this.pendidikan.equals("SMA") &&
            !this.pendidikan.equals("SMK") &&
            !this.pendidikan.equals("S1") &&
            !this.pendidikan.equals("S2") &&
            !this.pendidikan.equals("S3")){
                return false;
        } else {
            return true;
        }
    }

    void jenisPekerjaan(int konfirmasiPengalaman){
        switch (konfirmasiPengalaman){
            case 1:
                System.out.print("Gaji Sebelumnya: ");
                setGaji(input.nextInt());
                input.nextLine();
                break;
            case 2:
                System.out.print("Gaji Sebelumnya: ");
                setGaji(input.nextInt());
                input.nextLine();
                break;
            case 3:
                System.out.print("Gaji Sebelumnya: ");
                setGaji(input.nextInt());
                input.nextLine();
                break;
            case 4:
                setGaji(0);
                break;
        }
    }
}