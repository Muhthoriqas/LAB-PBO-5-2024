public class Main {
          public static void main(String[] args) {
                    HotWheels mercebesDenz = new HotWheels("Mercebes-Denz", 4,20000);

                    HotWheels ferharri = new HotWheels();
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

                    mercebesDenz.raceTo(ferharri);
                    mercebesDenz.raceTo(ferharri);

                    System.out.println();
                    mercebesDenz.showSpec();
                    ferharri.showSpec();
          }

          public static void printBarriers() {
                    System.out.println("=============================================");
          }
}
