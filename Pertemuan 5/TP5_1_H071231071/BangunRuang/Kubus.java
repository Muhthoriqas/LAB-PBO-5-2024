package TP5_1_H071231071.BangunRuang;

import java.util.Scanner;

public class Kubus extends BangunRuang {
    public Kubus(double sisi) {
        this.setP(sisi);

    }

    double HitungVolume() {
        double volume = this.getP() * this.getP() * this.getP();
        return volume;

    }

    double HitungLuasBR() {
        double luas = 6 * this.getP() * getP();
        return luas;
    }

    public static void runKubus() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sisi kubus: ");
        double sisi = sc.nextDouble();
        Kubus kubus = new Kubus(sisi);
        System.out.println("\nVolume kubus: " + kubus.HitungVolume());
        System.out.println("Luas kubus: " + kubus.HitungLuasBR());
        sc.close();
    }
}
