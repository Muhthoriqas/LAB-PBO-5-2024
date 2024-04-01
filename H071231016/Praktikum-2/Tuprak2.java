package TP02;

class Product {
    int id;
    String name;
    int stock = 0;
    int price;

    public Product(int id, String name, int price, int stock) {
        this.id = id;
        this.stock = stock;
        this.name = name;
        this.price = price;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getHarga() {
        return price;
    }

    public void setHarga(int price) {
        this.price = price;
    }

    public String toString() {
        return "Produk"  +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stock=" + stock +
                ", price=" + price +
                '}';
    }

    public boolean isTersedia() {
        return stock > 0;
    }

}

// import java.util.Scanner;
public class Tuprak2 {
   
    public static void main(String[] args) {
        Product produk = new Product(12, "Shampo", 10000, 10);

        System.out.println("Id Produk: " + produk.getId());
        System.out.println("Name Produk: " + produk.getName());
        System.out.println("Harga Produk: " + produk.getHarga());
        System.out.println("Apakah barang tersedia ? " + produk.isTersedia());
    }
}

