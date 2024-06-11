package No1;

public class Main {
    public static void main(String[] args) {
        SiberianHuskky Siberian = new SiberianHuskky(7, 55);
        Siberian.move();
        Siberian.describe();

        Pitbul pitbul = new Pitbul(9, 45);
        pitbul.move();
        pitbul.describe();
        
        Smartphone oddo = new Smartphone(9700000 , "oddo ");
        oddo.move();

        Car civic = new Car(5, 220, "putih");
        civic.move();
    }
}
