package TP5_1_H071231071.BangunDatar;

import java.util.Scanner;

public class Lingkaran extends BangunDatar1 {
    public Lingkaran(double jariJari) {
        this.setR(jariJari);
    }

    double HitungLuas() {
        double luas = super.getPI() * (this.getR() * this.getR());
        return luas;

    }

    double HitungKeliling() {
        double keliling = 2 * super.getPI() * this.getR();
        return keliling;
    }

    public static void runLingkaran() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = sc.nextDouble();
        Lingkaran lingkaran = new Lingkaran(jariJari);
        System.out.println("\nLuas Lingkaran: " + lingkaran.HitungLuas());
        System.out.println("Keliling Lingkaran: " + lingkaran.HitungKeliling());
        sc.close();
    }

}
