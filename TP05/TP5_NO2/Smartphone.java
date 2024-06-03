package TP5_NO2;

class Smartphone extends Product{
    private double screenSize;
    private int storageCapacity;
    
    public Smartphone(String brand, int seriesNumber, double price, double screenSize, int storageCapacity){
        super(brand, seriesNumber, price);
        this.screenSize = screenSize;
        this.storageCapacity = storageCapacity;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Screen Size: " + screenSize + " inch");
        System.out.println("Storage Capacity: "+ storageCapacity + "GB");
    }
}

