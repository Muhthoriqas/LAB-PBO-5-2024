package Nomor1;

public class Karyawan extends Keluarga{
    private String nama, jabatan = "karyawan";
    private int umur;
    protected int gaji;

    public Karyawan() {

    }

    public Karyawan (String nama, int gaji, int umur) {
        this.gaji = gaji;
        this.nama = nama;
        this.umur = umur;
    }

    public Karyawan (String nama, int umur, String jabatan, int gaji) {
        this.nama = nama;
        this.umur = umur;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    public Karyawan(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public void diTolak(){

    }

    public void displayinfo() {
        System.out.println("Detail Karyawan: ");
        System.out.println("Nama\t: " + this.nama);
        System.out.println("Umur\t: " + this.umur);
        System.out.println("Status\t: " + this.status1);
        System.out.println("jabatan\t: "+ this.jabatan);
        System.out.println("gaji\t:" + this.gaji);
    }
}