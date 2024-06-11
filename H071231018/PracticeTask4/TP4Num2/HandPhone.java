package TP4Num2;

class HandPhone {
    String merk, model, deskripsi;
    double harga;
    int hargaProduksi;

    public HandPhone(String merk, String model, String deskripsi, double harga, int hargaProduksi){
        this.merk = merk;
        this.model = model;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.hargaProduksi = hargaProduksi;
    }

    public HandPhone(){
    }

    public String getMerk(){
        return merk;
    }

    public void setMerk(String merk){
        this.merk = merk;
    }

    public String getModel(){
        return model;
    }

    public void setModel (String model){
        this.model = model;
    }

    public String getDeskripsi(){
        return deskripsi;
    }

    public void setDeskripsi (String deskripsi){
        this.deskripsi = deskripsi;
    }
    
    public double getHarga(){
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getHargaProduksi(){
        return hargaProduksi;
    }

    public void setHargaProduksi(int hargaProduksi) {
        this.hargaProduksi = hargaProduksi;
    }

    public void displayInfo(){
        System.out.println("Merk : " + merk);
        System.out.println("Model : " + model);
        System.out.println("Harga : " + harga);
        System.out.println("Harga Produksi : " + hargaProduksi);
        System.out.println("Deskripsi : " + deskripsi);
    }
}
