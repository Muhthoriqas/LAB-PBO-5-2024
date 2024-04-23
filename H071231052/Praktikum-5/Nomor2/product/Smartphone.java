package product;

public class Smartphone extends Product {
    public double screenSize;
    public int storageCapaciity;

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Screen Size\t: " + screenSize);
        System.out.println("Storage Capacity: " + storageCapaciity);
    }
}
