package Nomor1;

public class BangunDatar{

    double luas() {
        System.out.println("Menghitung luas bangun datar");
        return 0;
    }

    double keliling() {
        System.out.println("Menghitung keliling bangun datar");
        return 0;
    }    
}

class Persegi extends BangunDatar {
    double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    double luas() {
        return sisi* sisi;
    }

    double keliling() {
        return 4* sisi;
    }
}

class PersegiPanjang extends BangunDatar {
    double panjang;
    double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    double luas() {
        return panjang * lebar;
    }

    double keliling() {
        return 2* panjang + lebar;
    }
}

class Lingkaran extends BangunDatar {
    double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    double luas() {
        return Math.PI * jariJari * jariJari;
    }

    double keliling() {
        return 2 * Math.PI * jariJari;
    }
}

class Trapesium extends BangunDatar {
    double sisiAtas;
    double sisiBawah;
    double sisiKiri;
    double sisiKanan;
    double tinggi;

    public Trapesium(double sisiAtas, double sisiBawah, double sisiKiri, double sisiKanan, double tinggi) {
        this.sisiAtas = sisiAtas;
        this.sisiBawah = sisiBawah;
        this.sisiKiri = sisiKiri;
        this.sisiKanan = sisiKanan;
        this.tinggi = tinggi;
    }

    double luas() {
        return 1/2 * (sisiAtas + sisiBawah) * tinggi;
    }

    double keliling() {
        return sisiAtas + sisiBawah + sisiKanan + sisiKiri;
    }
}