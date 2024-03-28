package Praktikum.Praktikum2;

class Alamat {
    String jalan, kota;

    String getAll(){
        return jalan + ", " + kota;
    }
}

class Mahasiswa {
    String nama, nim;
    Alamat alamat;

    public String getAlamat() {
        return alamat.getAll();
    }
    public String getNama() {
        return nama;
    }
    public String getNim() {
        return nim;
    }
}

public class TP2_4_H071231052 {
    
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Tamalanrea Indah";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Yusra Erlangga Putra";
        mahasiswa.nim = "H071231052";

        System.out.println("Nama \t: " + mahasiswa.getNama());
        System.out.println("NIM \t: " + mahasiswa.getNim());
        System.out.println("Nama \t: " + mahasiswa.getAlamat());
    }
}