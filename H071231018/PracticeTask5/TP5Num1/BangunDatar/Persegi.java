package TP5Num1.BangunDatar;

import java.util.Scanner;

public class Persegi extends BangunDatar{
    public Persegi(double sisi){
        this.setSisi(sisi);
    }

    @Override
    double HitungLuas(){
        return this.getSisi() * this.getSisi();
    }

    @Override
    double HitungKeliling(){
        return 4 * this.getSisi();
    }

    public static void runPersegi(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi(cm): ");
        int inpSisi = sc.nextInt();
        Persegi persegi = new Persegi(inpSisi);
        System.out.println("Luas Persegi: " + persegi.HitungLuas());
        System.out.println("Keliling Persegi: " + persegi.HitungKeliling());

        sc.close();
    }
}
