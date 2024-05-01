package TP5_1_H071231071.BangunRuang;

import java.util.Scanner;

public class Bola extends BangunRuang {
    public Bola(double r) {
        this.setR(r);
    }

    double HitungVolume() {
        double volume = 4 / 3 * super.getPI() * this.getR() * this.getR() * this.getR();
        return volume;
    }

    double HitungLuasBR() {
        double luas = 4 * super.getPI() * this.getR() * this.getR();
        return luas;
    }

    public static void runBola() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jari-jari bola: ");
        double jariJari = sc.nextDouble();
        Bola bola = new Bola(jariJari);
        System.out.println("\nVolume bola: " + bola.HitungVolume());
        System.out.println("Luas bola: " + bola.HitungLuasBR());
        sc.close();
    }

}
