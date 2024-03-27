class Produk{

    String id;
    String nama;
    int stok;
    double harga;

    void cekDataProduk(){
        System.out.println("--------------");
        System.out.println("Data Produk");
        System.out.println("--------------");
        System.out.println("Nama\t\t:" + nama);
        System.out.println("Id Produk\t:" + id);
        System.out.println("Stok\t\t:" + stok);
        System.out.printf("Harga\t\t:Rp %.3f\n", harga);
    }

    void cekProduk(){
        if (stok <=20  && stok > 0){
            System.out.println("--------------");
            System.out.println("Stok Tinggal Sedikit");
        } else if (stok == 0){
            System.out.println("barang habis");
        }
        else{
            System.out.println("Stok Masih Banyak");
        }
    }
}

public class Tp2{
    public static void main(String[] args) {
        Produk produk1 = new Produk();
        produk1.id = "P010203";
        produk1.nama = "Apel";
        produk1.harga = 15;
        produk1.stok = 0;

        produk1.cekDataProduk();
        produk1.cekProduk();
    }
}