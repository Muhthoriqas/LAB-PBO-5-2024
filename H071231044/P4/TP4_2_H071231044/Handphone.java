package TP4_2_H071231044;

class Handphone {
    String merk;
    String model;
    int harga;
    int tahunProduksi;
    String deskripsi;

    public Handphone() {
    }
    public Handphone(String merk) {
        this.merk = merk;
    }
    public Handphone(String merk, String model) {
        this.merk = merk;
        this.model = model;
    }
    public Handphone(String merk, String model, int harga) {
        this.merk = merk;
        this.model = model;
        this.harga = harga;
    }
    public Handphone(String merk, String model, int harga, int tahunProduksi) {
        this.merk = merk;
        this.model = model;
        this.harga = harga;
        this.tahunProduksi = tahunProduksi;
    }
    public Handphone(String merk, String model, int harga, int tahunProduksi, String deskripsi) {
        this.merk = merk;
        this.model = model;
        this.harga = harga;
        this.tahunProduksi = tahunProduksi;
        this.deskripsi = deskripsi;
    }

    void displayInfo(){
        System.out.println("===== Info Spek =====");
        System.out.println("Merk           : " + getMerk());
        System.out.println("Model          : " + getModel());
        System.out.println("Harga          : " + getHarga());
        System.out.println("Tahun Produksi : " + getTahunProduksi());
        System.out.println("Deskripsi      : " + getDeskripsi());
        System.out.println("=====================\n");
    }

    //getter
    String getMerk () {
        return merk;
    }
    String getModel () {
        return model;
    }
    int getHarga () {
        return harga;   
    }
    int getTahunProduksi () {
        return tahunProduksi;
    }
    String getDeskripsi() {
        return deskripsi;
    }

    //setter
    void setMerk(String merk) {
        this.merk = merk;
    }
    void setModel(String model) {
        this.model = model;
    }
    void setHarga(int harga) {
        this.harga = harga;
    }
    void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }
    void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}