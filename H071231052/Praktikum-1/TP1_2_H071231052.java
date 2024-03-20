package Praktikum.Praktikum1;

import java.util.Scanner;

public class TP1_2_H071231052 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Judul Film : ");
        String kalimat = input.nextLine();
        String Hasil = tittleConvert(kalimat);
        System.out.println(Hasil);
        input.close();
    }

    public static String tittleConvert(String awal) {
        String[] kata = awal.split(" ");
        String akhir = "";
        for (String s : kata) {
            String kapital = s.substring(0, 1).toUpperCase();
            String sisanya = s.substring(1).toLowerCase();
            akhir += kapital + sisanya + " ";
        }
        return akhir;
    }
}
