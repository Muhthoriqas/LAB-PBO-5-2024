package TP6_01dan02;

public class Smartphone implements IMove {
    int price;
    String brand;

    Smartphone(int price, String brand){
        this.price = price;
        this.brand = brand;
    }
    public void move(){
        System.out.println("Smartphone berpindah.");
    }
}
