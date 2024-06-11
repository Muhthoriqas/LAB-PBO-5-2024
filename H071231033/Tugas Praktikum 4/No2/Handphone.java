package No2;

class Handphone {
    String merk, model, deskripsi;
    int tahunProduksi;
    double harga;

    public Handphone(){
        
    }

    public Handphone(String merk, String model, String deskripsi, double harga, int tahunProduksi) {
        this.merk = merk;
        this.model = model;
        this.deskripsi = deskripsi;
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

    public void displayInfo(){
        System.out.println("Merk: "+ getMerk());
        System.out.println("Model: "+ getModel());
        System.out.println("Deskripsi: "+ getDeskripsi());
        System.out.println("Harga: "+ getHarga());
        System.out.println("Tahun Produksi: "+ getTahunProduksi());
    }
}
