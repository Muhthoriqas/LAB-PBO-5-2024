
public class TP6_2_H071231044 {
    public static void main(String[] args) {
        SiberianHusky puppy = new SiberianHusky();
        Car car = new Car(50, 200, "Coklat");
        SmartPhone poco = new SmartPhone(5000000, "Poco");

        puppy.move();
        puppy.describe();

        System.out.println("\nPrice : " + poco.price);
        System.out.println("Brand : " + poco.brand);
        poco.move();

        System.out.println();
        car.move();
        System.out.println("Total Forward Gear : " + car.totalForwardGear);
        System.out.println("Max Speed          : " + car.maxSpeed);
        System.out.println("Color              : " + car.Color + "\n");

    }
    
    
}
