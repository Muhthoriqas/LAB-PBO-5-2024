package No2;

public class Main {
    public static void main(String[] args){
        Handphone hp1 = new Handphone();

        hp1.setMerk("ODDO");
        hp1.setModel("RENO4");
        hp1.setHarga(7900000);
        hp1.setTahunProduksi(2019);
        hp1.setDeskripsi("Smartphone dengan keunggulan kamera yang tajam");

        System.out.println("Informasi handphone pertama");
        hp1.displayInfo();
        System.out.println();

        Handphone hp2 = new Handphone();
        hp2.setMerk("ROG");
        hp2.setModel("ROG Phone 8 Pro");
        hp2.setHarga(9900000);
        hp2.setTahunProduksi(2024);
        hp2.setDeskripsi("Smartphone dengan keunggulan bermain game");

        System.out.println("Informasi handphone kedua");
        System.out.println("Merk; " + hp2.getMerk());
        System.out.println("Model: " + hp2.getModel());
        System.out.println("Harga: " + hp2.getHarga());
        System.out.println("Tahun Produksi: " + hp2.getTahunProduksi());
        System.out.println("Deskripsi: " + hp2.getDeskripsi());
        System.out.println();

        SelfUtils.displaySelfData();
    }
}
