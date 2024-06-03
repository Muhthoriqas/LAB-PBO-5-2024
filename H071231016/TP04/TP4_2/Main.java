package TP4_2;

public class Main {
    private static final String SelfUtils = null;

    public static void main(String[] args){
        Handphone hp1 = new Handphone(null, String model, null, 0, 0);

        hp1.setMerk("PHONE");
        hp1.setModel("16 PRO MAX MAX");
        hp1.setHarga(50000000);
        hp1.setTahunProduksi(2027);
        hp1.setDeskripsi("SmartPhone dengan keunggulan yang lebih baik dari series sebelumnya");

        System.out.println("Informasi SmartPhone Pertama: ");
        hp1.displayInfo();
        System.out.println();

        Handphone hp2 = new Handphone(null, null, null, 0, 0);
        hp2.setMerk("SamSungKr");
        hp2.setModel("SSKr Galaxy");
        hp2.setHarga(90000000);
        hp2.setTahunProduksi(2047);
        hp2.setDeskripsi("SmartPhone dyang memiliki keunggulan dengan kamera yang jernih dan dapat melakukan zoom hingga ke bulan.");

        System.out.println("Informasi SmartPhone Kedua");
        System.out.println("Merk; " + hp2.getMerk());
        System.out.println("Model: " + hp2.getModel());
        System.out.println("Harga: " + hp2.getHarga());
        System.out.println("Tahun Produksi: " + hp2.getTahunProduksi());
        System.out.println("Deskripsi: " + hp2.getDeskripsi());
        System.out.println();

        SelfUtils.displaySelfData();
    }
}

