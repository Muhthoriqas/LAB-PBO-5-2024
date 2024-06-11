package TP7Num1;

import java.util.ArrayList;
// import java.util.Scanner;

public class Karyawan {
    String nama, jabatan;
    int umur, gaji, NIP;
    Pendidikan pdkn = new Pendidikan();
    Pengalaman pglm = new Pengalaman();
    Projek prj = new Projek();
    public static ArrayList<Karyawan> DaftarKaryawan = new ArrayList<>();

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getJabatan(){
        return jabatan;
    }

    public void setJabatan(String jabatan){
        this.jabatan = jabatan;
    }

    public int getUmur(){
        return umur;
    }

    public void setUmur(int umur){
        this.umur = umur;
    }

    public int getGaji(){
        return gaji;
    }

    public void setGaji(int gaji){
        this.gaji = gaji;
    }
    
    public void displayInfo(){
        System.out.println("Nama: " + getNama());
        System.out.println("Umur: " + getUmur());
        System.out.println("Jabatan: " + "Karyawan");
    }
}
