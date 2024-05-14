public class Camera extends Product{
          String lensType;
          int resolution;

          public void displayInfo() {
                    super.displayInfo();
                    System.out.println("Resolution: " + getResolution() + "MP");
                    System.out.println("Lens Type: " + getLensType());
          }
            
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

