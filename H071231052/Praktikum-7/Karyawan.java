import java.util.ArrayList;

public class Karyawan {
    String nama, jabatan;
    int gaji, umur;
    boolean organisasi = false;
    Pendidikan pendidikan = new Pendidikan();
    Pengalaman pengalaman = new Pengalaman();
    Projek projek = new Projek();
    public static ArrayList<Karyawan> daftar = new ArrayList<>();


    public void displayInfo(){
        System.out.println("----------------");
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
        System.out.println("Jabatan : karyawan");
        System.out.println("Gaji : " + gaji);
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
    public int getGaji() {
        return gaji;
    }
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    

}