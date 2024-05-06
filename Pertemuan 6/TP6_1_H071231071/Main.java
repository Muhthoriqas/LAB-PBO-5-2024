public class Main {
    public static void main(String[] args) {
        SiberianHusky siberianHusky = new SiberianHusky(50);
        Smartphone smartphone = new Smartphone(15000000, "Iphone 13");
        Car car = new Car(6, "Red Wine", 250);

        siberianHusky.move();
        System.out.println("\nDeskripsi:");
        siberianHusky.describe();

        System.out.println();
        System.out.println("Brand: " + smartphone.brand);
        System.out.println("Price: Rp." + smartphone.price);
        smartphone.move();

        System.out.println();
        car.move();
        System.out.println("Total Forward Gear: " + car.totalForwardGear);
        System.out.println("Color: " + car.color);
        System.out.printf("Max Speed: %d km/h", car.maxSpeed);
    }

}
