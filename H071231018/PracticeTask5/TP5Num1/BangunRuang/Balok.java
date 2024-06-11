package TP5Num1.BangunRuang;

import java.util.Scanner;

public class Balok extends BangunRuang{
    public Balok(double panjang, double lebar, double tinggi){
        this.setPanjang(panjang);
        this.setLebar(lebar);
        this.setTinggi(tinggi);
    }

    @Override
    double HitungLuasPermukaan(){
        return 2 * ((this.getPanjang() * this.getLebar()) + (this.getLebar() * this.getTinggi()) + (this.getPanjang() * this.getTinggi()));
    }

    @Override
    double HitungVolume(){
        return  this.getPanjang() * this.getLebar() * this.getTinggi();
    }

    public static void runBalok(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi balok: ");
        int panBal = sc.nextInt();
        System.out.print("Masukkan lebar sisi balok: ");
        int lebBal = sc.nextInt();
        System.out.print("Masukkan tinggi sisi balok: ");
        int tinBal =  sc.nextInt();
        Balok balok = new Balok(panBal, lebBal, tinBal);
        System.out.println("Luas permukaan balok: " + balok.HitungLuasPermukaan());
        System.out.println("Volume balok: " + balok.HitungVolume());

        sc.close();
    }
}
