public class Product {
          String brand;
          int seriesNumber;
          double price;
          

          public void displayInfo() {
                    System.out.println("Brand : " + getBrand());
                    System.out.println("Seies Number : " + getSeriesNumber());
                    System.out.println("Proce : $" + getPrice());
          }


          public String getBrand() {
                    return brand;
          }


          public int getSeriesNumber() {
                    return seriesNumber;
          }

          public double getPrice() {
                    return price;
          }


          public void setBrand(String brand) {
                    this.brand = brand;
          }


          public void setSeriesNumber(int seriesNumber) {
                    this.seriesNumber = seriesNumber;
          }


          public void setPrice(double price) {
                    this.price = price;
          }
}