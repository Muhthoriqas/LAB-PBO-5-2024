package Praktikum4;

public class Handphone {
    String merk, model, deskripsi;
    int harga, tahunProduksi;
    
    public Handphone(String merk, String model, String deskripsi, int harga, int tahunProduksi) {
        this.merk = merk;
        this.model = model;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.tahunProduksi = tahunProduksi;
    }

    public Handphone() {
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
    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public int getTahunProduksi() {
        return tahunProduksi;
    }
    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }

    public void displayInfo(){
        System.out.println("==========> Display <==========");
        System.out.println("Merk \t\t: " + getMerk());
        System.out.println("Model \t\t: " + getModel());
        System.out.println("Harga \t\t: " + getHarga());
        System.out.println("Tahun Produksi \t: " + getTahunProduksi());
        System.out.println("Deskripsi \t: " + getDeskripsi() + "\n");
    }
}
