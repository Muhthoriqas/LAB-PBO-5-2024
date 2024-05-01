package Praktikum4.Nomor2;

public class Main {
    public static void main(String[] args) {
        HandPhone hp = new HandPhone();
        hp.setMerk("Vivo");
        hp.setModel("Vivo");
        hp.setHarga(200_000);
        hp.setTahunProduksi(2019);
        hp.setDeskripsi("ram 2 gb\npenyimpanan: 16 gb");
        

        hp.displayInfo();
        Kiki.displaySelfData();
    }
}
