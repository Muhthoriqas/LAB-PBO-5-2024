package TP4_2_H071231071;

public class TP4_2_H071231071 {
    public static void main(String[] args) {
        Handphone handphone = new Handphone();

        handphone.setMerk("Iphone");
        handphone.setModel("Xr");
        handphone.setHarga(8000000);
        handphone.setTahunProduksi(2023);
        handphone.setDeskripsi("Prossesor dengan ios 16");

        handphone.displayInfo();

        Handphone hp2 = new Handphone("Realme", "Realme 5 Pro", "Cocok untuk gaming", 3000000, 2020);
        hp2.displayInfo();
    }

}

class Handphone {
    String merk, model, deskripsi;
    double harga;
    int tahunProduksi;

    Handphone() {

    }

    public Handphone(String merk, String model, String deskripsi, double harga, int tahunProduksi) {
        this.merk = merk;
        this.model = model;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.tahunProduksi = tahunProduksi;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }

    public String getMerk() {
        return merk;
    }

    public String getModel() {
        return model;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public double getHarga() {
        return harga;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }

    void displayInfo() {
        System.out.println("\nMerk: " + this.getMerk());
        System.out.println("Model: " + this.getModel());
        System.out.println("Harga: " + this.getHarga());
        System.out.println("Tahun produksi: " + this.getTahunProduksi());
        System.out.println("Deskripsi: " + this.getDeskripsi());

    }

}