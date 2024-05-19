package BangunRuang;

import java.util.Scanner;

public class Balok extends BangunRuang{
    public Balok(double panjang, double lebar, double tinggi) {
        this.setPanjang(panjang);
        this.setLebar(lebar);
        this.setTinggi(tinggi);
    }

    double hitungLuasPermukaan() {
        double luasPermukaan = 2 * ((this.getPanjang() * this.getLebar()) + (this.getPanjang() * this.getTinggi()) + (this.getLebar() * this.getTinggi()));
        return luasPermukaan;
    }

    double hitungVolume() {
        double volume = this.getPanjang() * this.getLebar() * this.getTinggi();
        return volume;
    }

    public static void runBalok() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=".repeat(16) + " BALOK " + "=".repeat(17));
        System.out.print("Masukkan panjang balok: ");
        int inPanjang = sc.nextInt();
        System.out.print("Masukkan lebar balok: ");
        int inLebar = sc.nextInt();
        System.out.print("Masukkan tinggi balok: ");
        int inTinggi = sc.nextInt();

        Balok balok = new Balok(inPanjang, inLebar, inTinggi);

        System.out.println("Luas Permukaan Balok: " + balok.hitungLuasPermukaan());
        System.out.println("Volume Balok: " + balok.hitungVolume());
        
        sc.close();
    }
}

