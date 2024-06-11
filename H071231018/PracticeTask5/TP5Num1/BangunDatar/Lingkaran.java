package TP5Num1.BangunDatar;

import java.util.Scanner;

public class Lingkaran extends BangunDatar{
    public Lingkaran(double jariJari){
        this.setJariJari(jariJari);
    }

    @Override
    double HitungLuas(){
        return this.getPi() * Math.pow(this.getJariJari(), 2);
    }

    @Override
    double HitungKeliling(){
        return this.getPi() * 2 * this.getJariJari();
    }

    public static void runLingkaran(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jari-jari: ");
        int inpR = sc.nextInt();
        Lingkaran L = new Lingkaran(inpR);
        System.out.println("Luas lingkaran: " + L.HitungLuas());
        System.out.println("Keliling lingkaran: " + L.HitungKeliling());

        sc.close();
    }
}
