package Nomor1;
import java.util.Scanner;


public class BangunRuang {
   double luasPermukaan() {
        System.out.println("Menghitung luas permukaan bangun ruang");
        return 0;
    }

   double volume() {
        System.out.println("Menghitung volume bangun ruang");
        return 0;
    }
 }

 class Kubus extends BangunRuang {
   double sisi;

   public Kubus(double sisi) {
    this.sisi =sisi;
   }

   double luasPermukaan() {
        return sisi * sisi * sisi;
    }

   double volume() {
        return 6 * sisi * sisi;
    }

 }

 class Balok extends BangunRuang {
   double panjang;
   double lebar;
   
   public Balok(double panjang, double lebar, double tinggi) {
    this.panjang = panjang;
    this.lebar = lebar;
    this.tinggi = tinggi;
}

double tinggi;

   double luasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }

   double volume() {
        return panjang * lebar * tinggi;
    }
 }

 class Bola extends BangunRuang {
   double jariJari;

   public Bola(double jariJari) {
    this.jariJari = jariJari;
}

double luasPermukaan() {
        return 4 * Math.PI * jariJari * jariJari;
    }

   double volume() {
        return 4/3 * Math.PI * jariJari * jariJari *jariJari;
    }

 }

 class Tabung extends BangunRuang {
   double jariJari;
   double tinggi;

   public Tabung(double jariJari, double tinggi) {
    this.jariJari = jariJari;
    this.tinggi = tinggi;
}

   double luasPermukaan() {
        return 2 * Math.PI * jariJari * (tinggi + jariJari);
    }

   double volume() {
        return Math.PI * jariJari * jariJari * tinggi;
    }
}
