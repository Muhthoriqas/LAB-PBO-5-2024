package TP5Num2;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static ArrayList<Smartphone> smartphones = new ArrayList<>();
    public static ArrayList<Camera> cameras = new ArrayList<>();
    public static ArrayList<Laptop> laptops = new ArrayList<>();
    public static ArrayList<Product> products = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        runApp(sc);
    }
    
    static void runApp(Scanner sc){
        
        while (true){
            System.out.println("Menu: ");
            System.out.println("1. Tambah Produk\n2. Tampilkan Semua Produk\n3. Beli Produk\n4. Keluar\n");
            System.out.print(">>> Pilih menu (1-4): " );
            int menu = sc.nextInt();

            switch (menu){
                case 1:
                    tambahProduk(sc);
                    break;
                case 2:
                    infoProduk();
                    break;
                case 3:
                    beliProduk(sc);
                    break;
                case 4:
                    System.exit(0);
                }
            }
        }

    static void tambahProduk(Scanner sc){
        sc.nextLine();
        System.out.print("Masukkan nama produk: ");
        String merk = sc.nextLine();
        System.out.print("Masukkan nomor seri: ");
        int nomorSeri = sc.nextInt();
        System.out.print("Masukkan harga: ");
        double hrg = sc.nextDouble();
        System.out.println("Pilih tipe produk: \n1. Smartphone\n2. Laptop\n3. Camera");
        System.out.print("Pilih tipe produk (1-3): ");
        int tipe = sc.nextInt();
        switch (tipe) {
            case 1:
                
                System.out.print("Masukkan ukuran layar (inci): ");
                double sizeScreen = sc.nextDouble();
                System.out.print("Masukkan kapasitas penyimpanan (GB): ");
                int storage = sc.nextInt();
                Smartphone s = new Smartphone(merk, nomorSeri, hrg, sizeScreen, storage);
                smartphones.add(s);
                products.add(s);
                break;
            case 2:
                sc.nextLine();
                System.out.print("Masukkan ukuran RAM: ");
                int ram = sc.nextInt();
                System.out.print("Masukkan tipe processor: ");
                String  typeProcessor = sc.nextLine();
                Laptop l = new Laptop(merk, nomorSeri, hrg, ram, typeProcessor);
                laptops.add(l);
                products.add(l);
                break;
            case 3:
                System.out.print("Masukkan resolusi: ");
                int res = sc.nextInt();
                System.out.print("Masukkan tipe lensa: ");
                sc.nextLine();
                String typeLens = sc.nextLine();
                Camera c = new Camera(merk, nomorSeri, hrg, res, typeLens);
                cameras.add(c);
                products.add(c);
                break;
        }
    }

    static void infoProduk(){
        System.out.println("Daftar Produk: ");
        for (Smartphone sp : smartphones) {
            System.out.println("Tipe: Smartphone");
            sp.displayInfo();
        }
        for (Laptop lp : laptops) {
            lp.displayInfo();
        }
        for (Camera cp : cameras){
            cp.displayInfo();
        }
    }

    static void beliProduk(Scanner sc){
        System.out.print("Masukkan nomor seri yang ingin dibeli: ");
        int beli = sc.nextInt();
        Product foundProduct = null;
        for (Product p : products){
            if (p.getSeriesNumber() == beli){
                foundProduct = p;
                System.out.println("Anda telah membeli produk: ");
                foundProduct.displayInfo();
                break;
            } else{
                System.out.println("Produk dengan nomor seri tersebut tidak ditemukan. ");
            }
        }
    }
}


