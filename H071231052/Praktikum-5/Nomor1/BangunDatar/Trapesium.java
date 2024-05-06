package BangunDatar;

public class Trapesium {
    public static String nama;
    public static double panjang1, panjang2, lebar1, lebar2, tinggi;

    public static void call() {
        System.out.printf("Luas %s\t\t: %.2f\n", nama, luas());
        System.out.printf("Keliling %s\t: %.2f\n", nama, keliling());
    }

    public static double luas() {
        return (panjang1 + panjang2) * tinggi / 2;
    }

    public static double keliling() {
        return panjang1 + panjang2 + lebar1 + lebar2;
    }

    public static void setPanjang(double panjang) {
        Trapesium.panjang1 = panjang;
        Trapesium.panjang2 = panjang;
    }

    public static void setLebar(double lebar) {
        Trapesium.lebar1 = lebar;
        Trapesium.lebar2 = lebar;
    }

    public static void setTinggi(double tinggi) {
        Trapesium.tinggi = tinggi;
    }

    public static void setNama(String nama) {
        Trapesium.nama = nama;
    }
}
