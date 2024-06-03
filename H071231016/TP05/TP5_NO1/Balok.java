package TP5_NO1;

class Balok extends BangunRuang {
    double panjang, lebar, tinggi;

    public Balok(double panjang, double lebar, double tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    void hitungLuas(){
        luas = 2*((panjang*lebar)+(panjang*tinggi)+(lebar*tinggi));
    }
    void hitungVolume(){
        volume = panjang*lebar*tinggi;
    }
}
