package Nomor1;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Tampilan.Tampil1();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pilihan: ");
        int pilihan = scanner.nextInt();
        System.out.println("-----------------------------------------");

        //int h = 0 ;
        switch (pilihan) {
            case 1:
                System.out.print("Masukan sisi: ");
                double sisi = scanner.nextDouble();

                Kubus kubus = new Kubus(sisi);
                //System.out.println("Luas Permukaan Kubus: " + kubus.luasPermukaan());
                System.out.println("Volume kubus: " +  kubus.volume());
                System.out.print("Luas Permukaan Kubus: ");
                System.out.printf("%.2f" ,  kubus.luasPermukaan());
                break;
            case 2:
                System.out.print("Masukan panjang: ");
                double panjang = scanner.nextDouble();
                System.out.print("Masukan lebar: ");
                double lebar = scanner.nextDouble();
                System.out.print("Masukan tinggi: ");
                double tinggi = scanner.nextDouble();

                Balok balok = new Balok(panjang, lebar, tinggi);
                System.out.println("Luas Permukaan Balok: " + balok.luasPermukaan());
                System.out.println("Volume Balok: " + balok.volume());
                break;
            case 3:
                System.out.print("Masukan jari-jari: ");
                double jariJari = scanner.nextDouble();

                Bola bola = new Bola(jariJari);
                System.out.println("Luas Permukaan Bola: " + bola.luasPermukaan());
                System.out.println("Volume Bola: " + bola.volume());
                break;
            case 4:
                System.out.print("Masukan jari-jari: ");
                double jariJariT = scanner.nextDouble();
                System.out.print("Masukan tinggi: ");
                double tinggiT =  scanner.nextDouble();

                Tabung tabung = new Tabung(jariJariT, tinggiT);
                System.out.println("Luas Permukaan Tabung " + tabung.luasPermukaan());
                System.out.println("Volume  Tabung " + tabung.volume());
                break;
            case 5:
                System.out.print("Masukan sisi: ");
                double sisiP = scanner.nextDouble();

                Persegi persegi = new Persegi(sisiP);
                System.out.println("Luas Persegi " + persegi.luas());
                System.out.println("Keliling " + persegi.keliling());
                break;
            case 6:
                System.out.print("Masukan panjang: ");
                double panjangP = scanner.nextDouble();
                System.out.print("Masukan lebar: ");
                double lebarP = scanner.nextDouble();

                PersegiPanjang persegipanjang = new PersegiPanjang(panjangP, lebarP);
                System.out.println("Luas persegi panjang " + persegipanjang.luas());
                System.out.println("Keliling Persegi Panjang " + persegipanjang.keliling());
                break;
            case 7:
                System.out.print("Masukan jari-jari: ");
                double jariJariL = scanner.nextDouble();

                Lingkaran lingkaran = new Lingkaran(jariJariL);
                System.out.println("Luas Lingkaran: " + lingkaran.luas());
                System.out.println("Keliling Lingkaran: " + lingkaran.keliling());
                break;
            case 8:
                System.out.print("Masukan sisi 1 trapesium: ");
                double sisiAtas = scanner.nextDouble();
                System.out.print("Masukkan sisi 2 trapesium: ");
                double sisiBawah = scanner.nextDouble();
                System.out.print("Masukan sisi 3 trapesium: ");
                double sisiKanan = scanner.nextDouble();
                System.out.print("Masukan sisi 4 trapesium: ");
                double sisiKiri = scanner.nextDouble();
                System.out.print("Masukan tinggi trapesium: ");
                double tinggit = scanner.nextDouble();

                Trapesium trapesium = new Trapesium(sisiAtas, sisiBawah, sisiKiri, sisiKanan, tinggit);
                System.out.println("Luas trapesium: " + trapesium.luas());
                System.out.println("Keliling trapesium: " + trapesium.keliling());
                break;
            default:
                System.out.println("Pilihan tidak ada!!!!");
                break;
        }

    }
}
