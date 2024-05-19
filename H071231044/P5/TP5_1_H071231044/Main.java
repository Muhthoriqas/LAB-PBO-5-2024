
import java.util.*;
import BangunDatar.Lingkaran;
import BangunDatar.Persegi;
import BangunDatar.PersegiPanjang;
import BangunDatar.Trapesium;
import BangunRuang.Balok;
import BangunRuang.Bola;
import BangunRuang.Kubus;
import BangunRuang.Tabung;



public class Main {
    public static void main(String[] args) {
        runApp();
    }

    private static void runApp(){
        Scanner sc = new Scanner(System.in);

        Line();
        System.out.println("   ===== BANGUN RUANG =====   ");
        System.out.println("1. KUBUS \n2. BALOK \n3. BOLA \n4. TABUNG \n");
        System.out.println("   ===== BANGUN DATAR =====   ");
        System.out.println("5. PERSEGI \n6. PERSEGI PANJANG \n7. LINGKARAN \n8. TRAPESIUM");
        Line();
        System.out.print("Pilihan: ");
        int inPilihan = sc.nextInt();
        Line();
        switch (inPilihan) {
            case 1:
                Kubus.runKubus();
                Line();
                break;
            case 2:
                Balok.runBalok();
                Line();
                break;
            case 3:
                Bola.runBola();
                Line();
                break;
            case 4:
                Tabung.runTabung();
                Line();
                break;
            case 5:
                Persegi.runPersegi();
                Line();
                break;
            case 6:
                PersegiPanjang.runPersegiPanjang();
                Line();
                break;
            case 7:
                Lingkaran.runLingkaran();
                Line();
                break;
            case 8:
                Trapesium.runTrapesium();
                Line();
                break;
            default:
                
                runApp();
        }

        sc.close();
    }

    private static void Line() {
        System.out.println("-".repeat(70));
    }
}
