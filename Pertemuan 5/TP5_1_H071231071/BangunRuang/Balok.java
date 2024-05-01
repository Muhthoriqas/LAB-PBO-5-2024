package TP5_1_H071231071.BangunRuang;

import java.util.Scanner;

public class Balok extends BangunRuang {
    public Balok(double panjang, double lebar, double tinggi) {
        this.setP(panjang);
        this.setL(lebar);
        this.setT(tinggi);
    }

    double HitungVolume() {
        double volume = this.getP() * this.getL() * this.getT();
        return volume;

    }

    double HitungLuasBR() {
        double luas = 2 * (this.getP() * this.getL() + this.getP() * this.getT() + this.getL() * this.getT());
        return luas;
    }

    public static void runBalok() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang balok: ");
        double panjang = sc.nextDouble();
        System.out.print("Masukkan lebar balok: ");
        double lebar = sc.nextDouble();
        System.out.print("Masukkan tinggi balok: ");
        double tinggi = sc.nextDouble();

        Balok balok = new Balok(panjang, lebar, tinggi);
        System.out.println("\nVolume balok: " + balok.HitungVolume());
        System.out.println("Luas balok: " + balok.HitungLuasBR());
        sc.close();
    }

}
