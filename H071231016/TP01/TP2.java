package TP01;

import java.util.Scanner;

public class TP2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan Judul Film:");
        String input = scanner.nextLine();

        String output = kapital(input);
        System.out.println(output);

        scanner.close();
    }

    public static String kapital(String input) {
        String[] words = input.split(" ");

        StringBuilder result = new StringBuilder();

        // Loop melalui setiap kata
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1).toLowerCase());
            }
            result.append(" "); 
        }

        return result.toString();
    }
}
