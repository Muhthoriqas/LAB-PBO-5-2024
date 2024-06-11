package TPNum1;

public class Main {
    public static void main(String[] args) {
        Smartphone sp = new Smartphone();
        Car car = new Car();
        SiberianHusky sh = new SiberianHusky();
        sh.describe();
        System.out.println("-".repeat(75));
        sh.move();
        System.out.println("-".repeat(75));
        car.move();
        System.out.println("-".repeat(75));
        sp.move();
    }
}
