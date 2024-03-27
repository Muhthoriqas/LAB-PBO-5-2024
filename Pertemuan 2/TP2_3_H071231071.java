import java.util.Scanner;

class Cuboid {
    double height;
    double widht;
    double length;

    double getVolume() {
        return height * length * widht;
    }

}

public class TP2_3_H071231071 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();

        Scanner sc = new Scanner(System.in);
        double h, w, l;
        System.out.print("Masukkan tinggi  : "); // masukkan 16.50964 jika ingin volumennya 4500
        h = sc.nextDouble();
        System.out.print("Masukkan lebar   : ");
        w = sc.nextDouble();
        System.out.print("Masukkan panjang : ");
        l = sc.nextDouble();

        sc.close();

        cuboid.height = h;
        cuboid.widht = w;
        cuboid.length = l;

        System.out.printf("Volume = %.2f", cuboid.getVolume());

    }
}
