import product.*;
import java.util.Scanner;

public class Main {
    static void menu() {
        System.out.println("\n======= MENU =======");
        System.out.println("1. Tambah Produk");
        System.out.println("2. Tampilkan semua produk");
        System.out.println("3. Beli produk");
        System.out.println("4. Keluar");
    }

    static void tambahProduk() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Pilih tipe produk : ");
        System.out.println("1. Smartphone");
        System.out.println("2. Laptop");
        System.out.print("3. Camera\n>>> ");
        int x = inp.nextInt();

        switch (x) {
            case 1:
                Smartphone hape = new Smartphone();
                System.out.print("Masukkan brand produk\t: ");
                hape.brand = inp.next();
                System.out.print("Masukkan nomor seri\t: ");
                hape.seriesNumber = inp.nextInt();
                System.out.print("Masukkan harga\t\t: ");
                hape.price = inp.nextDouble();
                System.out.print("Masukkan ukuran layar\t: ");
                hape.screenSize = inp.nextDouble();
                System.out.print("Masukkan kapasitas penyimpanan: ");
                hape.storageCapaciity = inp.nextInt();
                Product.daftar.add(hape);
                break;
            case 2:
                Laptop laptop = new Laptop();
                System.out.print("Masukkan brand produk\t: ");
                laptop.brand = inp.next();
                System.out.print("Masukkan nomor seri\t: ");
                laptop.seriesNumber = inp.nextInt();
                System.out.print("Masukkan harga\t\t: ");
                laptop.price = inp.nextDouble();
                System.out.print("Masukkan tipe processor\t: ");
                laptop.processorType = inp.next();
                System.out.print("Masukkan kapasitas RAM\t: ");
                laptop.ramSize = inp.nextInt();
                Product.daftar.add(laptop);
                break;
            case 3:
                Camera kamera = new Camera();
                System.out.print("Masukkan brand produk\t: ");
                kamera.brand = inp.next();
                System.out.print("Masukkan nomor seri\t: ");
                kamera.seriesNumber = inp.nextInt();
                System.out.print("Masukkan harga\t\t: ");
                kamera.price = inp.nextDouble();
                System.out.print("Masukkan tipe lensa\t: ");
                kamera.lensType = inp.next();
                System.out.print("Masukkan resolusi\t: ");
                kamera.resolution = inp.nextInt();
                Product.daftar.add(kamera);
                break;
        }
    }

    static void tampilkanDaftar() {
        for (Product i : Product.daftar) {
            i.displayInfo();
            System.out.println();
        }
    }

    static void beli() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan nomor seri produk :\n>> ");
        int pil = inp.nextInt();
        boolean status = false;

        for (Product i : Product.daftar) {
            if (i.seriesNumber == pil) {
                System.out.println("--> Anda berhasil membeli produk berikut");
                i.displayInfo();
                status = true;
                break;
            }
        }
        if (!status) {
            System.out.println("Produk tidak ditemukan");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // int pilihan;

        while (true) {
            menu();
            System.out.print("Masukkan pilihan :\n>> ");
            int pilihan = scan.nextInt();
            switch (pilihan) {
                case 1:
                    tambahProduk();
                    break;
                case 2:
                    tampilkanDaftar();
                    break;
                case 3:
                    beli();
                    break;
                case 4:
                    System.out.println("SEE YOU");
                    scan.close();
                    System.exit(1);
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia!");
                    break;
            }
        }
    }
}