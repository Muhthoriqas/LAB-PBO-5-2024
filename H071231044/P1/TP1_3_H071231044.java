package P1;

import java.util.Scanner;

public class T3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Tanggal : ");
        String tanggal = input.nextLine();
        cekTanggal(tanggal);
        input.close();
    }

    public static void cekTanggal(String tanggal){
        String hasil = "";
        String[] x = tanggal.split("-");

        int tahun = Integer.parseInt(x[2]);
        boolean kabisat = false;
        String Tahuns = "";
        if (tahun > 24) {
            Tahuns += ("19" + tahun) ;
        }
        else if (tahun <= 24 && tahun >= 00) {
            if (tahun < 10) {
                Tahuns += ("20" + "0"+tahun) ;
            }
            else{
                Tahuns += ("20" + tahun) ;
            }
        }
        int tahun3 = Integer.parseInt(Tahuns);

        if (tahun3 %4 ==0) {
            if (tahun3 %100 == 0) {
                if (tahun3 %400 == 0) {
                    kabisat = true;
                }
                else{
                    kabisat = false;
                }
            }
            else{
                kabisat = true;
            }
        }
        else{
            kabisat = false;
        }

        int hari = Integer.parseInt(x[0]);
        int bulan = Integer.parseInt(x[1]);

        String daftarBulan[] =  new String[]{" Januari ", " Februari ", " Maret ", " April ", " Mei ", " Juni ", " Juli ", " Agustus ", " September ", " Oktober ", " November ", " Desember "};

        if (!kabisat) {
            if (hari > 28  && bulan == 2) {
                System.out.println("Tanggal " + hari + " pada bulan Februari tahun " + tahun3 + " tidak ada kerena bukan tahun kabisat");
                System.exit(1);
            }
        }
        if (hari > 31 ){
            System.out.println("Tanggal " + hari + " pada bulan" + daftarBulan[bulan-1] + "tahun " + tahun3 + " tidak ada kerena melewati batas");
            System.exit(1);
        }

        if (hari > 30){
            if (bulan == 4 || bulan == 6 || bulan == 9 || bulan == 11){
            System.out.println("Tanggal " + hari + " pada bulan" + daftarBulan[bulan-1] + "tahun " + tahun3 + " tidak ada kerena melewati batas");
            System.exit(1);
            }
        }
        if (bulan == 0){
            System.out.println("Tidak ada bulan 0!");
            System.exit(1);
        }

        hasil += hari;
        hasil += daftarBulan[bulan-1];
        hasil += (tahun3);
        
        System.out.println(hasil);
    }
}