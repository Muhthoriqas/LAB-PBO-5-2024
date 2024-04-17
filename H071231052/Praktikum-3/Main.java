package Praktikum.Praktikum3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ResepRahasia resJawa = new ResepRahasia("nuklir", "atom", "sianida");
        Warteg jawa = new Warteg("Jawa", 200000, resJawa);

        ResepRahasia resSunda = new ResepRahasia("air", "api", "tanah");
        Warteg sunda = new Warteg("Sunda", 250000, resSunda);

        jawa.showInfo();
        jawa.skipBulan(5);
        jawa.sewaPenglaris(1);
        jawa.showInfo();
        jawa.rejekiSeret(sunda);
        sunda.rejekiSeret(jawa);
        jawa.showInfo();
        jawa.hidupAtauMati(sunda);
        jawa.showInfo();

        scan.close();
    }
}
