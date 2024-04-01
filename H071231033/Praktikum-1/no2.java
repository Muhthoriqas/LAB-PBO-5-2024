import java.util.Scanner;

public class no2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Judul Film: ");
        String judul = input.nextLine();
        System.out.println(ubahJudul(judul));
        input.close();
    }

    private static String ubahJudul(String judul) {
        StringBuilder hasil = new StringBuilder(); //lebih mudah untuk modifikasi string
        for (String kata : judul.split(" ")) {
            System.out.println(kata);
            if (!kata.isEmpty()) {
                hasil.append(Character.toUpperCase(kata.charAt(0))) //ubah huruf pertama jadi kapital
                      .append(kata.substring(1).toLowerCase()) //ubah selain huruf pertama untuk setiap kata jadi huruf kecil
                      .append(" "); //tambahkan spasi
            }
        }
        return hasil.toString(); 
    }
}