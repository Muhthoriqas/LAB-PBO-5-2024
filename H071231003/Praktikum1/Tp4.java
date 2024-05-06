import java.util.Scanner;

/*public class Tugas1d {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try {
            System.out.print("Masukkan jari-jari lingkaran: ");
            double jariJari = inp.nextDouble();
   
            double luasLingkaran = Math.PI * Math.pow(jariJari, 2);
            System.out.printf("Luas lingkaran adalah: %.2f", luasLingkaran);
         } catch (Exception e) {
            System.out.println("Hanya menerima angka");
         }
         inp.close();
        }
}*/

public class Tp4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Masukan jari-jari lingkaran: ");
            double jariJari = input.nextDouble();

            double luas = Math.PI * jariJari * jariJari; //menghitung luas lingkaran

            System.out.printf("%.2f" , luas);
        }catch (Exception e) {
            System.out.println("Input bukan angka");
            input.close();
        }
    }
}