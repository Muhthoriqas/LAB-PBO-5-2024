package TP7Num1;

import java.util.Arrays;
import java.util.Scanner;

public class Main{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hai!");
        Audio.playAudio("C:\\Users\\nurhu\\Desktop\\dila\\semester 2\\pbo\\vscode\\tuprak\\mine\\PracticeTask7\\TP7Num1\\Sound\\hi.wav");
        runApp();
    }

    static void runApp() {
        while (true) {
            System.out.println("Data Karyawan: ");
            System.out.println("a. Tambahkan data karyawan");
            System.out.println("b. Tampilkan detail karyawan");
            System.out.println("c. keluar");
            System.out.print("Pilih opsi (a-c): ");
            String inp = sc.nextLine();
            Karyawan kryw = new Karyawan();

            switch (inp) {
                case "a":
                    System.out.print("Masukkan nama: ");
                    String name = sc.nextLine();
                    kryw.setNama(name);

                    int usia = -1;
                    while (usia < 0) {
                        try {
                            System.out.print("Masukkan umur: ");
                            usia = Integer.parseInt(sc.nextLine());
                            if (usia < 0) {
                                System.out.println("Umur tidak boleh negatif.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Input tidak valid. Masukkan angka.");
                        }
                    }
                    kryw.setUmur(usia);

                    System.out.println("Pengalaman sebelumnya: ");
                    System.out.println("1. Freelancer");
                    System.out.println("2. Magang");
                    System.out.println("3. Pekerja tetap");
                    System.out.println("4. Tidak ada");
                    runPengalaman(kryw);

                    String pd = "";
                    while (!Arrays.asList("SD", "SMP", "SMA", "D3", "S1", "S2", "S3").contains(pd)) {
                        System.out.print("Pendidikan Terakhir (SD/SMP/SMA/D3/S1/S2/S3): ");
                        pd = sc.nextLine();
                        kryw.pdkn.hitungPendidikan(pd);
                        if (kryw.pdkn.skorPendidikan == 0) {
                            System.out.println("Pendidikan tidak valid. Masukkan kembali.");
                        }
                    }

                    int pIT = -1;
                    while (pIT < 1 || pIT > 4) {
                        try {
                            System.out.println("Projek IT: ");
                            System.out.println("1. Minimal 4");
                            System.out.println("2. Minimal 8");
                            System.out.println("3. Minimal 12");
                            System.out.println("4. Lebih dari 15");
                            System.out.print("Input: ");
                            pIT = Integer.parseInt(sc.nextLine());
                            switch (pIT) {
                                case 1:
                                    kryw.prj.Minimal4(kryw);
                                    break;
                                case 2:
                                    kryw.prj.Minimal8(kryw);
                                    break;
                                case 3:
                                    kryw.prj.Minimal12(kryw);
                                    break;
                                case 4:
                                    kryw.prj.LebihDari15(kryw);
                                    break;
                                default:
                                    System.out.println("Input tidak valid. Masukkan angka 1-4.");
                                    break;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Input tidak valid. Masukkan angka.");
                        }
                    }

                    System.out.print("Pengalaman sedang diproses");
                    try {
                        for (int i = 0; i < 3; i++) {
                            Thread.sleep(1000);
                            System.out.print(".");
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Audio.playAudio("C:\\Users\\nurhu\\Desktop\\dila\\semester 2\\pbo\\vscode\\tuprak\\mine\\PracticeTask7\\TP7Num1\\Sound\\tik tok.wav");

                    if (kryw.pdkn.skorPendidikan >= 3 && kryw.prj.jumlahProjek >= 8 && kryw.getUmur() >= 18) {
                        System.out.println("\n" + "-".repeat(20));
                        System.out.println("Selamat, karyawan diterima!");
                        System.out.println("-".repeat(20));
                        Audio.playAudio("C:\\Users\\nurhu\\Desktop\\dila\\semester 2\\pbo\\vscode\\tuprak\\mine\\PracticeTask7\\TP7Num1\\Sound\\congrats.wav");
                        Karyawan.DaftarKaryawan.add(kryw);
                    } else {
                        System.out.println("\n" + "-".repeat(20));
                        System.out.println("Karyawan tidak memenuhi syarat.");
                        System.out.println("-".repeat(20));
                        Audio.playAudio("C:\\Users\\nurhu\\Desktop\\dila\\semester 2\\pbo\\vscode\\tuprak\\mine\\PracticeTask7\\TP7Num1\\Sound\\sedih.wav");
                    }
                    break;
                case "b":
                    if (Karyawan.DaftarKaryawan.isEmpty()) {
                        System.out.println("Daftar karyawan kosong");
                    } else {
                        for (Karyawan i : Karyawan.DaftarKaryawan) {
                            System.out.println("-".repeat(20));
                            i.displayInfo();
                        }
                        System.out.println("-".repeat(20));
                    }
                    break;
                case "c":
                    System.out.println("Bye-bye~");
                    Audio.playAudio("C:\\Users\\nurhu\\Desktop\\dila\\semester 2\\pbo\\vscode\\tuprak\\mine\\PracticeTask7\\TP7Num1\\Sound\\bye.wav");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Masukkan opsi (a-c).");
            }
        }
    }

    static void runPengalaman(Karyawan kryw) {
        int pilih = -1;
        while (pilih < 1 || pilih > 4) {
            try {
                System.out.print("Input: ");
                pilih = Integer.parseInt(sc.nextLine());
                switch (pilih) {
                    case 1:
                        kryw.pglm.Freelancer(kryw);
                        break;
                    case 2:
                        kryw.pglm.Magang(kryw);
                        break;
                    case 3:
                        kryw.pglm.PekerjaanTetap(kryw);
                        break;
                    case 4:
                        kryw.pglm.TidakAda(kryw);
                        break;
                    default:
                        System.out.println("Pilihan tidak tersedia. Masukkan angka 1-4.");
                        pilih = -1;
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Masukkan angka.");
            }
        }
    }
}
