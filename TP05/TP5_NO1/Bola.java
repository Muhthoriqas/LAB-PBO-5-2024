package TP5_NO1;

class Bola extends BangunRuang {
    double jariJari;

    public Bola(double jariJari){
        this.jariJari = jariJari;
    }

    void hitungLuas(){
        luas = 4*Math.PI *jariJari*jariJari;
    }

    void hitungVolume(){
        volume = (4/3)* Math.PI*jariJari*jariJari*jariJari;
    }
    
}
