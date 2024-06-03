package TP5_NO1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pilihan;

        System.out.println("----------------------------------------------------------");
        System.out.println("==========Bangun Ruang==========");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Bola");
        System.out.println("4. Tabung");
        System.out.println("==========Bangun Datar==========");
        System.out.println("5. Persegi");
        System.out.println("6. Persegi Panjang");
        System.out.println("7. Lingkaran");
        System.out.println("8. Trapesium");
        System.out.println("----------------------------------------------------------");

        System.out.println("Masukkan pilihan Anda:");
        pilihan =scanner.nextInt();

        switch (pilihan) {
            case 1: //Kubus
                System.out.println("Masukkan sisi kubus: ");
                double sisiKubus = scanner.nextDouble();

                Kubus kubus = new Kubus(sisiKubus);
                kubus.hitungLuas();
                kubus.hitungVolume();

                System.out.println("Luas Kubus: "+ kubus.luas);
                System.out.println("Volume kubuss: " + kubus.volume);
                break;
            case 2: // Balok
                System.out.println("Masukkan panjang balok: ");
                double panjangBalok = scanner.nextDouble();
                
                System.out.println("Masukkan lebar balok: ");
                double lebarBalok = scanner.nextDouble();

                System.out.println("Masukkan tinggi balok: ");
                double tinggiBalok = scanner.nextDouble();

                Balok balok = new Balok(panjangBalok, lebarBalok, tinggiBalok);
                balok.hitungLuas();
                balok.hitungVolume();

                System.out.println("Luas Balok: " + balok.luas);
                System.out.println("Volume Balok: " + balok.volume);
                break;
            case 3: //Bola
                System.out.println("Masukkan jari jari Bola: ");
                double jariJariBola = scanner.nextDouble();

                Bola bola = new Bola(jariJariBola);
                bola.hitungLuas();
                bola.hitungVolume();

                System.out.println("Luas Bola: "+ bola.luas);
                System.out.println("Volume Bola: " + bola.volume );
                break;
            case 4: //Tabung
                System.out.println("Masukkan jari jari tabung: ");
                double jariJaritabung = scanner.nextDouble();

                System.out.println("Masukkan tinggi tabung: ");
                double tinggiTabung = scanner.nextDouble();

                Tabung tabung = new Tabung(jariJaritabung, tinggiTabung);
                tabung.hitungLuas();
                tabung.hitungVolume();

                System.out.println("Luas tabung: "+ tabung.luas);
                System.out.println("Volume tabung: " + tabung.volume );
                break;
            case 5: //Persegi
                System.out.println("Masukkan sisi persegi: ");
                double sisiPersegi = scanner.nextDouble();

                Persegi persegi = new Persegi(sisiPersegi);
                persegi.hitungLuas();

                System.out.println("Luas persegi: "+ persegi.luas);
                break;
            case 6: //Persegi panjang
                System.out.println("Masukkan panjang persegi panjang: ");
                double panjangPersegiPanjang = scanner.nextDouble();

                System.out.println("Masukkan lebar persegi panjang: ");
                double lebarPersegiPanjang = scanner.nextDouble();

                PersegiPanjang persegiPanjang = new PersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);
                persegiPanjang.hitungLuas();
                
                System.out.println("Luas persegi panjang: "+ persegiPanjang.luas);
                break;
            case 7:// Lingkaran
                System.out.println("Masukkan jari jari lingkaran: ");
                double jariJariLingkaran = scanner.nextDouble();

                Lingkaran lingkaran = new Lingkaran(jariJariLingkaran);
                lingkaran.hitungLuas();

                System.out.println("Luas Lingkaran: "+lingkaran.luas);
                break;
            case 8: //Trapesium
                System.out.println("Masukkan sisi 1 trapesium: ");
                double sisi1Trapesium = scanner.nextDouble();

                System.out.println("Masukkan sisi 2 trapesium: ");
                double sisi2Trapesium = scanner.nextDouble();

                System.out.println("Masukkan sisi 3 trapesium: ");
                double sisi3Trapesium = scanner.nextDouble();

                System.out.println("Masukkan sisi 4 trapesium: ");
                double sisi4Trapesium = scanner.nextDouble();

                System.out.println("Masukkan tinggi trapesium: ");
                double tinggiTrapesium = scanner.nextDouble();

                Trapesium trapesium = new Trapesium(sisi1Trapesium, sisi2Trapesium, sisi3Trapesium, sisi4Trapesium, tinggiTrapesium);
                trapesium.hitungLuas();
                trapesium.hitungKeliling();
            default:
                System.out.println("Pilihan tidak tersedia, pilih ulang yakkk");
        }
        scanner.close();
    }   
    
}
