package TPNum1;

interface Device {
    void move();
}

class Smartphone implements Device{
    int price;
    String brand;

    @Override
    public void move(){
        System.out.println("Smartphone berpindah");
    }
}

class Car implements Device{
    int totalForwardGear, maxSpeed;
    String color;

    @Override
    public void move() { 
        System.out.println("Mobil sedang berakselerasi"); 
    }
}

