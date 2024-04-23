package BangunRuang;
import BangunDatar.Lingkaran;

public class Bola extends Lingkaran{
    public static double luasPermukaan() {
        return 4 * luas();
    }

    public static double volume() {
        return 4 * luas() * jariJari / 3;
    }

    public static void call3() {
        System.out.printf("Volume Bola\t\t: %.2f",volume());
        System.out.printf("Luas Permukaan Bola\t\t: %.2f",luasPermukaan());
    }
}
