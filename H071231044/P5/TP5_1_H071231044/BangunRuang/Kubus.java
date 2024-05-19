package BangunRuang;

import java.util.Scanner;

public class Kubus extends BangunRuang{
    public Kubus(double sisi) {
        this.setSisi(sisi);
    }

    double hitungLuasPermukaan() {
        double luasPermukaan = 6 * (this.getSisi() * this.getSisi());
        return luasPermukaan;
    }

    double hitungVolume() {
        double volume = this.getSisi() * this.getSisi() * this.getSisi();
        return volume;
    }

    public static void runKubus() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=".repeat(16) + " KUBUS " + "=".repeat(17));
        System.out.print("Masukkan sisi kubus: ");
        int inSisi = sc.nextInt();

        Kubus kubus = new Kubus(inSisi);

        System.out.println("Luas Permukaan Kubus: " + kubus.hitungLuasPermukaan());
        System.out.println("Volume Kubus: " + kubus.hitungVolume());
        
        sc.close();
    }
}
