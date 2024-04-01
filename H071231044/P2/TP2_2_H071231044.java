public class TP2_2_H071231044 {
    String nama;
    int ID;
    int harga;
    int stok;

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }
    public int getStok() {
        return stok;
    }
    public void infoProduk() {
        System.out.println("Nama\t: " + nama);
        System.out.println("ID\t: " + ID);
        System.out.println("Harga\t: " + formatHarga());
        System.out.println("Stok\t: " + stok);
    }
    public String formatHarga() {
        return String.format("%,d", harga).replace(',', '.');
    }
    public void cekStok() {
        if (stok > 0) {
            System.out.println("Barang Tersedia");
        } else {
            System.out.println("Maaf, barang tersebut sudah habis");
        }
    }

    public static void main(String[] args) {
        TP2_2_H071231044 Barang = new TP2_2_H071231044();

        Barang.setNama("MSI GF63 UC11");
        Barang.setID(99);
        Barang.setHarga(9500000);
        Barang.setStok(0);

        Barang.infoProduk();
        Barang.cekStok();
    }
}
