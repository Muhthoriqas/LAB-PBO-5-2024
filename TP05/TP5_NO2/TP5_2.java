package TP5_NO2;
import java.util.ArrayList;
import java.util.Scanner;

public class TP5_2{
    private ArrayList<Product> products = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addProduct(){
        System.out.println("Masukkan Nama Produk: ");
        String brand = scanner.nextLine();

        System.out.println("Masukkan Series Number: ");
        int seriesNumber =  scanner.nextInt();
        scanner.nextLine();

        System.out.println("Masukkan Harga: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Pilih tipe produk");
        System.out.println("1. Smartphone");
        System.out.println("2. Laptop");
        System.out.println("3. Camera");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Masukkan ukuran layar(inch): ");
                double screenSize =  scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Masukkan kapasitas penyimpanan(GB): ");
                int storageCapacity = scanner.nextInt();
                scanner.nextLine();
                products.add(new Smartphone(brand, seriesNumber, price, screenSize,storageCapacity));
                break;
            case 2:
                System.out.println("Masukkan RAM size (GB): ");
                int ramSize = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Masukkan Processor Type: ");
                String processorType= scanner.nextLine();

                products.add(new Laptop(brand, seriesNumber, price, ramSize, processorType));
                break;
            case 3:
                System.out.println("Masukkan resolusi (MP): ");
                int resolution = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Masukkan Lens Type: ");
                String lensType = scanner.nextLine();

                products.add(new Camera( brand, seriesNumber, price, resolution,  lensType));
                break;
            default:
                System.out.println("Pilihan tidak valid");
                break;

        }

    }

    public void displayInfo(){
        System.out.println("==========DAFTAR PRODUK==========");
        for (Product product: products){
            product.displayInfo();
            System.out.println();
        }
    }

    public void buyProduct(){
        System.out.println("Masukkan nomor seri produk yang ingin anda beli: ");
        int desiredSeriesNumber = scanner.nextInt();
        scanner.nextLine();

        boolean found = false;
        for (Product product : products){
            if (product.seriesNumber == desiredSeriesNumber) {
                System.out.println("Anda telah membeli produk!!!");
                product.displayInfo();
                found = true;
                break;
            }
        }

        if (!found) {
            System.err.println("----Produk dengan nomor seri tersebut tidak ditemukan.----");
        }
    }

    public static void main(String[] args) {
        TP5_2 store = new TP5_2();
        Scanner scanner = new Scanner (System.in);

        int choice;

        do{
            System.out.println("\nMenu: ");
            System.out.println("1. Tambah produk");
            System.out.println("2. Tampilkan Semua Produk");
            System.out.println("3. Beli Produk");
            System.out.println("4. Keluar");
            System.out.println(">>> Pilih menu (1-4): ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    store.addProduct();
                    break;
                case 2:
                    store.displayInfo();
                    break;
                case 3:
                    store.buyProduct();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan sistem ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak vallid.");
                    break;
            }
        } while(choice!= 4);
        
        scanner.close();
    }
}