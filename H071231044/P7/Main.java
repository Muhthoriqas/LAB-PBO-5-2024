import java.util.*;
public class Main {
    public static void main(String[] args) {
        Karyawan karyawan = new Karyawan();
        List<Karyawan> daftarKaryawan = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Data Karyawan :\na. Tambah data karyawan\nb. Tampilkan detail karyawan\nc. Keluar");
            System.out.print("Pilih opsi (a-c): ");
            String inOpsi = input.nextLine();
            switch (inOpsi) {
                case "a":
                    karyawan.prosesKehidupan();
                    if (karyawan.getUmur() < 18 || karyawan.projek.getProyek() == 4 || karyawan.pendidikan.getPendidikan() == 1 || karyawan.pendidikan.getPendidikan() == 0 || karyawan.pengalaman.getOrganisasi() == "Tidak ada") {
                        Karyawan.playSound("fail.wav");
                        System.out.println("==========\nKaryawan tidak memenuhi Syarat\n==========\n");
                    }else{
                        System.out.println("Pendidikan terakhir: " + karyawan.pendidikan.getPendidikan());
                        System.out.println("Jumlah proyek IT: " + karyawan.projek.getProyek());
                        Karyawan.playSound("UI.wav");
                        Karyawan karyawan1 = new Karyawan(karyawan.getNama(),karyawan.getUmur(),karyawan.getJabatan(),karyawan.getGaji(),karyawan.keluarga.getMenikah(),karyawan.keluarga.getAnak());
                        daftarKaryawan.add(karyawan1);
                        System.out.println("==========\nSelamat, Karyawan diterima\n==========\n");
                    }
                    break;
                case "b":
                    if (daftarKaryawan.isEmpty()) {
                        System.out.println("\n=================================\nBelum ada data karyawan...\n=================================");
                    } else {
                        System.out.println("\n=================================\nDetail Karyawan yang Diterima:");
                        for (Karyawan karyawan2 : daftarKaryawan) {
                            karyawan2.displayInfo();
                        }
                    }
                    break;

                case "c":
                    System.out.println("Bye");
                    System.exit(0);
                    input.close();
                default:
                    System.out.println("Diluar Pilihan! ");
            } 
        }
    }
}
