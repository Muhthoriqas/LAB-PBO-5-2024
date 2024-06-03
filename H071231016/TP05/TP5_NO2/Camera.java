package TP5_NO2;

class Camera extends Product{
    private int resolution;
    private String lensType;

    public Camera(String brand,int seriesNumber, double price, int resolution, String lensType){
       super(brand, seriesNumber, price);
        this.resolution =  resolution;
        this.lensType = lensType;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("The resolution: "+ this.resolution + "MP");
        System.out.println("Lens Type: " + lensType);
    }
}
