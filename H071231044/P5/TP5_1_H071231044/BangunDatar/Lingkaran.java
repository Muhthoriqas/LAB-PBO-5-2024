package BangunDatar;

import java.util.Scanner;

public class Lingkaran extends BangunDatar{
    public Lingkaran(double r) {
        this.setR(r);
    }

    double hitungLuas() {
        double luas = this.getPi() * this.getR() * this.getR();
        return luas;
    }

    double hitungKeliling() {
        double keliling = 2 * this.getPi() * this.getR();
        return keliling;
    }

    public static void runLingkaran() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=".repeat(15) + " LINGKARAN " + "=".repeat(14));
        System.out.print("Masukkan jari-jari lingkaran: ");
        int inR = sc.nextInt();

        Lingkaran lingkaran = new Lingkaran(inR);

        System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas());
        System.out.println("Keliling Lingkaran: " + lingkaran.hitungKeliling());

        sc.close();
    }
}
