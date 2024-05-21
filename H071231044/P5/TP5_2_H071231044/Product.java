package TP5_2_H071231044;

public class Product {
    String brand;
    int seriesNumber;
    double price;
    
    // CONSTRUCTOR
    public Product(){

    }

    public Product(String brand, int seriesNumber, double price) {
        this.brand = brand;
        this.seriesNumber = seriesNumber;
        this.price = price;
    }

    //BEHAVIOR
    void displayInfo(){
        System.out.println("\nBrand: " + getBrand());
        System.out.println("Serial Number: " + getSeriesNumber());
        System.out.println("Price: $" + getPrice());
    }

    //METODE GETTER DAN SETTER
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public int getSeriesNumber() {
        return seriesNumber;
    }
    public void setSeriesNumber(int seriesNumber) {
        this.seriesNumber = seriesNumber;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}

class Smartphone extends Product{
    double screenSize;
    int storageCapacity;

    //CONSTRUCTOR
    public Smartphone(){
        
    }
    public Smartphone(String brand, int seriesNumber, double price, double screenSize,int storageCapacity){
        super(brand,seriesNumber,price);
        this.screenSize = screenSize;
        this.storageCapacity = storageCapacity;
    }

    //BEHAVIOR
    @Override
    //Fungsi ovveride untuk memodifikasi/menimpa di kelas induk. 
    void displayInfo(){
        super.displayInfo();
        System.out.println("Screen Size: " + getScreenSize() + " inches");
        System.out.println("Storage Capacity: " + getStorageCapacity() + "GB");
    }

    //GETTER AND SETTER
    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

}

class Camera extends Product{
    int resolution;
    String lensType;

    //CONSTRUCTOR
    public Camera(){

    }
    public Camera(String brand, int seriesNumber, double price, int resulation, String lensType){
        super(brand, seriesNumber, price);
        this.resolution = resulation;
        this.lensType = lensType;
    }

    //BEHAVIOR
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Resolution: " + getResolution() + "MP");
        System.out.println("Lens Type: " + getLensType());
    }

    //GETTER AND SETTER
    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public String getLensType() {
        return lensType;
    }

    public void setLensType(String lensType) {
        this.lensType = lensType;
    }

}

class Laptop extends Product{
    int ramSize;
    String processorType;

    //CONSTRUCTOR
    public Laptop(){

    }
    public Laptop(String brand, int seriesNumber, double price, int ramSize, String processorType){
        super(brand, seriesNumber, price);
        this.ramSize = ramSize;
        this.processorType = processorType;
    }

    //BEHAVIOR
    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("RAM Size: " + getRamSize() + "GB");
        System.out.println("Processor Type: " + getProcessorType());
    }

    //GETTER AND SETTER
    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }
}
