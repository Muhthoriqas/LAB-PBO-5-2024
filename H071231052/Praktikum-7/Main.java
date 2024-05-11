import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int user = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Darlingg~ Ohayou!");
        Audio.playAudio("./sound/ohayo.wav");
        while (user != 1) {
            menu();
            String plh = scan.next();
            if (plh.equalsIgnoreCase("a")) {
                Karyawan karyawan = new Karyawan();
                boolean kelulusan = false;

                System.out.print("Masukkan nama : ");
                scan.nextLine();
                String nama = scan.nextLine();
                karyawan.setNama(nama);

                System.out.print("Masukkan umur : ");
                int umur = scan.nextInt();

                pengalaman();
                int ngeh = scan.nextInt();
                karyawan.setUmur(umur);
                switch (ngeh) {
                    case 1:
                        karyawan.pengalaman.freelancer(karyawan);
                        gajiOption(karyawan);
                        break;
                    case 2:
                        karyawan.pengalaman.magang(karyawan);
                        gajiOption(karyawan);
                        break;
                    case 3:
                        karyawan.pengalaman.pekerjaTetap(karyawan);
                        gajiOption(karyawan);
                        break;
                    case 4:
                        karyawan.pengalaman.tidakAda(karyawan);
                        break;
                }
                System.out.print("Pendidikan terakhir (SD/SMP/SMA/SMK/S1/S2/S3) : ");
                String pend = scan.next();
                karyawan.pendidikan.match(pend);

                projek();
                int proj = scan.nextInt();
                switch (proj) {
                    case 1:
                        karyawan.projek.jumlah = 4;
                    case 2:
                        karyawan.projek.jumlah = 8;
                    case 3:
                        karyawan.projek.jumlah = 12;
                    case 4:
                        karyawan.projek.jumlah = 15;
                }

                System.out.print("Pengalaman organisasi (y/n) : ");
                String exp = scan.next();
                if (exp.equalsIgnoreCase("y")) {
                    karyawan.organisasi = true;
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
                Audio.playAudio("C:\\DEV\\Java\\Praktikum\\Praktikum7\\Praktikum-7\\sound\\yooo.WAV");
                System.out.println();
                System.out.println("Pendidikan terakhir : " + karyawan.pendidikan.pend);
                System.out.println("Jumlah projek IT : " + karyawan.projek.jumlah);
                
                if ((karyawan.pendidikan.tingkat > 2 || karyawan.projek.jumlah > 4 || karyawan.umur > 18)
                && karyawan.organisasi) {
                    kelulusan = true;
                }
                
                if (kelulusan) {
                    System.out.println("======================");
                    System.out.println("Selamat anda diterima");
                    System.out.println("======================");
                    Audio.playAudio("C:\\DEV\\Java\\Praktikum\\Praktikum7\\Praktikum-7\\sound\\hehebuoi.WAV");
                    Karyawan.daftar.add(karyawan);
                } else {
                    System.out.println("===============================");
                    System.out.println("Karyawan tidak memenuhi syarat");
                    System.out.println("===============================");
                    Audio.playAudio("C:\\DEV\\Java\\Praktikum\\Praktikum7\\Praktikum-7\\sound\\watdeheee.WAV");
                }
                
            } else if (plh.equalsIgnoreCase("b")) {
                for (Karyawan i : Karyawan.daftar) {
                    i.displayInfo();
                }
                System.out.println("----------------");
            } else if (plh.equalsIgnoreCase("c")) {
                user = 1;
            } else if (plh.equalsIgnoreCase("d")){
                System.out.println("kan dibilangin, ahh~");
                Audio.playAudio("C:\\DEV\\Java\\Praktikum\\Praktikum7\\Praktikum-7\\sound\\ah.WAV");
            } else {
                System.out.println(plh + " tidak ada dalam pilihan");
            }
        }
        scan.close();
        System.out.println("Ara ara~ sayonara");
        Audio.playAudio("C:\\DEV\\Java\\Praktikum\\Praktikum7\\Praktikum-7\\sound\\sayonara.WAV");
    }
    
    static void menu() {
        System.out.println("Data karyawan: ");
        System.out.println("a.  Tambah data karyawan");
        System.out.println("b.  Tampilkan detail karyawan");
        System.out.println("c.  Keluar");
        System.out.println("d.  JANGAN DIPILIH");
        System.out.print("Pilih opsi (a-c): ");
    }

    static void pengalaman() {
        System.out.println("Pengalaman sebelumnya: ");
        System.out.println("1. Freelancer");
        System.out.println("2. Magang");
        System.out.println("3. Pekerja tetap");
        System.out.println("4. Tidak ada");
        System.out.print("input : ");
    }

    static void gajiOption(Karyawan user) {
        Scanner scan = new Scanner(System.in);
            System.out.print("Gaji sebelumnya : ");
            int x = scan.nextInt();
            user.setGaji(x);
        
    }

    static void projek() {
        System.out.println("Projek IT :");
        System.out.println("1. Minimal 4");
        System.out.println("2. Minimal 8");
        System.out.println("3. Minimal 12");
        System.out.println("4. Lebih dari 15");
        System.out.print("Input : ");
    }
}
