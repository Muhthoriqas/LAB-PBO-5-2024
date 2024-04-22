package nomor2;



public class Handphone {
          String merk, model, deskripsi;
          int tahunProduksi;
          double harga;

          public Handphone(){

          }

          public Handphone(String merk, String model, int tahunProduksi, double harga, String deskripsi) {
                    this.merk = merk;
                    this.model = model;
                    this.deskripsi = deskripsi;
                    this.tahunProduksi = tahunProduksi;
                    this.harga = harga;
          }


          public String getMerk() {
                    return merk;
          }
          public void setMerk(String merk) {
                    this.merk = merk;
          }
          public String getModel() {
                    return model;
          }
          public void setModel(String model) {
                    this.model = model;
          }
          public String getDeskripsi() {
                    return deskripsi;
          }
          public void setDeskripsi(String deskripsi) {
                    this.deskripsi = deskripsi;
          }
          public int getTahunProduksi() {
                    return tahunProduksi;
          }
          public void setTahunProduksi(int tahunProduksi) {
                    this.tahunProduksi = tahunProduksi;
          }
          public double getHarga() {
                    return harga;
          }
          public void setHarga(double harga) {
                    this.harga = harga;
          }

          public void displayInfo(){
                    System.out.println("-------------------------");
                    System.out.println("Info Handphone 1");
                    System.out.println("-------------------------");
                    System.out.println("Merek : " + merk);
                    System.out.println("Model : " + model);
                    System.out.println("Harga : " + harga);
                    System.out.println("Tahun Produksi : " + tahunProduksi);
                    System.out.println("Deskripsi : " + deskripsi);
}        
}