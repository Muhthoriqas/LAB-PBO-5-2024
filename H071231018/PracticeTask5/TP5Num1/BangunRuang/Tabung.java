package TP5Num1.BangunRuang;

import java.util.Scanner;

public class Tabung extends BangunRuang{
    public Tabung(double jariJari, double tinggi){
        this.setJariJari(jariJari);
        this.setTinggi(tinggi);
    }

    @Override
    double HitungLuasPermukaan(){
        return 2 * this.getPi() * this.getJariJari() * (this.getJariJari() + this.getTinggi());
    }

    @Override
    double HitungVolume(){
        return this.getPi() * Math.pow(this.getJariJari(), 2) * this.getTinggi();
    }

    public static void runTabung(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jari-jari tabung : ");
        int jrjrT = sc.nextInt();
        System.out.print("Masukkan tinggi tabung: ");
        int tinTab = sc.nextInt();
        Tabung tbg = new Tabung(jrjrT, tinTab);
        System.out.println("Luas permukaan tabung: " + tbg.HitungLuasPermukaan());
        System.out.println("Volume tabung: " + tbg.HitungVolume());

        sc.close();
    }
}
