package TP6_01dan02;

public class Car implements IMove {
    int totalForwardGear, maxSpeed;
    String color;

    Car(int totalForwardGear, int maxSpeed, String color){
        this.totalForwardGear = totalForwardGear;
        this.maxSpeed =maxSpeed;
        this.color = color;
    }
    public void move(){
        System.out.println("Car sedang berakselerasi.");
    }
}