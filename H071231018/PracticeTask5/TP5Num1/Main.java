package TP5Num1;

import java.util.Scanner;
import TP5Num1.BangunRuang.Kubus;
import TP5Num1.BangunRuang.Balok;
import TP5Num1.BangunRuang.Bola;
import TP5Num1.BangunRuang.Tabung;
import TP5Num1.BangunDatar.Persegi;
import TP5Num1.BangunDatar.PersegiPanjang;
import TP5Num1.BangunDatar.Lingkaran;
import TP5Num1.BangunDatar.Trapesium;

public class Main {
    public static void main(String[] args) {
        run();
    }

    static void run(){
        Scanner sc = new Scanner(System.in);

        System.out.println("-".repeat(40));
        System.out.println("\t===== BANGUN RUANG =====");
        System.out.println("1. KUBUS\n2. BALOK\n3. BOLA\n4. TABUNG");
        System.out.println();
        System.out.println("\t===== BANGUN DATAR =====");
        System.out.println("5. PERSEGI\n6. PERSEGI PANJANG\n7. LINGKARAN\n8. TRAPESIUM");
        System.out.println("-".repeat(40));
        System.out.print("Pilihan: ");
        int inp = sc.nextInt();
        System.out.println("-".repeat(40));

        switch (inp){
            case 1:
                Kubus.runKubus();
                break;
            case 2:
                Balok.runBalok();
                break;
            case 3:
                Bola.runBola();
                break;
            case 4:
                Tabung.runTabung();
                break;
            case 5:
                Persegi.runPersegi();
                break;
            case 6:
                PersegiPanjang.runPersegiPanjang();
                break;
            case 7:
                Lingkaran.runLingkaran();
                break;
            case 8:
                Trapesium.runTrapesium();
                break;
        }

        System.out.println("-".repeat(40));

        sc.close();
}
}
