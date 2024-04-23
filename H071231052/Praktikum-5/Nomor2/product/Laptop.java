package product;

public class Laptop extends Product {
    public int ramSize;
    public String processorType;

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("RAM Size\t: " + ramSize);
        System.out.println("Processor Type\t: " + processorType);
    }
}
