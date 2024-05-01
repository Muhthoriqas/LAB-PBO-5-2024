public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone(1000000, "nokia");

        Car car = new Car(200, "Black", 200);

        Pitbull pitbull = new Pitbull(2, 70);

        System.out.println("---------------------------------------------------------------------------------------------");
        pitbull.move();
        pitbull.describe();
        System.out.println("---------------------------------------------------------------------------------------------");
        smartphone.move();
        System.out.println("---------------------------------------------------------------------------------------------");
        car.move();
        System.out.println("---------------------------------------------------------------------------------------------");
    }
}