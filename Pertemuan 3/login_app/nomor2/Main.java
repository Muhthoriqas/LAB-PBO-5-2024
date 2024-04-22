package nomor2;

public class Main {

       public static void main(String[] args) {
          Handphone handphone1 = new Handphone();
          handphone1.setMerk("Apple");
          handphone1.setModel("Iphone 15 Pro Max");
          handphone1.setHarga(20000000);
          handphone1.setTahunProduksi(2023);
          handphone1.setDeskripsi("Handphone keluaran terbaru dan Tercanggih");

          handphone1.displayInfo();
          System.out.println();

          Handphone handphone2 = new Handphone("Samsung", "S12 Ultra", 15000000, 2023, "Handphone dengan Kamera tercanggih");
          System.out.println("-------------------------");
          System.out.println("Info Handphone 2");
          System.out.println("-------------------------");
          System.out.println("Merek : " + handphone2.getMerk());
          System.out.println("Model : " + handphone2.getModel());
          System.out.println("Harga : " + handphone2.getHarga());
          System.out.println("Tahun Produksi : " + handphone2.getTahunProduksi());
          System.out.println("Deskripsi : " + handphone2.getDeskripsi());
          System.out.println();

          SelfUtils.displaySelfData();
       }   
     

}

