package TP5_2_H071231044;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.HashSet;

public class Main {
    //mendeklarasikan dan menginisialisasi listProduct yang merupakan ArrayList dari objek Product
    private static ArrayList<Product> listProduct = new ArrayList<>();
    //Pengunaan metode HashSet untuk mencegah nama  produk yang sama di dalam list
    private static HashSet<String> brands = new HashSet<String>();
    private static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        runMenu();
    }

    private static void runMenu(){
        System.out.println("\nMenu:");
        System.out.println("1. Tambah Produk");
        System.out.println("2. Tampilkan Semua Produk");
        System.out.println("3. Beli Produk");
        System.out.println("4. Keluar");

        
        System.out.print("\n>>> Pilih menu (1-4): ");
        int option = 0;
        try {
            option = scan.nextInt();
            scan.nextLine();
        } catch (InputMismatchException e) {
            System.out.println(e + "Diluar Pilihan!");
        }

        switch (option) {
            case 1:
                inputProduct();
                break;
            case 2:
                //Untuk setiap product dalam ListProduct lakukan cetak dengan product
                for (Product product : listProduct){
                    System.out.println("Daftar Produk:");
                    product.displayInfo();
                }
                runMenu();
                break;
            case 3:
                beliProduk();
                runMenu();
                break;
            case 4:
                System.out.println("Terima kasih telah menggunakan layanan kami. Sampai jumpa!");
                break;
            default:
                System.out.println("Pilihan diluar opsi! Silahkan pilih kembali");
                runMenu();
                break;
        }
    }

    public static void inputProduct(){
        System.out.print("Masukkan nama produk: ");
        String brand = scan.nextLine();

        //Mengecek apakah merek sudah ada di HashSet
        //Pengunaan metode contains berguna untuk memeriksa elemen apakah sudah dalam HashSet
        if (brands.contains(brand)){
        System.out.print("Nama produk sudah dimasukkan");
        runMenu();
        } else {
            //Menambahkan merek ke HashSet
            brands.add(brand);

            System.out.print("Masukkan nomor seri: ");
            int series = scan.nextInt();
            System.out.print("Masukkan harga: ");
            double price = scan.nextDouble();
            tipeProduct(brand, series, price);
            
        }
    }

    public static void tipeProduct(String brand, int series, double price){
        System.out.println("Pilih tipe produk:");
        System.out.println("1. Smartphone");
        System.out.println("2. Laptop");
        System.out.println("3. Camera");
        System.out.print("Pilih tipe produk (1-3): ");
        int tipe = 0;
        tipe  = scan.nextInt();
        switch (tipe) {
            case 1:
                System.out.print("Masukkan ukuran layar (inci): ");
                double  screenSize = scan.nextDouble();
                System.out.print("Masukkan kapasitas penyimpanan (GB): ");
                int storageCapacity = scan.nextInt();
                Smartphone newsSmartphone = new Smartphone(brand, series, price, screenSize, storageCapacity);
                listProduct.add(newsSmartphone);
                break;
            case 2:
                System.out.print("Masukkan RAM Size: ");
                int ramSize = scan.nextInt();
                scan.nextLine();  // consume the newline
                System.out.print("Masukkan jenis processor: ");
                String processorType = scan.nextLine();
                Laptop newLaptop = new Laptop(brand,series, price, ramSize, processorType);
                listProduct.add(newLaptop);
                break;
            case 3:
                System.out.print("Masukkan resolusi: ");
                int resolution = scan.nextInt();
                scan.nextLine();  // consume the newline
                System.out.print("Masukkan tipe lensa: ");
                String lensType = scan.nextLine();
                Camera newCamera = new Camera(brand, series, price, resolution, lensType);
                listProduct.add(newCamera);
                break;
            default :
                System.out.println("Pilihan diluar opsi! Silahkan pilih kembali");
                break;
        }
        runMenu();
    }

    public static void beliProduk(){
        System.out.print("Masukkan nomor seri produk yang ingin dibeli: ");
        int series = scan.nextInt();
        scan.nextLine();

        /*
        Untuk mengecek apakah ada nomor seri yang sama
        pada  daftar product sesuai inputan user
        */
        for (Product product : listProduct) {
            if (product.getSeriesNumber() == series) {
                product.displayInfo();
                System.out.println("\nPembelian berhasil!");
                return;
            }
        }
    
        System.out.println("Produk dengan nomor seri tersebut tidak ditemukan");
        runMenu();
    }


    //GETTER AND SETTER
    public static ArrayList<Product> getListProduct() {
        return listProduct;
    }

    public static void setListProduct(ArrayList<Product> listProduct) {
        Main.listProduct = listProduct;
    }

    public static HashSet<String> getBrands() {
        return brands;
    }

    public static void setBrands(HashSet<String> brands) {
        Main.brands = brands;
    }

}
