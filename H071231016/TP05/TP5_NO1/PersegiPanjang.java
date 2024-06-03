package TP5_NO1;

class PersegiPanjang extends BangunDatar{
    double panjang, lebar;

    PersegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    void hitungLuas(){
        luas = panjang*lebar;
    }
}
