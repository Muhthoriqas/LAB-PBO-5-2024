package TP5_1.H071231071;

import java.util.Scanner;
import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        runApp();
    }

    static void runApp() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> listProduct = new ArrayList<>();
        boolean programClose = false;

        while (!programClose) {
            System.out.println("\nMenu:\n1. Tambah Produk \n2. Tampilkan Semua Produk \n3. Beli Produk \n4. Keluar");
            System.out.print(">>> Pilih menu (1-4): ");
            int menu = sc.nextInt();
            String brand;
            String seriesNumber;
            double price;
            switch (menu) {
                case 1:
                    System.out.print("Masukkan nama produk: ");
                    sc.nextLine();
                    brand = sc.nextLine();
                    System.out.print("Masukkan nomor seri: ");
                    seriesNumber = sc.nextLine();
                    System.out.print("Masukkan harga: ");
                    price = sc.nextDouble();

                    System.out.println("\nPilih tipe produk: \n1. Smartphone \n2. Laptop \n3. Camera");
                    System.out.print("Pilih tipe produk (1-3): ");
                    int pilihTipe = sc.nextInt();

                    // Product product = new Product(brand, seriesNumber, price)

                    switch (pilihTipe) {
                        case 1:
                            System.out.print("Masukkan ukuran layar (inci): ");
                            double screenSize = sc.nextDouble();
                            System.out.print("Masukkan kapasitas penyimpanan (GB): ");
                            int storageCapacity = sc.nextInt();

                            Smartphone smartphone = new Smartphone(brand, seriesNumber, price, screenSize,
                                    storageCapacity);
                            listProduct.add(smartphone);
                            // smartphone.displayInfo();
                            break;
                        case 2:
                            System.out.print("Masukkan tipe prosesor: ");
                            sc.nextLine();
                            String processorType = sc.nextLine();
                            System.out.print("Masukkan RAM: ");
                            int ramSize = sc.nextInt();

                            Laptop laptop = new Laptop(brand, seriesNumber, price, ramSize, processorType);
                            listProduct.add(laptop);
                            // laptop.displayInfo();
                            break;
                        case 3:
                            System.out.print("Masukkan tipe lensa: ");
                            String lensType = sc.next();
                            System.out.print("Masukkan resolusi: ");
                            int resolution = sc.nextInt();

                            Camera camera = new Camera(brand, seriesNumber, price, resolution, lensType);
                            listProduct.add(camera);
                            // camera.displayInfo();
                            break;

                        default:
                            break;
                    }

                    break;
                case 2:
                    System.out.println("Daftar Produk:");

                    for (Product product : listProduct) {
                        product.displayInfo();
                    }
                    break;
                case 3:
                    System.out.print("Masukkan nomor seri produk yang ingin dibeli: ");
                    String seri = sc.next();

                    boolean found = false;
                    for (Product product : listProduct) {
                        if (product.getSeriesNumber().equals(seri)) {
                            found = true;
                            System.out.println("\nAnda telah membeli produk:");
                            product.displayInfo();
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Produk dengan nomor seri tersebut tidak ditemukan");
                    }
                    break;
                case 4:
                    programClose = true;

                    System.out.println("Terima kasih telah menggunakan layanan kami. Sampai Jumpa!!!");

                default:
                    System.out.println("Masukkan inputan angka 1-4 :)");
                    break;
            }

        }

    }

}
