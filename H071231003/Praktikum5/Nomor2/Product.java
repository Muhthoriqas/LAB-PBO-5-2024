package Nomor2;

public class Product {
    String brand;
    String seriesNumber;
    double price;
    String productType;

    Product(String brand, String seriesNumber, double price, String productType) {
        this.brand = brand;
        this.seriesNumber = seriesNumber;
        this.price = price;
        this.productType = productType;
    }

    void displayInfo() {
        System.out.println("Jenis Produk\t\t: " + productType);
        System.out.println("Brand\t\t\t: " + brand);
        System.out.println("Series Number\t\t: " + seriesNumber);
        System.out.println("Price\t\t\t: " + price);
    }
}