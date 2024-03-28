package Praktikum.Praktikum1;
import java.util.Scanner;

public class TP1_5_H071231052 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        boolean status = false;
        int a = 0;
        int b = 0;
        int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums[i].length; j++){
                if (nums[i][j] == x) {
                    status = true;
                    a = i; b = j;
                    break;
                }
            }
        }
        if (status){
            System.out.println("Found " + x + " at [" + a + "][" + b + ']');
        } else {
            System.out.println("Angka tidak ditemukan!");
        }

        input.close();
    }
}