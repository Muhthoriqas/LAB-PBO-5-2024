package TP4Num2;

public class Main{
    public static void main(String[] args) {
        SelfUtils.displaySelfData();
        HandPhone hp = new HandPhone();
        hp.setMerk("Nokia");
        hp.setModel("jadul");
        hp.setHarga(700000);
        hp.setHargaProduksi(300000);
        hp.setDeskripsi("Hp bekas mines baterai kembung");
        hp.displayInfo();
        HandPhone hape = new HandPhone("Apple", "13 Pro", "ram 9000 gb", 50000000, 2000000);
        hape.getMerk();
        hape.getModel();
        hape.getHarga();
        hape.getHargaProduksi();
        hape.getDeskripsi();
        hape.displayInfo();
    }
}
