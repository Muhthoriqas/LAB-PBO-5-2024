import java.util.Scanner;

public class NO3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String[] array1 = input.split("-");

        int[] array2 = new int[3];
        for (int i = 0; i < array1.length; i++) {
            array2[i] = Integer.parseInt(array1[i]);

        }

        int tahun1 = array2[2];
        String tahun2 = "";

        if (tahun1 >= 0 && tahun1 < 30) {
            tahun2 = "20" + array1[2];
        } else {
            tahun2 = "19" + array1[2];
        }

        System.out.println(array2[0] + " " + KonversiBulan(array2[1]) + " " + tahun2);
        sc.close();

    }

    public static String KonversiBulan(int angka) {
        if (angka == 1) {
            return "Januari";
        } else if (angka == 2) {
            return "Februari";
        } else if (angka == 3) {
            return "Maret";
        } else if (angka == 4) {
            return "April";
        } else if (angka == 5) {
            return "Mei";
        } else if (angka == 6) {
            return "Juni";
        } else if (angka == 7) {
            return "Juli";
        } else if (angka == 8) {
            return "Agustus";
        } else if (angka == 9) {
            return "September";
        } else if (angka == 10) {
            return "Oktober";
        } else if (angka == 11) {
            return "November";
        } else if (angka == 12) {
            return "Desember";
        } else {
            return "";
        }

    }

}
