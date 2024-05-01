package TP5_1_H071231071.BangunDatar;

import java.util.Scanner;

public class Trapesium extends BangunDatar1 {
    public Trapesium(double s1, double s2, double tinggi) {
        this.setP(s1);
        this.setL(s2);
        this.setT(tinggi);

    }

    double HitungLuas() {
        double luas = 0.5 * this.getT() * (this.getP() + this.getP());
        return luas;

    }

    double HitungKeliling() {
        double keliling = (2 * this.getP()) + (2 * this.getL());
        return keliling;
    }

    public static void runTrapesium() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sisi 1 Trapesium: ");
        double sisi1 = sc.nextDouble();
        System.out.print("Masukkan sisi 2 Trapesium: ");
        double sisi2 = sc.nextDouble();
        System.out.print("Masukkan sisi 3 Trapesium: ");
        double sisi3 = sc.nextDouble();
        System.out.print("Masukkan sisi 4 Trapesium: ");
        double sisi4 = sc.nextDouble();
        System.out.print("Masukkan tinggi Trapesium: ");
        double tinggi = sc.nextDouble();
        Trapesium trapesium = new Trapesium(sisi1, sisi3, tinggi);
        System.out.println("\nLuas Trapesium: " + trapesium.HitungLuas());
        System.out.println("Keliling Trapesium: " + trapesium.HitungKeliling());
        sc.close();
    }

}