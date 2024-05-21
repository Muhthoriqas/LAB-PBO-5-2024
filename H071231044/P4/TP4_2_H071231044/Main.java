package TP4_2_H071231044;

public class Main {
    public static void main(String[] args) {
        Handphone poco = new Handphone();
        poco.setMerk("Poco");
        poco.setModel("F3");
        poco.setHarga(5000000);
        poco.setTahunProduksi(2021);
        poco.setDeskripsi("HP Gaming Boss");

        poco.displayInfo();

        Handphone iphone = new Handphone("Iphone", "13 Pro Max", 15000000, 2021,"HP para orang kaya");
        iphone.displayInfo();

        iphone.getMerk();
        iphone.getModel();
        iphone.getHarga();
        iphone.getTahunProduksi();
        iphone.getDeskripsi();


        selfUtils.displaySelfData();
    }
}
