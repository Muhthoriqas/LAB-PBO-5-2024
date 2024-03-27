import java.util.Scanner;

public class NO4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14;
        double r;
        try {

            System.out.print("Masukkan jari-jari lingkaran : ");
            r = sc.nextDouble();
            // r kuadrat dikali phi
            double l = (r * r) * PI;
            System.out.printf("%.2f", l);

            sc.close();
        } catch (Exception e) {
            System.err.println("Input must be numbers");
        }

    }

}
