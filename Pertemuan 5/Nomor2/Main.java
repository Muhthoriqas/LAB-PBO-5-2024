import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Smartphone> listSmartphone = new ArrayList<>();
    static ArrayList<Camera> listCamera = new ArrayList<>();
    static ArrayList<Laptop> listLaptop = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        runApp();
    }

    static void runApp() {
        System.out.println("Menu: ");
        System.out.println("1. Tambah Produk");
        System.out.println("2. Tampilkan Semua Produk");
        System.out.println("3. Beli Produk");
        System.out.println("4. Keluar");
        System.out.print(">>> Pilih menu (1-4): ");

        int selectMenu = sc.nextInt();
        sc.nextLine();

        switch (selectMenu) {
            case 1:
                tambahProduk();
                break;
            case 2:
                tampilkanSemuaProduk();
                break;
            case 3:
                beliProduk();
                break;
            case 4:
                System.out.println("Terima kasih telah menggunakan layanan kami. Sampai jumpa!");
                return;
            default:
                System.out.println("Invalid input");
                runApp();
        }
    }

    static void tambahProduk() {
        String brand = inputBrand();
        int seriesNumber = inputSeriesNumber();
        double price = inputPrice();
        
        System.out.println("Pilih tipe produk:");
        System.out.println("1. Smartphone");
        System.out.println("2. Laptop");
        System.out.println("3. Camera");
        System.out.println("Pilih tipe produk(1-3): ");

        int selectProduct = sc.nextInt();
        sc.nextLine();
        switch (selectProduct) {
            case 1:
                Smartphone smartphone = new Smartphone();

                smartphone.setBrand(brand);
                smartphone.setSeriesNumber(seriesNumber);
                smartphone.setPrice(price);
                smartphone.setScreenSize(inputScreenSize());
                smartphone.setStorageCapacity(inputStorageCapacity());

                listSmartphone.add(smartphone);
                break;
            case 2:
                Laptop laptop = new Laptop();

                laptop.setBrand(brand);
                laptop.setSeriesNumber(seriesNumber);
                laptop.setPrice(price);
                laptop.setProcessorType(inputProcessorType());
                laptop.setRamSize(inputRamSize());
                
                listLaptop.add(laptop);
                break;
            case 3:
                Camera camera = new Camera();

                camera.setBrand(brand);
                camera.setSeriesNumber(seriesNumber);
                camera.setPrice(price);
                camera.setResolution(inputResolution());
                camera.setLensType(inputLensType());
                
                listCamera.add(camera);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        runApp();
    }

    static void tampilkanSemuaProduk() {
        if (listSmartphone.isEmpty() && listLaptop.isEmpty() && listCamera.isEmpty()) {
            System.out.println("Stok produk masih kosong.");
            runApp();
        } else {
            System.out.println("Daftar Produk: ");
         
            for (int i = 0; i < listSmartphone.size(); i++) {
                listSmartphone.get(i).displayinfo();
                System.out.println();
            }
            for (int i = 0; i < listLaptop.size(); i++) {
                listLaptop.get(i).displayInfo();
                System.out.println();
            }  
            for (int i = 0; i < listCamera.size(); i++) {
                listCamera.get(i).displayInfo();
                System.out.println();
            }
            runApp();
        }
        
    }

    static void beliProduk() {
        if (listSmartphone.isEmpty() && listLaptop.isEmpty() && listCamera.isEmpty()) {
            System.out.println("Stok produk masih kosong");
            runApp();
        } else {
            System.out.println("Masukkan nomor seri produk yang ingin dibeli: ");
            int soldProduct = sc.nextInt();
            sc.nextLine();
    
            int listIndex = -1;
            int foundInList = 0;
    
            for (int i = 0; i < listSmartphone.size(); i++) {
                if (soldProduct == listSmartphone.get(i).getSeriesNumber()) {
                    listIndex = i;
                    foundInList = 1;
                }
            }
            for (int i = 0; i < listLaptop.size(); i++) {
                if (soldProduct == listLaptop.get(i).getSeriesNumber()) {
                    listIndex = i;
                    foundInList = 2;
                }
            }
            for (int i = 0; i < listCamera.size(); i++) {
                if (soldProduct == listCamera.get(i).getSeriesNumber()) {
                    listIndex = i;
                    foundInList = 3;
                }
            }  
    
            System.out.println("Anda telah membeli produk:");
            if (foundInList == 1) {
                listSmartphone.get(listIndex).displayinfo();
                // listSmartphone.remove(listIndex);
            } else if (foundInList == 2) {
                listLaptop.get(listIndex).displayInfo();
                // listLaptop.remove(listIndex);
            } else if (foundInList == 3) {
                listCamera.get(listIndex).displayInfo();
                // listCamera.remove(listIndex);
            } else {
                System.out.println("Produk tidak ditemukan. Silahkan coba lagi");
                beliProduk();
            } 
            System.out.println();
            runApp();
        }
    }

    static String inputBrand() {
        System.out.println("Masukkan nama produk: ");
        String brand = sc.nextLine();

        if (brand.isEmpty()) {
            return inputBrand();
        } else {
            return brand;
        }
    }

    static int inputSeriesNumber() {
        try {
            System.out.println("Masukkan nomor seri: ");
            int seriesNumber = sc.nextInt();
            sc.nextLine();
            return seriesNumber;
        } catch (Exception e) {
            sc.nextLine();
            return inputSeriesNumber();
        }
    }

    static double inputPrice() {
        try {
            System.out.println("Masukkan harga: ");
            double price = sc.nextDouble();
            sc.nextLine();
            return price;
        } catch (Exception e) {
            sc.nextLine();
           return inputPrice();
        }
    }

    static double inputScreenSize() {
        try {
            System.out.println("Masukkan Screen Size: ");
            double screenSize = sc.nextDouble();
            sc.nextLine();
            return screenSize;
        } catch (Exception e) {
            sc.nextLine();
            return inputPrice();
        }
    }

    static int inputStorageCapacity() {
        try {
            System.out.println("Masukkan Storage Capacity: ");
            int storageCapacity = sc.nextInt();
            sc.nextLine();
            return storageCapacity;
        } catch (Exception e) {
            sc.nextLine();
            return inputStorageCapacity();
        }
    }

    static String inputProcessorType() {
        System.out.println("Masukkan ProcessorType: ");
        String processorType = sc.nextLine();

        if (processorType.isEmpty()) {
            return inputProcessorType();
        } else {
            return processorType;
        }
    }

    static int inputRamSize() {
        try {
            System.out.println("Masukkan ram Size: ");
            int ramSize = sc.nextInt();
            sc.nextLine();
            return ramSize;
        } catch (Exception e) {
            sc.nextLine();
            return inputRamSize();
        }
    }

    static int inputResolution() {
        try {
            System.out.println("Masukkan resolution: ");
            int resolution = sc.nextInt();
            sc.nextLine();
            return resolution;
        } catch (Exception e) {
            sc.nextLine();
            return inputResolution();
        }
    }

    static String inputLensType() {
        System.out.println("Masukkan lens type: ");
        String lensType = sc.nextLine();

        if (lensType.isEmpty()) {
            return inputLensType();
        } else {
            return lensType;
        }
    }
}