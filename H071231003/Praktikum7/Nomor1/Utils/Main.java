package Nomor1.Utils;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Nomor1.Karyawan;
import Nomor1.Pengalaman;
import Nomor1.Pendidikan;
import Nomor1.Projek;

public class Main {
    public static void main(String[] args) {
        ArrayList<Karyawan> data = new ArrayList<>();

        boolean stop = false;
        Scanner ip = new Scanner(System.in);
        while (!stop) {
            System.out.println("Data Karyawan:\na. Tambah data Karyawan\nb. Tampilkan detail karyawan\nc. Keluar");
            System.out.print("Pilih opsi (a-c): ");
            String selectMenu = ip.nextLine();
            switch (selectMenu) {
                case "a":
                    Karyawan karyawan = new Karyawan();
                    System.out.println("Masukkan data karyawan");
                    boolean valid = false;
                    while (!valid) {
                        try {
                            System.out.print("Masukan nama: ");
                            karyawan.setNama(ip.nextLine());
                            System.out.print("Masukan Umur: ");
                            karyawan.setUmur(ip.nextInt());
                            ip.nextLine();
                            valid = true;
                        } catch (InputMismatchException e) {
                            System.out.println("Inputan tidak valid!");
                            ip.nextLine();
                        }
                    }
                    Pengalaman pengalaman = new Pengalaman(karyawan.getNama(), karyawan.getUmur());
                    pengalaman.status();
                    pengalaman.pengalamanKerja();
                    Pendidikan pendidikan = new Pendidikan();
                    pendidikan.pendidikanKaryawan();
                    Projek projek = new Projek();
                    projek.jumlahProyek();

                    if (pendidikan.getNilai() == 0 || projek.getNilai() == 0 || pengalaman.getUmur() < 18 || pengalaman.getNilai() == 0) {
                        garis();
                        System.out.println("Pengalaman sedang di Proses...");
                        Sound.Accept("C:/Users/USER/KULIAH/LAB-PBO-5-2024/H071231003/Praktikum7/Nomor1/Utils/NiceTry.wav");
                        garis();
                        System.out.println("Karyawan tidak memenuhi syarat");
                        garis();
                    } else {
                        garis();
                        System.out.println("Pengalaman sedang di Proses...");
                        Sound.Accept("C:/Users/USER/KULIAH/LAB-PBO-5-2024/H071231003/Praktikum7/Nomor1/Utils/AkuSiap.wav");
                        pendidikan.prosesKehidupan();
                        projek.prosesKehidupan();
                        garis();
                        System.out.println("Selamat, karyawan diterima!");
                        garis();
                        data.add(pengalaman); // Tambahkan objek karyawan, bukan pengalaman
                    }
                    break;
                case "b":
                    if (data.isEmpty()) {
                        garis();
                        System.out.println("Belum ada data karyawan...");
                        garis();
                    } else {
                        garis();
                        for (Karyawan hasil : data) {
                            hasil.displayinfo();
                            garis();
                        }
                    }
                    break;
                case "c":
                    stop = true;
                    garis();
                    System.out.println("Anda telah memilih untuk berhenti");
                    garis();
                    ip.close();
                    break;
                default:
                    System.out.println("Inputan hanya a-c");
                    break;
            }
        }
    }

    static void garis() {
        System.out.println("===========================================");
    }
}
