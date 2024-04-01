import java.util.Scanner;

class Cuboid{
    double height;
    double widht;
    double length;
    
    double getVolume(){
    //Lengkapi
        return height * widht * length;
    }
}
    public class no3{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Cuboid cuboid = new Cuboid();
    //Lengkapi
    cuboid.height = sc.nextDouble();
    cuboid.widht = sc.nextDouble();
    cuboid.length = sc.nextDouble();
    System.out.printf("Volume = %.2f", cuboid.getVolume());
    sc.close();
    }
}