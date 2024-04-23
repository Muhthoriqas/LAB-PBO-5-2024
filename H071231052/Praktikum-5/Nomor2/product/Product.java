package product;
import java.util.ArrayList;

public class Product {
    public String brand;
    public int seriesNumber;
    public double price;

    public static ArrayList<Product> daftar = new ArrayList<>(); 

    public void displayInfo() {
        System.out.println("Brand\t\t: " + brand);
        System.out.println("Series Number\t: " + seriesNumber);
        System.out.println("Price\t\t: " + price);
    }
}
