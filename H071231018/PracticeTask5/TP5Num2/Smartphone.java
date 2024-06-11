package TP5Num2;

public class Smartphone extends Product{
    double screenSize;
    int storageCapacity;

    public Smartphone(String brand, int seriesNumber, double price, double screenSize, int storageCapacity){
        super(brand, seriesNumber, price);
        this.screenSize = screenSize;
        this.storageCapacity = storageCapacity;
    }

    public double getScreenSize(){
        return screenSize;
    }

    public void setScreenSize(double screenSize){
        this.screenSize = screenSize;
    }

    public int getStorageCapacity(){
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity){
        this.storageCapacity = storageCapacity;
    }

    @Override
    public void displayInfo(){
        System.out.println("Daftar Produk:");
        System.out.println("Brand: " + this.getBrand());
        System.out.println("Serial Number: " + this.getSeriesNumber());
        System.out.println("Price: $" + this.getPrice());
        System.out.println("Screen Size: " + this.getScreenSize() + " inches");
        System.out.println("Storgae Capacity: " + this.getStorageCapacity() + ("GB"));
    }
}
