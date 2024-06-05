package Nomor1;

import java.util.Scanner;

public abstract class Kehidupan extends Karyawan {
    int nilai = 1;
    static Scanner ip = new Scanner(System.in);

    public Kehidupan (String nama, int gaji){
        super(nama, gaji);
    }

    public Kehidupan(){

    }

    public abstract void  prosesKehidupan();

    public int getNilai(){
        return nilai;

    }


}