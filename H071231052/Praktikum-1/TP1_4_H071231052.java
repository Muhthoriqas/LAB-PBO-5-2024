package Praktikum.Praktikum1;
import java.util.Scanner;

public class TP1_4_H071231052 {
    public static void main(String[] args) {
        System.out.print("Masukkan jari-jari lingkaran : ");
        Scanner input = new Scanner(System.in);
        double jari = input.nextInt();
        double hasil = 3.14 * jari * jari;
        System.out.printf("%.3f", hasil);
        input.close();
    }
}