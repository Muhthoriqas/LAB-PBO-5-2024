import java.util.Scanner;

class Cuboid {
    double height;
    double width;
    double length;

    double getVolume(){
        return height * width * length;
    }
}

public class TP2_3_H071231044 {
    public static void main(String[] args) {
        Scanner size = new Scanner(System.in);
        Cuboid cuboid = new Cuboid();

        System.out.print("Tinggi  : ");
        double height = size.nextDouble();
        System.out.print("Lebar   : ");
        double width = size.nextDouble();
        System.out.print("Panjang : ");
        double length = size.nextDouble();
        size.close();

        cuboid.height = height;
        cuboid.width = width;
        cuboid.length = length;
        
        System.out.printf("Volume = %.2f", cuboid.getVolume());
    }
}