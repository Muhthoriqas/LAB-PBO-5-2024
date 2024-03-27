import java.util.Scanner;

public class Tp3 {

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        String tanggal = input.nextLine();
        String [] part = tanggal.split("-");

        int day = Integer.parseInt(part[0]), month = Integer.parseInt(part[1]), tahun = Integer.parseInt(part[2]);
        String bulan = " "; //utk menyimpan nama bulan
        //mengubah format bulan
        switch (month) {
            case 1:
                bulan = "Januari";
                break;
            case 2:
                bulan = "Februari";
                break;
            case 3:
                bulan = "Maret";
                break;
            case 4:
                bulan = "April";
                break;
            case 5:
                bulan= "Mei";
                break;
            case 6:
                bulan = "Juni";
                break;
            case 7:
                bulan = "Juli";
                break;
            case 8:
                bulan = "Agustus";
                break;
            case 9:
                bulan = "September";
                break;
            case 10:
                bulan = "Oktober";
                break;
            case 11:
                bulan = "November";
                break;
            case 12:
                bulan = "Desember";
                break;
            default:
                bulan = " bulan tidak valid";
                break;
        }
    if (tahun >= 30) {
        System.out.println(day + " " + bulan + " " + (1900 + tahun));
    }else {
        System.out.println(day + " " + bulan + " " + (2000 + tahun));
    }

    }
}