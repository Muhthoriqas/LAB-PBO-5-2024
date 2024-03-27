import java.util.Scanner;

class Produk {
    String nama;
    String id;
    int stok;
    int harga;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getStok() {
        return stok;
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

    public String dataProduk() {
        return "\nDetail Produk\nNama :" + getNama() + "\nID : " + getId() + "\nHarga : " + getHarga();
    }

    public String stokStatus() {
        if (getStok() == 0) {
            return "Produknya tidak tersedia";
        } else {
            return "Stoknya ada " + stok;
        }

    }
}

public class TP2_2_H071231071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produk produk = new Produk();

        System.out.print("Input your data please \nNama Produk   : ");
        String nama = sc.nextLine();
        System.out.print("ID    : ");
        String id = sc.next();
        System.out.print("stok : ");
        // int stok = sc.nextInt();
        // System.out.print("harga : ");
        // int harga = sc.nextInt();

        sc.close();

        produk.setNama(nama);
        produk.setId(id);
        produk.setStok(5);
        produk.setHarga(5000);

        System.out.println(produk.dataProduk());
        System.out.println(produk.stokStatus());

    }

}
