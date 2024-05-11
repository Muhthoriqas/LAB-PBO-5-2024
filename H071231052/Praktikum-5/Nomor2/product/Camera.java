package product;

public class Camera extends Product{
    public int resolution;
    public String lensType;

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Resolution\t: " + resolution);
        System.out.println("Lens Type\t: " + lensType);
    }
}
