package BangunRuang;

import java.util.Scanner;

public class Tabung extends BangunRuang{
    public Tabung(double r, double tinggi) {
        this.setR(r);
        this.setTinggi(tinggi);
    }

    double hitungLuasPermukaan() {
        double luasPermukaan = 2 * this.getPi() * this.getR() * (this.getR() + this.getTinggi());
        return luasPermukaan;
    }

    double hitungVolume() {
        double volume = this.getPi() * (this.getR() * this.getR()) * this.getTinggi();
        return volume;
    }

    public static void runTabung() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=".repeat(16) + " TABUNG " + "=".repeat(16));
        System.out.print("Masukkan jari-jari tabung: ");
        int inR = sc.nextInt();
        System.out.print("Masukkan tinggi tabung: ");
        int inTinggi = sc.nextInt();

        Tabung tabung = new Tabung(inR, inTinggi);

        System.out.println("Luas Permukaan Tabung: " + tabung.hitungLuasPermukaan());
        System.out.println("Volume Tabung: " + tabung.hitungVolume());
        
        sc.close();
    }
}

