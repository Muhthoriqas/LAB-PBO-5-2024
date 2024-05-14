public class Smartphone extends Product {
          double screenSize;
          int storageCapacity;

          public void displayinfo() {
                    super.displayInfo();
                    System.out.println("Screen Size: " + getScreenSize() + " inches");
                    System.out.println("Strorage Capacity: " + getStorageCapacity() + "GB");
          }
            
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
