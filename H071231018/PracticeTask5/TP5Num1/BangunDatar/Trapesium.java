package TP5Num1.BangunDatar;

import  java.util.Scanner;

public class Trapesium extends BangunDatar{
    double sisi2, sisi3, sisi4;

    public double getSisi2(){
        return sisi2;
    }

    public void setSisi2(double sisi2){
        this.sisi2 = sisi2;
    }

    public double getSisi3(){
        return sisi3;
    }

    public void setSisi3(double sisi3){
        this.sisi3 = sisi3;
    }

    public double getSisi4(){
        return sisi4;
    }

    public void setSisi4(double sisi4){
        this.sisi4 = sisi4;
    }

    public Trapesium(double sisi, double sisi2, double sisi3, double sisi4, double tinggi){
        this.setSisi(sisi);
        this.setSisi2(sisi2);
        this.setSisi3(sisi3);
        this.setSisi4(sisi4);
        this.setTinggi(tinggi);
    }

    @Override
    double HitungLuas(){
        return  0.5* (this.getSisi() + this.getSisi3()) * this.getTinggi();
    }

    @Override
    double HitungKeliling(){
        return this.getSisi() + this.getSisi2() + this.getSisi3() + this.getSisi4();
    }

    public static void runTrapesium(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sisi 1 trapesium: ");
        int inpT = sc.nextInt();
        System.out.print("Masukkan sisi 2 trapesium: ");
        int inpT2 = sc.nextInt();
        System.out.print("Masukkan sisi 3 trapesium: ");
        int inpT3 = sc.nextInt();
        System.out.print("Masukkan sisi 4 trapesium: ");
        int inpT4 = sc.nextInt();
        System.out.print("Masukkan tinggi trapesium: ");
        int inpTinggiT = sc.nextInt();
        Trapesium T = new Trapesium(inpT, inpT2, inpT3, inpT4, inpTinggiT);
        System.out.println("-".repeat(20));
        System.out.println("Luas trapesium: " + T.HitungLuas());
        System.out.println("Keliling trapesium: " + T.HitungKeliling());

        sc.close();
    }
}
