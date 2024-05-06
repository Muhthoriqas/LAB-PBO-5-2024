package TP5_1_H071231071.BangunRuang;

import java.util.Scanner;

public class Tabung extends BangunRuang {
    public Tabung(double r, double tinggi) {
        this.setR(r);
        this.setT(tinggi);
    }

    double HitungVolume() {
        double volume = super.getPI() * this.getR() * this.getR() * this.getT();
        return volume;
    }

    double HitungLuasBR() {
        double luas = (2 * super.getPI() * this.getR() * this.getT()) + (2 * super.getPI() * this.getR() * this.getR());
        return luas;
    }

    public static void runTabung() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jari-jari Tabung: ");
        double jariJari = sc.nextDouble();
        System.out.print("Masukkan tinggi Tabung: ");
        double tinggi = sc.nextDouble();
        Tabung tabung = new Tabung(jariJari, tinggi);
        System.out.println("\nVolume Tabung: " + tabung.HitungVolume());
        System.out.println("Luas Tabung: " + tabung.HitungLuasBR());
        sc.close();
    }

}
