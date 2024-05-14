public class Laptop extends Product{
         String processorType;
         int ramSize;
         
          public void displayInfo() {
                    super.displayInfo();
                    System.out.println("Processor Type : " + getProcessorType());
                    System.out.println("Ram Size : " + getRamSize());
          }

          public String getProcessorType() {
          return processorType;
          }

          public void setProcessorType(String processorType) {
                    this.processorType = processorType;
          }

          public int getRamSize() {
                    return ramSize;
          }

          public void setRamSize(int ramSize) {
                    this.ramSize = ramSize;
          }
         
}
