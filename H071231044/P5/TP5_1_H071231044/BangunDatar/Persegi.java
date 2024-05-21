package BangunDatar;

import java.util.Scanner;

public class Persegi extends BangunDatar {
    public Persegi(double sisi) {
        this.setSisi(sisi);
    }


    double hitungLuas() {
        double luas = this.getSisi() * this.getSisi();
        return luas;
    }

    double hitungKeliling() {
        double keliling = 4 * this.getSisi();
        return keliling;
    }

    public static void runPersegi() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=".repeat(15) + " PERSEGI " + "=".repeat(16));
        System.out.print("Masukkan sisi persegi: ");
        int inSisi = sc.nextInt();

        Persegi persegi = new Persegi(inSisi);

        System.out.println("Luas Persegi         : " + persegi.hitungLuas());
        System.out.println("Keliling Persegi     : " + persegi.hitungKeliling());

        sc.close();
    }
}