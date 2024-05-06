package TP5_1_H071231071.BangunDatar;

import java.util.Scanner;

public class Persegi extends BangunDatar1 {
    public Persegi(double sisi) {
        this.setP(sisi);
    }

    double HitungLuas() {
        double luas = this.getP() * this.getP();
        return luas;

    }

    double HitungKeliling() {
        double keliling = 4 * this.getP();
        return keliling;
    }

    public static void runPersegi() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sisi persegi: ");
        double sisi = sc.nextDouble();
        Persegi persegi = new Persegi(sisi);
        System.out.println("\nLuas Persegi: " + persegi.HitungLuas());
        System.out.println("Keliling Persegi: " + persegi.HitungKeliling());
        sc.close();
    }

}
