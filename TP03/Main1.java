package TP03;

public class Main1 {
    public static void main(String[] args) {
        Senjata senjata1 = new Senjata();
        senjata1.setNama("Bazoka");
        senjata1.setserangan(50);
        
        Kerajaan kerajaan1 = new Kerajaan();
        kerajaan1.setNamaKerajaan("Sei");
        kerajaan1.setPendiri("Imam mahdi");
        kerajaan1.setDarah(100);
        kerajaan1.setSenjata(senjata1);

        Senjata senjata2 = new Senjata();
        senjata2.setNama("Pistol");
        senjata2.setserangan(10);
        
        Kerajaan kerajaan2 = new Kerajaan();
        kerajaan2.setNamaKerajaan("Cenah");
        kerajaan2.setPendiri("Hamsa");
        kerajaan2.setDarah(100);
        kerajaan2.setSenjata(senjata2);

        kerajaan1.displayInfo();
        kerajaan2.displayInfo();

        kerajaan1.battle(kerajaan2);

        kerajaan1.displayInfo();
        kerajaan2.displayInfo();

        kerajaan1.battle(kerajaan2);

        kerajaan1.displayInfo();
        kerajaan2.displayInfo();

        kerajaan1.battle(kerajaan2);
 

    }

}
