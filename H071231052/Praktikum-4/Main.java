package Praktikum4;

public class Main {
    public static void main(String[] args) {
        Handphone hp = new Handphone();
        hp.setMerk("POCO");
        hp.setHarga(1_000_000);
        hp.setModel("X3");
        hp.setTahunProduksi(2020);
        hp.setDeskripsi("Mending Xiaomi");

        hp.displayInfo();

        Handphone hp2 = new Handphone("Samsung", "J2", "HP Legend", 500_000, 2010);
        System.out.println("Merk \t\t: " + hp2.getMerk());
        System.out.println("Model \t\t: " + hp2.getModel());
        System.out.println("Harga \t\t: " + hp2.getHarga());
        System.out.println("Tahun Produksi \t: " + hp2.getTahunProduksi());
        System.out.println("Deskripsi \t: " + hp2.getDeskripsi());

        SelfUtils.displaySelfData();
    }
}
