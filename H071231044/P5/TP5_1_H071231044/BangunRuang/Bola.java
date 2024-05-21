package BangunRuang;

import java.util.Scanner;

public class Bola extends BangunRuang{
    public Bola(double r) {
        this.setR(r);
    }

    double hitungLuasPermukaan() {
        double luasPermukaan = 4 * this.getPi() * (this.getR() * this.getR());
        return luasPermukaan;
    }

    double hitungVolume() {
        double volume = 4/3 * this.getPi() * (this.getR() * this.getR() * this.getR());
        return volume;
    }

    public static void runBola() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=".repeat(17) + " BOLA " + "=".repeat(17));
        System.out.print("Masukkan jari-jari bola: ");
        int inR = sc.nextInt();

        Bola bola = new Bola(inR);

        System.out.println("Luas Permukaan Bola: " + bola.hitungLuasPermukaan());
        System.out.println("Volume Bola: " + bola.hitungVolume());
        
        sc.close();
    }
}
