package Praktikum.Praktikum1;

import java.util.Scanner;

public class TP1_1_H071231052 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            int loop = input.nextInt();
            if (loop < 1){
                System.out.println("Bilangan harus lebih besar dari 0 ");
                input.close();
                return;
            }
            int Bulat = 0;
            int Desimal = 0;
            for (int i = 0; i < loop; i++) {
                try {
                    int x = input.nextInt();
                    Bulat++;
                } catch (Exception e) {
                    float f = input.nextFloat();
                    Desimal++;
                }
            }
            System.out.println(Bulat + " Bilangan Bulat");
            System.out.println(Desimal + " Bilangan Desimal");
            input.close();
        } catch (Exception e) {
            System.out.println("Masukkan Angka!");
        } finally {
            System.out.println("\n======== Program End ========");
        }
    }
}