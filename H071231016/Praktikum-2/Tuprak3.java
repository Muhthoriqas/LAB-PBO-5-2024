package TP02;
class Cuboid{
    double height;
    double width;
    double length;
    
    double getVolume(){
         return height * width * length;
    }
}
    
public class Tuprak3 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.height = 10.0;
        cuboid.width = 15.0;
        cuboid.length = 30.0;
        System.out.println(String.format("Volume = %.2f", cuboid.getVolume()));
    }
}   

