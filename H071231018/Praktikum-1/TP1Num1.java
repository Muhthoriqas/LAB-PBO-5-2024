package PracticeTask1;
import java.util.Scanner;

public class TP1Num1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
        System.out.print("Masukkan jumlah bilangan: ");
        int n = input.nextInt();
        
        int desimal = 0;
        int bulat = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan bilangan ke-" + (i+1) + ": ");
            double angka = input.nextDouble();
            
            if (angka == Math.floor(angka)) {
                bulat++;
            } else {
                desimal++;
            }
        }

        System.out.println(bulat + " Bilangan Bulat");
        System.out.println(desimal + " Bilangan Desimal");
        input.close();

        } catch (Exception e) {
            System.out.println("Hanya bisa menerima angka");
        }
    }
}
