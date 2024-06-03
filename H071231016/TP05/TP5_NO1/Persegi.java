package TP5_NO1;

class Persegi extends BangunDatar {
    double sisi;

    public Persegi(double sisi){
        this.sisi = sisi;
    }

    void hitungLuas(){
        luas = sisi*sisi;
    }
}

