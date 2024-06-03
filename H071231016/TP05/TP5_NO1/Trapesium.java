package TP5_NO1;

class Trapesium extends BangunDatar {
    double sisi1, sisi2, sisi3, sisi4;
    double tinggi;
    
    Trapesium(double sisi1, double sisi2, double sisi3, double sisi4, double tinggi){
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
        this.sisi4 = sisi4; 
        this.tinggi = tinggi;   
    }

    void hitungLuas(){
        double setengahAlas = (sisi1 + sisi2) / 2;
        double luasTrapesium = setengahAlas * tinggi;
        System.out.println("Luas Trapesium: "+ luasTrapesium);
    }
    void hitungKeliling(){
        double keliling = sisi1 + sisi2 + sisi3 + sisi4;
        System.out.println("Keliling Trapesium: " + keliling);
    }
}
