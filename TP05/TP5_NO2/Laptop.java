package TP5_NO2;

class Laptop extends Product{
    private int ramSize;
    private String processorType;

    public Laptop(String brand, int seriesNumber, double price, int ramSize, String processorType){
        super(brand, seriesNumber, price);
        this.ramSize = ramSize;
        this.processorType = processorType;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("RAM Size: "+ ramSize + "GB");
        System.out.println("Processor Type;: "+ processorType);

    }
}