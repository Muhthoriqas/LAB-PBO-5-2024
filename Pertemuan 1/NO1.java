import java.util.Scanner;

public class NO1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();

            double[] inputan = new double[n];

            for (int i = 0; i < n; i++) {
                inputan[i] = sc.nextDouble();

            }

            int bulat = 0;
            int desimal = 0;
            for (double x : inputan) {
                if (x == (int) x) {
                    bulat++;
                } else {
                    desimal++;
                }

            }

            System.out.println(bulat + " bilangan bulat.");
            System.out.println(desimal + " bilangan desimal.");

            sc.close();
        } catch (Exception e) {
            System.err.println("Input must be numbers");
        } // finally {
          // System.out.println("Successful input ");
          // }

    }

}
