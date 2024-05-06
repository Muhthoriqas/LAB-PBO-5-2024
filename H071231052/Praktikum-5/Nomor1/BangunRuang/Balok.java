package BangunRuang;

import BangunDatar.Trapesium;

public class Balok extends Trapesium {
    public static double volume() {
        return panjang1 * lebar1 * tinggi;
    }

    public static double luasPermukaan() {
        return panjang1 * lebar1 + panjang1 * tinggi + lebar1 * tinggi;
    }

    public static void call3() {
        System.out.printf("Volume %s\t\t: %.2f\n", nama, volume());
        System.out.printf("Luas Permukaan %s\t: %.2f\n", nama, luasPermukaan());
    }
}
