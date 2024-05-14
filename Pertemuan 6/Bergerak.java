public interface Bergerak {
    void move();
}

class Smartphone implements Bergerak {
    int price;
    String brand;

    public void move() {
        System.out.println("Smartphone berpindah");
    }
}

class Car implements Bergerak {
    int totalForwardGear, maxSpeed;
    String color;
    
    public void move() {
        System.out.println("Mobil sedang berakselerasi");
    }
}

class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        Car car = new Car();

        smartphone.move();
        car.move();
    }
}
