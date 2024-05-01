package Praktikum4.Nomor2;

public class HandPhone {
    String merk;
    String model;
    double harga;
    int tahunProduksi;
    String deskripsi;

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
    public double getHarga() {
        return harga;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
    public int getTahunProduksi() {
        return tahunProduksi;
    }
    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }
    public String getDeskripsi() {
        return deskripsi;
    }
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public void displayInfo(){
        System.out.println("merek hp: " + this.getMerk());
        System.out.println("model: " + this.getModel());
        System.out.println("Harga: " + this.getHarga());
        System.out.println("Tahun rilis: " + this.getTahunProduksi());
        System.out.println("Deskripsi: \n" + this.getDeskripsi());
        System.out.println("------------------");

        
    }
    
}
