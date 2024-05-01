package Nomor2;

class Camera extends Product {
    int resolution;
    String lensType;

    Camera(String brand, String seriesNumber, double price, int resolution, String lensType, String productType) {
        super(brand, seriesNumber, price,productType);
        this.resolution = resolution;
        this.lensType = lensType;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Resolution\t\t: " + resolution);
        System.out.println("Lens Type\t\t: " + lensType);
        System.out.println("----------------------------------------------------------");
    }
}