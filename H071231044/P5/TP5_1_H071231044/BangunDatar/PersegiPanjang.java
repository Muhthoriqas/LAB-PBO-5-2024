package BangunDatar;

import java.util.Scanner;

public class PersegiPanjang extends BangunDatar{
    public PersegiPanjang(double panjang, double lebar) {
        this.setPanjang(panjang);
        this.setLebar(lebar);
    }


    double hitungLuas() {
        double luas = this.getPanjang() * this.getLebar();
        return luas;
    }

    double hitungKeliling() {
        double keliling = 2 * (this.getPanjang() + this.getLebar());
        return keliling;
    }

    public static void runPersegiPanjang() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=".repeat(16) + " PERSEGI PANJANG " + "=".repeat(17));
        System.out.print("Masukkan panjang persegi panjang: ");
        int inPanjang = sc.nextInt();
        System.out.print("Masukkan lebar persegi panjang: ");
        int inLebar = sc.nextInt();

        PersegiPanjang persegiPanjang = new PersegiPanjang(inPanjang, inLebar);

        System.out.println("Luas Persegi Panjang: " + persegiPanjang.hitungLuas());
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.hitungKeliling());

        sc.close();
    }
}

