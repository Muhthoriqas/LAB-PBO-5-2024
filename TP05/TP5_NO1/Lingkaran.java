package TP5_NO1;

class Lingkaran extends BangunDatar {
    double jariJari;

    Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    void hitungLuas (){
        luas = 3.14 * jariJari * jariJari;
    }
}

