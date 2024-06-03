package TP01;
import java.util.Scanner;

public class TP3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String tanggal = input.nextLine();
        String[] format = tanggal.split("-");
        String hasil = format[0] + " ";
        switch(format[1]){
            case "01" : hasil += "Januari "; break;
            case "02" : hasil += "Februari "; break;
            case "03" : hasil += "Maret "; break;
            case "04" : hasil += "April "; break;
            case "05" : hasil += "Mei "; break;
            case "06" : hasil += "Juni "; break;
            case "07" : hasil += "Juli "; break;
            case "08" : hasil += "Agustus "; break;
            case "09" : hasil += "September "; break;
            case "10" : hasil += "Oktober "; break;
            case "11" : hasil += "November "; break;
            case "12" : hasil += "Desember "; break;
        }
        int tahun = Integer.valueOf(format[2]);
        if (tahun < 24){
            hasil += "20" + String.format("%02d", tahun);
        } else {
            hasil += "19" + String.format("%02d",tahun);
        }
        System.out.println(hasil);
        input.close();
    }
}