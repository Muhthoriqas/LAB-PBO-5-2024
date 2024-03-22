package P1;
import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        String input = new String();

        try {
            System.out.println("Masukan Hasil Text yang Ingin Di konversi: ");
            input = p.nextLine();
        } catch (Exception e) {
            System.out.println("Text Tidak Valid!");
        }
        System.out.println(Konversi(input));
        p.close();

    }
    public static String Konversi(String input) {
        input = input.toLowerCase();
        char[] Array = input.toCharArray();

        for (int i = 0; i < Array.length ; i++) {

            if(i == 0 || Array[i-1] == ' '){

                Array[i] = Character.toUpperCase(Array[i]);
            }
        }
        String Fix = new String(Array);
        return Fix;
    }
}
