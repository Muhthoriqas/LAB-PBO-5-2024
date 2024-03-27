import java.util.Scanner;

public class Tp2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Judul Film : ");
        String judul = input.nextLine();
        System.out.println(huruf(judul)); //dipanggil utk mengembalikan hasilnya
        input.close();
    }
    static String huruf(String judul){
        judul = judul.toLowerCase();
        String[] arrString = judul.split(" "); //judul dipecah menjadi array
        for (int i = 0; i < arrString.length; i++){
            arrString[i] = Character.toUpperCase(arrString[i].charAt(0)) + arrString[i].substring(1);
        }
        String hasil = String.join(" ", arrString);
        return hasil;
    }
}