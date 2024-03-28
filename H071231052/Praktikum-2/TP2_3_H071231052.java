package Praktikum.Praktikum2;

class Cuboid{
    double height;
    double width;
    double length;

    double getVolume(){
        return height*width*length;
    }
}

public class TP2_3_H071231052{
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.height = 18;
        cuboid.width = 25;
        cuboid.length = 10;
        System.out.printf("Volume = %.2f", cuboid.getVolume());
    }
}