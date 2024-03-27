import java.util.Scanner;

public class NO5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            int[][] nums = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

            for (int i = 0; i <= 2; i++) {
                for (int j = 0; j <= 2; j++) {
                    if (n != nums[i][j]) {
                        continue;
                    } else {
                        int x = i;
                        int y = j;
                        System.out.println("Found " + n + " at " + "[" + x + "]" + "[" + y + "]");
                        break;

                    }
                }
            }

            sc.close();
        } catch (Exception e) {
            System.out.println("Input must be Integer");
        }
    }
}
