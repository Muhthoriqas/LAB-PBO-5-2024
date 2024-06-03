package TP5_NO1;

class Tabung extends BangunRuang {
   double jariJari,tinggi;
   
   public Tabung(double jariJari, double tinggi){
    this.jariJari = jariJari;
    this.tinggi = tinggi;
   }

   void hitungLuas(){
    luas = 2 * Math.PI * jariJari *(jariJari+tinggi);
   }

   void hitungVolume(){
    volume =Math.PI * jariJari * jariJari * tinggi;
   }
}
