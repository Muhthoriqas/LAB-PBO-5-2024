import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class Main{
    public static ArrayList<Karyawan> listKaryawan = new ArrayList<>();

    static void tambahKaryawan(Scanner input){
        Karyawan karyawanBaru = new Karyawan();
        Pengalaman pengalamanKaryawan = new Pengalaman();
        Projek projekKaryawan = new Projek();
        try {
            System.out.print("Masukkan nama: ");
            karyawanBaru.setNama(input.nextLine());
            System.out.print("Masukkan umur: ");
            karyawanBaru.setUmur(input.nextInt()); 
        } catch (InputMismatchException e){
            System.out.println("Input tidak sesuai!");
            input.nextLine();
            tambahKaryawan(input);
        }
        System.out.println("Pengalaman sebelumnya: ");
        System.out.println("1. Freelancer\n2. Magang\n3. Pekerja tetap\n4. Tidak ada");
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Input: ");
                pengalamanKaryawan.jenisPekerjaan(input.nextInt());
                validInput = true;
            } catch (InputMismatchException e){
                System.out.println("Silahkan masukkan 1, 2, 3, atau 4!");
                input.nextLine();
            }
        }
        pengalamanKaryawan.prosesKehidupan();
        validInput = false;
        projekKaryawan.menuPengalaman();
        while (!validInput) {
            try{
                System.out.print("Input: ");
                projekKaryawan.pengalamanProjek(input.nextInt());
                validInput = true;
            } catch (InputMismatchException e){
                System.out.println("Masukkan pilihan yang sesuai!");
                input.nextLine();
            }
        }

        try {
            System.out.print("Pengalaman Sedang Diproses");
            karyawanBaru.setPengalaman(pengalamanKaryawan);
            karyawanBaru.setProjek(projekKaryawan);
            karyawanBaru.setJabatan("Karyawan");
            for (int i = 0; i < 3; i++){
                System.out.print(".");
                Thread.sleep(2000);
            }
            System.out.println("\nPendidikan Terakhir : " + karyawanBaru.getPengalaman().getPendidikan());
            System.out.println("Jumlah Projek IT : " + karyawanBaru.getProjek().getLamaProjek() + " Tahun");
        } catch (InterruptedException e){
            System.out.println("Error memproses pengalaman");
        }
        
        if (karyawanBaru.getUmur() <= 18 | karyawanBaru.getPengalaman().getPendidikan() == "SD" | karyawanBaru.getPengalaman().getPendidikan()
        == "SMP" | karyawanBaru.getProjek().getLamaProjek() <= 4){
            playMusic(0);
            System.out.println("Maaf karyawan tidak dapat diterima!");
        } else {
            playMusic(1);
            listKaryawan.add(karyawanBaru);
            System.out.println("=============");
            System.out.println("Selamat Karyawan Diterima");
            System.out.println("=============");    
        }
    }

    static void playMusic(int confirm){
        if (confirm == 0){
            try {
                File musiclocation = new File("Ditolak.wav");
    
                if (musiclocation.exists()){
                    AudioInputStream audioInput = AudioSystem.getAudioInputStream(musiclocation);
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioInput);
                    clip.start();
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e){
                        
                    }
                } else {
                    System.out.println("Tidak ada");
                }
            } catch (Exception e){
                System.out.println(e);
            }
        } else {
            try {
                File musiclocation = new File("Diterima.wav");
    
                if (musiclocation.exists()){
                    AudioInputStream audioInput = AudioSystem.getAudioInputStream(musiclocation);
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioInput);
                    clip.start();
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e){
                        
                    }
                } else {
                    System.out.println("Tidak ada");
                }
            } catch (Exception e){
                System.out.println(e);
            }
        }
        
    }

    static void menu(Scanner input){
        System.out.println("Data Karyawan : ");
        System.out.println("a. Tambah data karyawan");
        System.out.println("b. Tampilkan detail karyawan");
        System.out.println("c. Keluar");
        System.out.print("Pilih opsi (a-c): ");
        String pilihan = input.next();
        input.nextLine();

        switch (pilihan){
            case "a":
                tambahKaryawan(input);
                menu(input);
                break;
            case "b":
                if (listKaryawan.size() == 0){
                    System.out.println("Tidak ada karyawan diterima");
                } else {
                    for (Karyawan x : listKaryawan){
                        x.showInfoKaryawan();
                    }
                }
                menu(input);
                break;
            case "c":
                System.out.println("h");
                System.exit(0);
                break;


        }
    }

    public static void main(String[] args){
        menu(new Scanner(System.in));
    }
}