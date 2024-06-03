package TP6_01dan02;

public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone(1000000,"Iphone" );
        Car car = new Car(100, 20, "Black");
        Pitbull pitbull = new Pitbull(3,20);

        smartphone.move();
        car.move();
        pitbull.move();
        pitbull.describe();
    }
}
