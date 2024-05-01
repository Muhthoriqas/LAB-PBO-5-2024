package TP5_1_H071231071;

import java.util.Scanner;

import TP5_1_H071231071.BangunDatar.Lingkaran;
import TP5_1_H071231071.BangunDatar.Persegi;
import TP5_1_H071231071.BangunDatar.PersegiPanjang;
import TP5_1_H071231071.BangunDatar.Trapesium;
import TP5_1_H071231071.BangunRuang.Balok;
import TP5_1_H071231071.BangunRuang.Bola;
import TP5_1_H071231071.BangunRuang.Kubus;
import TP5_1_H071231071.BangunRuang.Tabung;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printgaris();
        System.out.println("===== BANGUN RUANG =====\n1. KUBUS \n2. BALOK \n3. BOLA \n4. TABUNG");
        System.out.println("\n===== BANGUN DATAR =====\n5. PERSEGI \n6. PERSEGI PANJANG \n7. LINGKARAN \n8. TRAPESIUM");
        printgaris();

        System.out.print("Pilihan: ");
        int pilihan = sc.nextInt();
        printgaris();

        switch (pilihan) {
            case 1:
                Kubus.runKubus();
                printgaris();
                break;
            case 2:
                Balok.runBalok();
                printgaris();
                break;
            case 3:
                Bola.runBola();
                printgaris();
                break;
            case 4:
                Tabung.runTabung();
                printgaris();
                break;
            case 5:
                Persegi.runPersegi();
                printgaris();
                break;

            case 6:
                PersegiPanjang.runPersegiPanjang();
                printgaris();
                break;

            case 7:
                Lingkaran.runLingkaran();
                printgaris();
                break;

            case 8:
                Trapesium.runTrapesium();
                printgaris();
                break;
            default:
                System.out.println("Masukkan pilihan hanya 1-8");
                break;

        }

        sc.close();
    }

    static void printgaris() {
        System.out.println("------------------------------------------");
    }

}
