public class Produk {
    private String nama;
    private String id;
    private int stok;
    private int harga;

    public Produk(String id, String nama, int stok, int harga) {
        this.id = id;
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }

    public void displayInfo() {
        System.out.println("\nInfo Produk:");
        System.out.println("ID: " + id);
        System.out.println("Nama: " + nama);
        System.out.println("Stok: " + stok);
        System.out.println("Harga: Rp" + harga);
        
        if (stok <= 0) {
            System.out.println("Stok" + nama + "tidak tersedia");
        }
        
    }
}