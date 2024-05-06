import BangunDatar.*;
import BangunRuang.*;
import java.util.Scanner;

public class Main {
    static void garis() {
        System.out.println("----------------------------------");
    }

    static void menu() {
        garis();
        System.out.println("   ======= BANGUN RUANG =======");
        System.out.println("1. KUBUS");
        System.out.println("2. BALOK");
        System.out.println("3. BOLA");
        System.out.println("4. TABUNG");
        System.out.println("   ======= BANGUN DATAR =======");
        System.out.println("5. PERSEGI");
        System.out.println("6. PERSEGI PANJANG");
        System.out.println("7. LINGKARAN");
        System.out.println("8. TRAPESIUM");
        garis();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        menu();
        System.out.print("Pilian\t: ");
        int n = scan.nextInt();
        garis();
        switch (n) {
            case 1:
                System.out.print("Masukkan rusuk : ");
                Kubus.setRusuk(scan.nextDouble());
                Kubus.setNama("Kubus");
                Kubus.call3();
                break;
            case 2:
                System.out.print("Masukkan panjang\t: ");
                Balok.setPanjang(scan.nextDouble());
                System.out.print("Masukkan lebar\t\t: ");
                Balok.setLebar(scan.nextDouble());
                System.out.print("Masukkan tinggi\t\t: ");
                Balok.setTinggi(scan.nextDouble());
                Balok.setNama("Balok");
                Balok.call3();
                break;
            case 3:
                System.out.print("Masukkan jari-jari : ");
                Bola.setJariJari(scan.nextDouble());
                Bola.call3();
                break;
            case 4:
                System.out.print("Masukkan jari-jari\t: ");
                Tabung.setJariJari(scan.nextDouble());
                System.out.print("Masukkan tinggi   \t: ");
                Tabung.setTinggi(scan.nextDouble());
                Tabung.call3();
                break;
            case 5:
                System.out.print("Masukkan panjang sisi : ");
                Persegi.setSisi(scan.nextDouble());
                Persegi.setNama("Persegi");
                Persegi.call();
                break;
            case 6:
                System.out.print("Masukkan panjang\t: ");
                PersegiPanjang.setPanjang(scan.nextDouble());
                System.out.print("Masukkan lebar  \t: ");
                PersegiPanjang.setLebar(scan.nextDouble());
                PersegiPanjang.setNama("Persegi Panjang");
                PersegiPanjang.call();
                break;
            case 7:
                System.out.print("Masukkan jari-jari : ");
                Lingkaran.setJariJari(scan.nextDouble());
                Lingkaran.call();
                break;
            case 8:
                System.out.print("Masukkan sisi atas trapesium\t: ");
                Trapesium.panjang1 = scan.nextDouble();
                System.out.print("Masukkan sisi bawah trapesium\t: ");
                Trapesium.panjang2 = scan.nextDouble();
                System.out.print("Masukkan sisi miring trapesium\t: ");
                Trapesium.lebar1 = scan.nextDouble();
                System.out.print("Masukkan sisi samping trapesium\t: ");
                Trapesium.lebar2 = scan.nextDouble();
                System.out.print("Masukkan tinggi trapesium\t: ");
                Trapesium.setTinggi(scan.nextDouble());
                Trapesium.setNama("Trapesium");
                Trapesium.call();
                break;
        }
        garis();

        scan.close();
    }
}