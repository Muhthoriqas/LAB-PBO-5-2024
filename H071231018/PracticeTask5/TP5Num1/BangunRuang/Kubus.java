package TP5Num1.BangunRuang;

import java.util.Scanner;

public class Kubus extends BangunRuang{
    public Kubus(double sisi){
        this.setSisi(sisi);
    }

    @Override
    double HitungLuasPermukaan(){
        return 6 * (this.getSisi() * this.getSisi());
    }

    @Override
    double HitungVolume(){
        return Math.pow(this.getSisi(), 3);
    }

    public static void runKubus(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan sisi kubus: ");
        int sisiKbs = sc.nextInt();
        Kubus kubus = new Kubus(sisiKbs);
        System.out.println("Luas permukaan kubus: " + kubus.HitungLuasPermukaan());
        System.out.println("Volume kubus: " + kubus.HitungVolume());

        sc.close();
    }
}
