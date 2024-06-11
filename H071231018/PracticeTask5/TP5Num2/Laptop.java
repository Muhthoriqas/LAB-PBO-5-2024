package TP5Num2;

public class Laptop extends Product{
    int ramSize;
    String processorType;

    public Laptop(String brand, int seriesNumber, double price, int ramSize, String processorType){
        super(brand, seriesNumber, price);
        this.ramSize = ramSize;
        this.processorType = processorType;
    }

    public int getRamSize(){
        return ramSize;
    }

    public void setRamSize(int ramSize){
        this.ramSize = ramSize;
    }

    public String getProcessorType(){
        return processorType;
    }

    public void setProcessorType(String processorType){
        this.processorType = processorType;
    }

    @Override
    public void displayInfo(){
        System.out.println("Daftar Produk:");
        System.out.println("Brand: " + this.getBrand());
        System.out.println("Serial Number: " + this.getSeriesNumber());
        System.out.println("Price: $" + this.getPrice());
        System.out.println("Processor Type: " + this.getProcessorType());
        System.out.println("Ram Size: " + this.getRamSize() + "GB");
    }
}
