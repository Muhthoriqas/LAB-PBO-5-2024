public class TP2_3_H071231087 {
    public static void main(String[] args){
        Cuboid cuboid = new Cuboid();
        cuboid.height = 3;
        cuboid.width = 30;
        cuboid.length = 50;
        System.out.printf("Volume  = %.2f", cuboid.getVolume());
    }

}
class Cuboid{
        double height;
        double width;
        double length;
        
        double getVolume(){
            return height * width * length;
        }
    }
