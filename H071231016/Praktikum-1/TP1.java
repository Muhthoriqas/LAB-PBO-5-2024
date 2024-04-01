package TP01;
import java.util.Scanner;

public class TP1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countIntegers = 0;
        int countDecimals = 0;

        try {
            int n = scanner.nextInt(); 
            for (int i = 0; i < n; i++) {
                String input = scanner.next();
                try {
                    double number = Double.parseDouble(input);
                    if (number % 1 == 0) {
                        countIntegers++;
                    } else {
                        countDecimals++;
                    }
                } catch (NumberFormatException e) {
                    
                }
                
            }

            System.out.println(countIntegers + " Bilangan Bulat");
            System.out.println(countDecimals + " Bilangan Desimal");
        } catch (NumberFormatException e) {
            System.out.println("Input harus berupa angka.");
        } finally {
            scanner.close();
        }
    }
}
