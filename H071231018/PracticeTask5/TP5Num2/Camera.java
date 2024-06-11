package TP5Num2;

public class Camera extends Product {
    int resolution;
    String lensType;

    public Camera(String brand, int seriesNumber, double price, int resolution, String lensType){
        super(brand, seriesNumber, price);
        this.resolution = resolution;
        this.lensType = lensType;
    }

    public double getResolution(){
        return resolution;
    }

    public void setResolution(int resolution){
        this.resolution = resolution;
    }

    public String getLensType(){
        return lensType;
    }

    public void setLensType(String lensType){
        this.lensType = lensType;
    }

    @Override
    public void displayInfo(){
        System.out.println("Daftar Produk:");
        System.out.println("Brand: " + this.getBrand());
        System.out.println("Serial Number: " + this.getSeriesNumber());
        System.out.println("Price: $" + this.getPrice());
        System.out.println("Resolution: " + this.getResolution() + "MP");
        System.out.println("Lens Type: " + this.getLensType());
    }
}
