package NO2;

public class Product {
    String brand;
    String seriesNumber;
    double price;

    public Product(String brand, String seriesNumber, double price) {
        this.brand = brand;
        this.seriesNumber = seriesNumber;
        this.price = price;
    }

    void displayInfo() {
        // System.out.println("\nProduct's info:");
        System.out.println("\nBrand: " + brand);
        System.out.println("Series Number: " + seriesNumber);
        System.out.println("Price: " + price);
    }

    public String getBrand() {
        return brand;
    }

    public String getSeriesNumber() {
        return seriesNumber;
    }
}

class Smartphone extends Product {
    double screenSize;
    int storageCapacity;

    public Smartphone(String brand, String seriesNumber, double price, double screenSize, int storageCapacity) {
        super(brand, seriesNumber, price);
        this.screenSize = screenSize;
        this.storageCapacity = storageCapacity;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("Storage Capacity: " + storageCapacity + " GB");
    }

}

class Camera extends Product {
    int resolution;
    String lensType;

    public Camera(String brand, String seriesNumber, double price, int resolution, String lensType) {
        super(brand, seriesNumber, price);
        this.resolution = resolution;
        this.lensType = lensType;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Resolution: " + resolution + " MP");
        System.out.println("Lens Type: " + lensType);
    }
}

class Laptop extends Product {
    int ramSize;
    String processorType;

    public Laptop(String brand, String seriesNumber, double price, int ramSize, String processorType) {
        super(brand, seriesNumber, price);
        this.ramSize = ramSize;
        this.processorType = processorType;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("RAM: " + ramSize + " GB");
        System.out.println("Processor Type: " + processorType);
    }
}
