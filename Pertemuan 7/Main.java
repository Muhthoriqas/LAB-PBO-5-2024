import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        runApp();
    }

    static void runApp() {
        ArrayList<Karyawan> listKaryawan = new ArrayList<>();

        boolean programClose = false;
        while (!programClose) {
            System.out.println("\nMenu:");
            System.out.println("a. Tambah data karyawan \nb. Tampilkan detail karyawan\nc. Keluar");
            System.out.print("Pilih opsi (a-c): ");
            String pilihMenu = sc.next();
            switch (pilihMenu) {
                case "a":
                    try {
                        String nama = inputNama();
                        int umur = inputUmur();
                        String jabatan = inputJabatan();

                        double gaji1;

                        Karyawan karyawan = new Karyawan(nama, jabatan, umur);
                        // Kehidupan experiance = new Pengalaman();
                        Kehidupan[] kehidupan = new Kehidupan[5];
                        kehidupan[0] = new Pengalaman();
                        kehidupan[1] = new Pendidikan();
                        kehidupan[2] = new Projek();
                        kehidupan[3] = new Organisasi();

                        Projek projek = new Projek();
                        Pendidikan pendidikan = new Pendidikan();
                        Organisasi organisasi = new Organisasi();

                        kehidupan[1] = pendidikan;
                        kehidupan[2] = projek;
                        kehidupan[3] = organisasi;

                        kehidupan[0].prosesKehidupan();

                        if (inputPilihan() == 4) {
                            kehidupan[1].prosesKehidupan();
                        } else {
                            gajiSebelumnya();
                            kehidupan[1].prosesKehidupan();
                        }

                        kehidupan[2].prosesKehidupan();
                        kehidupan[3].prosesKehidupan();
                        karyawan.getKeluarga().jalankan();
                        System.out.println();

                        if (karyawan.umur < 18 || (pendidikan.getInput().equals("SD")
                                || pendidikan.getInput().equals("SMP"))
                                || projek.getInput() == 1 || organisasi.getInput().equals("N")) {
                            tidakDiterima();
                            playSound("tidakDiterima.wav");
                        } else {
                            listKaryawan.add(karyawan);
                            System.out.println("Pendidikan terakhir: " + pendidikan.getInput());
                            System.out.println("Jumlah Projek IT: " + projek.getProjek());
                            diterima();
                            playSound("Diterima.wav");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Input yang dimasukkan tidak sesuai dengan tipe data yang diharapkan.");
                        sc.next(); // Membersihkan buffer input agar tidak terjadi looping
                    }
                    break;

                case "b":
                    if (listKaryawan.isEmpty()) {
                        System.out.println("Belum ada data karyawan");
                    } else {
                        System.out.println("Data Karyawan: \n");
                        for (Karyawan karyawan2 : listKaryawan) {
                            karyawan2.displayInfo();
                        }
                    }
                    break;

                case "c":
                    programClose = true;
                    break;
                default:
                    System.out.println("Inputan harus a-c");
                    break;
            }
        }
        sc.close();
    }

    static void diterima() {
        System.out.println("Pengalaman sedang diproses...");
        System.out.println("============");
        System.out.println("Selamat, karyawan diterima!");
        System.out.println("============");
    }

    static void tidakDiterima() {
        System.out.println("Karyawan tidak memenuhi syarat.");
    }

    static void playSound(String filename) {
        try {
            File file = new File(filename);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
        } catch (Exception e) {
            System.err.println("Error playing sound: " + e.getMessage());
        }
    }

    static String inputNama() {
        System.out.print("Masukkan nama: ");
        String nama = sc.next();
        if (nama.matches(".*\\d.*")) {
            System.out.println("Masukkan huruf");
            return inputNama();
        } else {
            return nama;
        }
    }

    static String inputJabatan() {
        System.out.print("Masukkan jabatan: ");
        String jabatan = sc.next();
        if (jabatan.matches(".*\\d.*")) {
            System.out.println("Masukkan huruf");
            return inputJabatan();
        } else {
            return jabatan;
        }
    }

    static int inputUmur() {
        try {
            System.out.print("Masukkan umur: ");
            int umur = sc.nextInt();
            sc.nextLine();
            return umur;
        } catch (Exception e) {
            System.out.println("Masukkan angka");
            sc.nextLine();
            return inputUmur();
        }
    }

    static double gajiSebelumnya() {
        try {
            System.out.print("Masukkan gaji sebelumnya: ");
            double gaji = sc.nextInt();
            sc.nextLine();
            return gaji;
        } catch (Exception e) {
            System.out.println("Masukkan angka");
            sc.nextLine();
            return gajiSebelumnya();
        }

    }

    static int inputPilihan() {
        try {
            System.out.print("Pilih pengalaman (1-4): ");
            int pilih = sc.nextInt();
            sc.nextLine();
            if (pilih < 1 || pilih > 4) {
                System.out.println("Inputan harus 1-4");
            }
            return pilih;
        } catch (Exception e) {
            System.out.println("Masukkan angka");
            sc.nextLine();
            return inputPilihan();
        }
    }

}
