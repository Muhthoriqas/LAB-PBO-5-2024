package TP7Num1;

public class Projek {
    int jumlahProjek;

    Projek(){
    }

    public void Minimal4(Karyawan projekKaryawan){
        projekKaryawan.prj.jumlahProjek = 4;
    }

    public void Minimal8(Karyawan projekKaryawan){
        projekKaryawan.prj.jumlahProjek = 8;
    }
    
    public void Minimal12(Karyawan projekKaryawan){
        projekKaryawan.prj.jumlahProjek = 12;
    }
    
    public void LebihDari15(Karyawan projekKaryawan){
        projekKaryawan.prj.jumlahProjek = 15;
    }
}
