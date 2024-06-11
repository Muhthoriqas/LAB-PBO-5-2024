import java.util.Scanner;

public class no5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int target = input.nextInt();
        int[][] nums = {{1,2,3}, {4,5,6}, {7,8,9}};
        boolean dapat = false;

        for (int i = 0; i < nums.length && !dapat; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] == target) {
                    System.out.println("Found " + target + " at [" + i + "][" + j + ']');
                    dapat = true; 
                    break; 
                }
            }
        }

        if (!dapat) {
            System.out.println(target + " tidak ada di array.");
        }

        input.close();
    }
}