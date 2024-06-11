package No1;

public class Car implements Perpindahan {
    int totalFowardGear, maxSpeed;
    String warna;

    public Car(int totalFowardGear, int maxSpeed, String warna){
        this.totalFowardGear = totalFowardGear;
        this.maxSpeed = maxSpeed;
        this.warna = warna;
    }

    @Override
    public void move() {
        System.out.println("Mobil civic " + warna + " sedang menuju kecepatan maksimum " + maxSpeed + " km/jam dengan transmisi maju gigi " + totalFowardGear + ".");
        System.out.println();
    }
}
