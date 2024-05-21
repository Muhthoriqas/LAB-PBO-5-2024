public class Main {
    public static void main(String[] args) {
        HotWheels mercebesDenz = new HotWheels("Mercebes-Denz", 5, 50000);

        HotWheels ferharri = new HotWheels(null, 0, 0);
        ferharri.setName("Ferharri");
        ferharri.setSpeed(4);
        ferharri.setCash(50000);

        System.out.println();
        mercebesDenz.showSpec();
        ferharri.showSpec();

        printBarriers();
        mercebesDenz.upgrade(50000);
        printBarriers();
        ferharri.upgrade(50000);
        printBarriers();

        System.out.println();
        ferharri.showSpec();

        printBarriers();
        ferharri.raceTo(mercebesDenz);
        printBarriers();
        mercebesDenz.raceTo(ferharri);
        printBarriers();

        System.out.println();
        mercebesDenz.showSpec();
        ferharri.showSpec();
    }
    public static void printBarriers() {
        System.out.println("===================================");
    }
}
    