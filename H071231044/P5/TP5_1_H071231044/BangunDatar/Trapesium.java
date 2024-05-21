package BangunDatar;

import java.util.Scanner;

public class Trapesium extends BangunDatar{
    private double sisi2, sisi3;

    public Trapesium(double alas, double sisi1, double sisi2, double sisi3, double tinggi) {
        this.setAlas(alas);
        this.setSisi(sisi1);
        this.setSisi2(sisi2);
        this.setSisi3(sisi3);
        this.setTinggi(tinggi);
    }

    public double getSisi2() {
        return sisi2;
    }
    public void setSisi2(double sisi2) {
        this.sisi2 = sisi2;
    }
    
    public double getSisi3() {
        return sisi3;
    }
    public void setSisi3(double sisi3) {
        this.sisi3 = sisi3;
    }

    double hitungLuas() {
        double luas = (this.getAlas() + this.getSisi2()) / 2 * this.getTinggi();
        return luas;
    }

    double hitungKeliling() {
        double keliling = this.getAlas() + this.getSisi() + this.getSisi2() + this.getSisi3();
        return keliling;
    }

    public static void runTrapesium() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=".repeat(15) + " TRAPESIUM " + "=".repeat(14));
        System.out.print("Masukkan alas trapesium: ");
        int inAlas = sc.nextInt();
        System.out.print("Masukkan sisi 1 trapesium: ");
        int inSisi1 = sc.nextInt();
        System.out.print("Masukkan sisi 2 trapesium: ");
        int inSisi2 = sc.nextInt();
        System.out.print("Masukkan sisi 3 trapesium: ");
        int inSisi3 = sc.nextInt();
        System.out.print("Masukkan tinggi trapesium: ");
        int inTinggi = sc.nextInt();

        Trapesium trapesium = new Trapesium(inAlas, inSisi1, inSisi2, inSisi3, inTinggi);

        System.out.println("Luas Trapesium: " + trapesium.hitungLuas());
        System.out.println("Keliling Trapesium: " + trapesium.hitungKeliling());

        sc.close();
    }
}
