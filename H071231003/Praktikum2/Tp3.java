class Cuboid {
    double height;
    double widht;
    double lenght;

    double getVolume(){
        return height * widht * lenght;
    }
}


public class Tp3{
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.height = 15;
        cuboid.widht = 10;
        cuboid.lenght = 30;
        System.out.printf("Volume = %.2f", cuboid.getVolume());
    }
}