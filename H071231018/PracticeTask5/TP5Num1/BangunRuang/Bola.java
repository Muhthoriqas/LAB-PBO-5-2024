package TP5Num1.BangunRuang;

import java.util.Scanner;

public class Bola extends BangunRuang {
    public Bola(double jariJari){
        this.setJariJari(jariJari);
    }

    @Override
    double HitungLuasPermukaan(){
        return  4 * this.getPi() * Math.pow(this.getJariJari(), 2);
    }
    
    @Override
    double HitungVolume(){
        return 4/3 * this.getPi() * Math.pow(this.getJariJari(), 3);
    }

    public static void runBola(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jari-jari bola: ");
        int jrjr = sc.nextInt();
        Bola bola = new Bola(jrjr);
        System.out.println("Luas permukaan bola: " + bola.HitungLuasPermukaan());
        System.out.println("Volume bola: " + bola.HitungVolume());

        sc.close();
    }
}
