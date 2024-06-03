package TP5_NO1;

class Kubus extends BangunRuang {
    double sisi;

    Kubus(double sisi){
        this.sisi = sisi;
    }

    void hitungLuas(){
        luas =6*Math.pow(sisi, 2);
    }
    void hitungVolume(){
        luas =6*Math.pow(sisi, 3);
    }
}


