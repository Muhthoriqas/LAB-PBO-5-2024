package Nomor1;

import java.util.Scanner;

public class Main {
        public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Menu();
        int pilihan = input.nextInt();
        input.nextLine();
        batas();
        if (pilihan > 0 && pilihan < 5){
            switch (pilihan) {
                case 1:
                    Kubus kubus = new Kubus();
                    System.out.print("Masukkan sisi : ");
                    kubus.sisi = input.nextDouble();
                    kubus.Luas();
                    kubus.Volume();
                    System.out.println("Luas Persegi : " + kubus.luas);
                    System.out.println("Volume Persegi : " + kubus.volume);
                    break;
                case 2:
                    Balok balok = new Balok();
                    System.out.print("Masukkan Panjang : ");
                    balok.panjang = input.nextDouble();
                    System.out.print("Masukkan Lebar : ");
                    balok.lebar   = input.nextDouble();
                    System.out.print("Masukkan Tinggi : ");
                    balok.tinggi  = input.nextDouble();
                    balok.Luas();
                    balok.Volume();
                    System.out.println("Luas Balok : " + balok.luas);
                    System.out.println("Volume Balok : " + balok.volume);
                    break;
                case 3:
                    Bola bola = new Bola();
                    System.out.print("Masukkan Jari-jari : ");
                    bola.jariJari = input.nextDouble();
                    bola.Luas();
                    bola.Volume();
                    System.out.println("Luas Bola : " + bola.luas);
                    System.out.println("Volume Bola : " + bola.volume);
                    break;
                case 4:
                    Tabung tabung = new Tabung();
                    System.out.print("Masukkan Jari-jari : ");
                    tabung.jariJari = input.nextDouble();
                    System.out.print("Masukkan Tinggi : ");
                    tabung.tinggi = input.nextDouble();
                    tabung.Luas();
                    tabung.Volume();
                    System.out.println("Luas Tabung : "+ tabung.luas);
                    System.out.println("Volume Tabung : " + tabung.volume);
                    break;
            }   
        } else if (pilihan > 4 && pilihan < 9){
            switch (pilihan){
                case 5:
                    Persegi persegi = new Persegi();
                    System.out.print("Masukkan Sisi : ");
                    persegi.sisi = input.nextDouble();
                    persegi.Luas();
                    persegi.Keliling();
                    System.out.println("Luas Persegi : " + persegi.luas);
                    System.out.println("Keliling Persegi : " + persegi.keliling);
                    break;
                case 6:
                    PersegiPanjang persegiPanjang = new PersegiPanjang();
                    System.out.print("Masukkan Panjang : ");
                    persegiPanjang.panjang = input.nextDouble();
                    System.out.print("Masukkan Lebar : ");
                    persegiPanjang.lebar = input.nextDouble();
                    persegiPanjang.Keliling();
                    persegiPanjang.Luas();
                    System.out.println("Luas Persegi Panjang : " + persegiPanjang.luas);
                    System.out.println("Keliling Persegi Panjang : " + persegiPanjang.keliling);
                    break;
                case 7:
                    Lingkaran lingkaran = new Lingkaran();
                    System.out.print("Masukkan Jari-jari : ");
                    lingkaran.jariJari = input.nextDouble();
                    lingkaran.Luas();
                    lingkaran.Keliling();
                    System.out.println("Luas Lingkaran : " + lingkaran.luas);
                    System.out.println("Keliling Lingkaran : " + lingkaran.keliling);
                    break;
                case 8:
                    Trapesium trapesium = new Trapesium();
                    System.out.print("Masukkan sisi 1 : ");
                    trapesium.a = input.nextDouble();
                    System.out.print("Masukkan sisi 2 : ");
                    trapesium.b = input.nextDouble();
                    System.out.print("Masukkan sisi 3 : ");
                    trapesium.c = input.nextDouble();
                    System.out.print("Masukkan sisi 4 : ");
                    trapesium.d = input.nextDouble();
                    System.out.print("Masukkan Tinggi : ");
                    trapesium.tinggi = input.nextDouble();
                    trapesium.Luas();
                    trapesium.Keliling();
                    System.out.println("Luas Trapesium : " + trapesium.luas);
                    System.out.println("Keliling Trapesium : " + trapesium.keliling);
                    break;
            }
        }else {
            System.out.println("Pilihan Tidak Valid");
        }
        batas();
        input.close();
    }

    public static void batas(){
        System.out.println("------------------------------");
    }

    public static void Menu(){
        batas();
        System.out.println("    === BANGUN RUANG ===   ");
        System.out.println("1. KUBUS\n2. BALOK\n3. BOLA\n4. TABUNG");
        System.out.println("    === BANGUN DATAR ===   ");
        System.out.println("5. PERSEGI\n6. PERSEGI PANJANG\n7. LINGKARAN\n8. TRAPESIUM");
        batas();
        System.out.print("Pilihan : ");
    }
}
