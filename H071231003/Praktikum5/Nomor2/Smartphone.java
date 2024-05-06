package Nomor2;

class Smartphone extends Product {
    double screenSize;
    int storageCapacity;

    Smartphone(String brand, String seriesNumber, double price, double screenSize, int storageCapacity, String productType) {
        super(brand, seriesNumber, price,productType);
        this.screenSize = screenSize;
        this.storageCapacity = storageCapacity;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Screen Size\t\t: " + screenSize);
        System.out.println("Storage Capacity\t: " + storageCapacity);
        System.out.println("----------------------------------------------------------");
    }
}