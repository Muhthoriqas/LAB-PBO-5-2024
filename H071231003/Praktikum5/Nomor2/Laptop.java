package Nomor2;

class Laptop extends Product {
    int ramSize;
    String processorType;

    Laptop(String brand, String seriesNumber, double price, int ramSize, String processorType, String productType) {
        super(brand, seriesNumber, price,productType);
        this.ramSize = ramSize;
        this.processorType = processorType;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Ram Size\t\t: " + ramSize);
        System.out.println("Processor Type\t\t: " + processorType);
        System.out.println("----------------------------------------------------------");
    }
}