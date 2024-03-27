public class TP2_2_H071231087 {
          public static void main(String[] args){
                    Produk produk1 = new Produk();
                    produk1.ID = "A1231";
                    produk1.nama = "Pop Ice";
                    produk1.harga = 5000;
                    produk1.stok = 50;

                    Produk produk2 = new Produk();
                    produk2.ID = "A124556";
                    produk2.nama = "Es Teh";
                    produk2.harga = 10000;
                    produk2.stok = 0;
            
            
                    produk1.cekDataProduk();
                    produk1.cekProduk();
                    produk2.cekDataProduk();
                    produk2.cekProduk();
                }
            }
class Produk{
          String ID, nama;
          int stok;
          double harga;
            
          void cekDataProduk(){
                    System.out.println("DATA PRODUK");
                    System.out.println("Nama        : " + nama);
                    System.out.println("ID Produk   : " + ID);
                    System.out.println("Stok        : " + stok);
                    System.out.printf("Harga       : Rp. %.2f\n", harga);
                }
            
                void cekProduk(){
                    if (stok == 0){
                        System.out.println("Tidak Tersedia");
                    } else {
                        System.out.println("Stok tersedia : "+ stok);
                    }
                }
}

