package TP5_1_H071231071.BangunDatar;

import java.util.Scanner;

public class PersegiPanjang extends BangunDatar1 {
    public PersegiPanjang(double panjang, double lebar) {
        this.setP(panjang);
        this.setL(lebar);
    }

    double HitungLuas() {
        double luas = this.getP() * this.getL();
        return luas;

    }

    double HitungKeliling() {
        double keliling = (2 * this.getP()) + (2 * this.getL());
        return keliling;
    }

    public static void runPersegiPanjang() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang persegi panjang: ");
        double panjang = sc.nextDouble();
        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = sc.nextDouble();
        PersegiPanjang persegipPanjang = new PersegiPanjang(panjang, lebar);
        System.out.println("\nLuas Persegi Panjang: " + persegipPanjang.HitungLuas());
        System.out.println("Keliling Persegi Panjang: " + persegipPanjang.HitungKeliling());
        sc.close();
    }

}
