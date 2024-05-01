package Nomor2;
import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Product> product = new ArrayList<>();

    public static void displayMenu() {
        System.out.println("\n========================== MENU ==========================");
        System.out.println("1. Tambah Produk\n2. Tampilkan Semua Produk\n3. Beli Produk\n4. Keluar");
    }

    public static int pilihanUser() {
        int choice;
        try {
            System.out.print("\n>>> Pilih Menu\t: ");
            choice = sc.nextInt();
            sc.nextLine();
        } catch (Exception e) {
            System.out.println("Pilihan input hanya 1-4...");
            choice = -1;
        }
        return choice;
    }

    public static void addProduct() {
        System.out.println("===================== Tambah Produk ======================");
        System.out.print("Masukkan Nama Produk  : ");
        String brand = sc.nextLine();
        System.out.print("Masukkan Nomor Seri   : ");
        String seriesNumber = sc.nextLine();
        System.out.print("Masukkan Harga        : ");
        double price = sc.nextDouble();
        sc.nextLine();

        int productType;
        do {
            System.out.println("==================== Pilih Tipe Produk ===================");
            System.out.println("1. Smartphone\n2. Camera\n3. Laptop");
            System.out.print("Pilih tipe produk : ");
            productType = sc.nextInt();
            sc.nextLine();
            System.out.println("----------------------------------------------------------");
        } while (productType < 1 || productType > 3);

        switch (productType) {
            case 1:
                System.out.print("Masukkan Ukuran Layar             : ");
                double screenSize = sc.nextDouble();
                sc.nextLine();
                System.out.print("Masukkan Kapasitas Penyimpanan    : ");
                int storageCapacity = sc.nextInt();
                sc.nextLine();
                String tipeProduk = "Smartfone";
                System.out.println("----------------------------------------------------------");
                product.add(new Smartphone(brand, seriesNumber, price, screenSize, storageCapacity, tipeProduk));
                break;
            case 2:
                System.out.print("Masukkan Resolusi     : ");
                int resolution = sc.nextInt();
                sc.nextLine();
                System.out.print("Masukkan Tipe Lensa   : ");
                String lensType = sc.nextLine();
                String tipeProduk2 = "Camera";
                System.out.println("----------------------------------------------------------");
                product.add(new Camera(brand, seriesNumber, price, resolution, lensType, tipeProduk2));
                break;
            case 3:
                System.out.print("Masukkan Ukuran RAM       : ");
                int ramSize = sc.nextInt();
                sc.nextLine();
                System.out.print("Masukkan Tipe Prosesor    : ");
                String processorType = sc.nextLine();
                String tipeProduk3 = "Laptop";
                System.out.println("----------------------------------------------------------");
                product.add(new Laptop(brand, seriesNumber, price, ramSize, processorType, tipeProduk3));
                break;
            default:
                System.out.println("Invalid Product Type...");
        }
        System.out.print("Produk Berhasil Ditambahkan!");
    }

    public static void displayAllProduct() {
        System.out.println("\n====================== DAFTAR PRODUK =====================");
        if (product.isEmpty()) {
            System.out.println("No product Found");
        } else {
            for (Product product : product) {
                product.displayInfo();
            }
        }
    }

    public static void purchaseProduct() {
        System.out.println("======================= BELI PRODUK ======================");
        if (product.isEmpty()) {
            System.out.println("Tidak Ada Produk Yang Tersedia!");
        } else {
            System.out.println("Produk Tersedia!");
            for (int i = 0; i < product.size(); i++) {
                System.out.println((i + 1) + ". " + product.get(i).brand + " " + product.get(i).seriesNumber);
            }
            System.out.print("Pilih Produk: ");
            int pilihan = sc.nextInt();
            if (pilihan >= 1 && pilihan <= product.size()) {
                System.out.println("----------------------------------------------------------");
                System.out.println("Pembelian Berhasil!");
                System.out.println("----------------------------------------------------------");
            } else {
                System.out.println("----------------------------------------------------------");
                System.out.println("Invalid Product Number!");
                System.out.println("----------------------------------------------------------");
            }
        }
    }

    public static void main(String[] args) {
    int choice;

        do {
            displayMenu();
            choice = pilihanUser();

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    displayAllProduct();
                    break;
                case 3:
                    purchaseProduct();
                    break;
                case 4:
                    System.out.println("----------------------------------------------------------");
                    System.out.println("Terima Kasih Telah Menggunakan Layanan Kami. Sampai Jumpa!");
                    System.out.println("----------------------------------------------------------");
                    break;
                default:
                    System.out.println("Pilihan input hanya 1-4...");
            }
        } while (choice != 4);
    }
}