package TP5_NO2;

class Product{
    protected String brand;
    protected int seriesNumber;
    protected double price;

    Product(String brand, int seriesNumber, double price){
        this.brand = brand;
        this.seriesNumber = seriesNumber;
        this.price = price;

    }

    void displayInfo(){
        System.out.println("Ini display Info: ");
        System.out.println("brand: "+ brand);
        System.out.println("Series Number: "+ seriesNumber);
        System.out.println("Price: $" +price);

    }
}
