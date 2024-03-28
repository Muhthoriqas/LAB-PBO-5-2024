package Praktikum.Praktikum2;

public class TP2_2_H071231052 {
    private int ID;
    String nama;
    int stok = 0;
    int harga;

    public String dataProduk() {
        return "ID Produk \t: " + this.ID + "\nNama \t: " + this.nama
                + "Stok\t: " + this.stok + "Harga\t: " + this.harga;
    }
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getStok() {
        return this.stok > 0 ? ("Stok tersedia sejumlah " + this.stok) : "Stok habis";
    }
    public void setStok(int stok) {
        this.stok = stok;
    }
    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
}
