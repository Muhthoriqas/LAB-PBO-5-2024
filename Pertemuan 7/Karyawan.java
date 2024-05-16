import java.util.Scanner;

public class Karyawan {
    String nama, jabatan;
    int umur;
    double gaji;
    Keluarga keluarga = new Keluarga();

    Karyawan() {

    }

    // public Karyawan(String nama, String jabatan, int umur, double gaji,
    // Pengalaman pengalaman) {
    // this.nama = nama;
    // this.jabatan = jabatan;
    // this.umur = umur;
    // this.gaji = gaji;
    // this.pengalaman = pengalaman;
    // }

    // public Karyawan(String nama, String jabatan, int umur) {
    // this.nama = nama;
    // this.jabatan = jabatan;
    // this.umur = umur;
    // }

    public Karyawan(String nama, String jabatan, int umur) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    // public double getGaji() {
    // return gaji;
    // }

    // public void setGaji(double gaji) {
    // this.gaji = gaji;
    // }

    void displayInfo() {
        System.out.println("Nama: " + getNama());
        System.out.println("Umur: " + getUmur());
        System.out.println("Jabatan: " + getJabatan());
        System.out.println("Status pernikahan: " + getKeluarga().jawaban + "\n");
    }

    public Keluarga getKeluarga() {
        return keluarga;
    }

}