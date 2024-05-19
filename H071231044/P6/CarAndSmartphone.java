
public class CarAndSmartphone {
}
class Car extends CarAndSmartphone implements Move{
    int totalForwardGear, maxSpeed;
    String Color;

    public Car (int totalForwardGear, int maxSpeed, String Color){
        this.totalForwardGear = totalForwardGear;
        this.maxSpeed = maxSpeed;
        this.Color = Color;
    }

    @Override
    public void move() {
        System.out.println("Mobil sedang berakselerasi");
    }
}

class SmartPhone extends CarAndSmartphone implements Move{
    int price;
    String brand;

    public SmartPhone(int price, String brand){
        this.price = price;
        this.brand = brand;
    }

    @Override
    public void move() {
        System.out.println("Smartphone berpindah");
    }
}
