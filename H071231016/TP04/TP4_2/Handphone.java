package TP4_2;

public class Handphone {
    String merk, model,deskripsi;
    int harga, tahunProduksi;

    Handphone(String merk, String model, String deskripsi, int harga, int tahunProduksi){
        this.merk = merk;
        this.model = model;
        this.deskripsi =deskripsi;
        this.harga = harga;
        this.tahunProduksi = tahunProduksi;

        
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
}
