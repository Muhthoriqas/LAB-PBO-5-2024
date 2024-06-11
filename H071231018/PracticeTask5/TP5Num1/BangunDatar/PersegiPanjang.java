package TP5Num1.BangunDatar;

import java.util.Scanner;

public class PersegiPanjang extends BangunDatar{
    public PersegiPanjang(double panjang, double lebar){
        this.setPanjang(panjang);
        this.setLebar(lebar);
    }

    @Override
    double HitungLuas(){
        return this.getPanjang() * this.getLebar();
    }

    @Override
    double HitungKeliling(){
        return 2 * (this.getPanjang() + this.getLebar());
    }

    public static void runPersegiPanjang(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sisi panjang(cm): ");
        int inpPanjangPP = sc.nextInt();
        System.out.print("Masukkan sisi lebar(cm): ");
        int inpLebarPP = sc.nextInt();

        PersegiPanjang pp = new PersegiPanjang(inpPanjangPP, inpLebarPP);
        System.out.println("Luas persegi panjang: " + pp.HitungLuas());
        System.out.println("Keliling persegi panjang: " + pp.HitungKeliling());
        
        sc.close();
    }
}
