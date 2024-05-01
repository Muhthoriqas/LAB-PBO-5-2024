import java.util.ArrayList;
import java.util.Date;

class Pelanggan{

    String nama;

    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
}

class Produk{

    double harga ;
    String namaProduk;

    public double getHarga(){
        return harga;
    }
    public void setHarga (double harga){
        this.harga = harga;
    }
    public String getNamaProduk(){
        return namaProduk;
    }
    public void setNamaProduk (String nama){
        this.namaProduk= nama;
    }
}

public class PesananRill {
    private String idPesanan;
    private Pelanggan pelanggan;
    private ArrayList <Produk> daftarProduk;
    private Date tanggalPesanan;

    //Konstruktor
    public PesananRill(String idPesanan, Pelanggan pelanggan, Date tanggalPesanan){
        this.idPesanan = idPesanan;
        this.pelanggan = pelanggan;
        this.tanggalPesanan = tanggalPesanan;
        this.daftarProduk = new ArrayList<>();
    }

    public PesananRill(){

    }

    public void tambahProduk(Produk produk){
        daftarProduk.add(produk);
    }

    public double hitungTotalharga(){
        double totalHarga = 0;
        for (Produk produk : daftarProduk){
            totalHarga += produk.getHarga();
        }
        return totalHarga;
    }

    public void tampilkanDetailPesanan(){
        System.out.println("-----------------");
        System.out.println("Detail Pesanan: ");
        System.out.println("-----------------");
        System.out.println("ID Pesanan: " + idPesanan);
        System.out.println("Tanggal Pesan: " + tanggalPesanan);
        System.out.println("Pelanggan: " + pelanggan.getNama());
        System.out.println("Daftar Produk:");
        for (Produk produk : daftarProduk){
            System.out.println("- " + produk.getNamaProduk() + " Harga: " + produk.getHarga());
        }
        System.out.println(("Total Harga: " + hitungTotalharga()));
    }

    public static void main(String[] args) {
        // membuat objek pelanggan
        Pelanggan pelanggan = new Pelanggan();
        pelanggan.nama = "Kikio";

        Pelanggan pelanggan1 = new Pelanggan();
        pelanggan1.nama = "Budii";

        // membuat objek produk
        Produk produk1 = new Produk();
        produk1.setNamaProduk("Celana");
        produk1.setHarga(200000);
        
        Produk produk2 = new Produk();
        produk2.setNamaProduk("Kemeja");
        produk2.setHarga(100000);

        Produk produk3 = new Produk();
        produk3.setNamaProduk("Topi");
        produk3.setHarga(100000);

        //membuat objek pesananrill
        PesananRill pesanan = new PesananRill("H0712", pelanggan1, new Date());

        PesananRill pesanan1 = new PesananRill("H0712", pelanggan, new Date());
        pesanan.tambahProduk(produk1);
        pesanan.tambahProduk(produk2);
        pesanan1.tambahProduk(produk3);

        pesanan.tampilkanDetailPesanan();
        pesanan1.tampilkanDetailPesanan();

    }
}