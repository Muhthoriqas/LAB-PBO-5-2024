package BangunRuang;
import BangunDatar.Lingkaran;

public class Tabung extends Lingkaran {
    public static double tinggi;

    public static void setTinggi(double tinggi) {
        Tabung.tinggi = tinggi;
    }
    
    public static double volume() {
        return luas() * tinggi;
    }

    public static double luasPermukaan() {
        return keliling() * (jariJari + tinggi);
    }

    public static void call3() {
        System.out.printf("Volume Tabung\t\t: %.2f\n",volume());
        System.out.printf("Luas Permukaan Tabung\t: %.2f\n",luasPermukaan());
    }
}