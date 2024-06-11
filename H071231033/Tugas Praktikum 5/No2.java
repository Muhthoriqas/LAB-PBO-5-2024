import java.util.ArrayList;
import java.util.Scanner;

class Product{
    protected String brand;
    protected int seriesNumber;
    protected double price;

    public Product(String brand, int seriesNumber, double price){
        this.brand = brand;
        this.seriesNumber = seriesNumber;
        this.price = price;
    }

    public void display(){
        System.out.println("\nBrand       : " + brand);
        System.out.println("Nomor Series : " + seriesNumber);
        System.out.println("Harga         : " + price);
    }
}

class Smartphone extends Product{
    private double screenSize;
    private int storageCapacity;

    public Smartphone(String brand, int seriesNumber, double price, double screenSize, int storageCapacity){
        super(brand, seriesNumber, price);
        this.screenSize = screenSize;
        this.storageCapacity = storageCapacity;
    }

    public void display(){
        super.display();
        System.out.println("Ukuran Layar : " + screenSize);
        System.out.println("Kapasitas Penyimpanan : " + storageCapacity);
    }
}

class Camera extends Product{
    private String lensType;
    private int resolution;

    public Camera(String brand, int seriesNumber, double price, String lensType, int resolution){
        super(brand, seriesNumber, price);
        this.lensType = lensType;
        this.resolution = resolution;
    }

    public void display(){
        super.display();
        System.out.println("Tipe Lensa : " + lensType);
        System.out.println("Resolution : " + resolution);
    }
}

class Laptop extends Product{
    private String processorType;
    private int ramSize;

    public Laptop(String brand, int seriesNumber, double price, String processorType, int ramSize){
        super(brand, seriesNumber, price);
        this.processorType = processorType;
        this.ramSize = ramSize;
    }

    public void display(){
        super.display();
        System.out.println("Tipe Prosessor : " + processorType);
        System.out.println("RAM Siza : " + ramSize + "GB");
    }
}
public class No2 {
    private ArrayList<Product> products = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addProduct(){
        System.out.println("Masukkan Nama Produk : " );
        String brand = sc.nextLine();

        System.out.println("Masukka Nomor Seri : " );
        int seriesNumber = sc.nextInt();

        System.out.println("Masukka Harga : ");
        double price = sc.nextDouble();
        sc.nextLine();

        System.out.println("Masukkan Tipe Produk");
        System.out.println("1. Smartphone");
        System.out.println("2. Laptop");
        System.out.println("3. Camera");
        int choice = sc.nextInt();
        sc.nextLine();
        
        switch (choice) {
            case 1:
                System.out.println("Masukkan Ukuran Layar (inch) : ");
                double screenSize = sc.nextDouble();
                sc.nextLine();
                System.out.println("Masukkan Kapasitas Penyimpanan (GB) : ");
                int storageCapacity = sc.nextInt();
                sc.nextLine();

                products.add(new Smartphone(brand, seriesNumber, price, screenSize, storageCapacity));       
                break;
            case 2:
                System.out.println("Masukkan Tipe Prosesor : ");
                String processorType = sc.nextLine();
        
                System.out.println("Masukkan Ukuran Memori : ");
                int ramSize = sc.nextInt();
                sc.nextLine();

                products.add(new Laptop(brand, seriesNumber, price, processorType, ramSize));            
                break;
            case 3:
                System.out.println("Masukkan Tipe Lensa : ");
                String lensType = sc.nextLine();
                
                System.out.println("Masukkan Resolusi Kamera : ");
                int resolution = sc.nextInt();
                sc.nextLine();

                products.add(new Camera(brand, seriesNumber, price, lensType, resolution));

            default:
                break;
        }
    }

    public void displayAllProducts(){
        System.out.println("Daftar Produk : "); 
        for(Product product : products){              //for each
            product.display();
            System.out.println();
        }
    }

    public void buyProduct(){
        System.out.println("Masukkan Seri Produk yang ingin dibeli : ");
        int desiredSeriesNumber = sc.nextInt();
        sc.nextLine();

        boolean found = false;
        for(Product product : products){
            if(product.seriesNumber == desiredSeriesNumber){
                System.out.println("Anda telah membeli produk : ");
                product.display();
                products.remove(product);
                break;
            }
        }

        if(!found){
            System.out.println("Produk dengan nomor seri tersebut tidak ditemukan");
        }
    }

    public static void main(String[] args) {
        No2 toko = new No2();
        Scanner scanner = new Scanner(System.in);

        int choice;

        do{
            System.out.println("\nMenu: ");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Tampilkan Semua Produk");
            System.out.println("3. Beli Produk");
            System.out.println("4. Keluar");
            System.out.println(">>>>> Pilih Menu 1-4");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    toko.addProduct();
                    break;
                case 2:
                    toko.displayAllProducts();
                    break;
                case 3:
                    toko.buyProduct();
                    break;
                case 4:
                    System.out.println("Terima Kasih Telah Menggunakan Sistem ini");
                    break;        
                default:
                    break;
            }
        }while (choice != 4);

        scanner.close();
    }

    
}