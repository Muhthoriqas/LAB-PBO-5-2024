import java.util.Scanner;

public class no2 {
    public static void main(String[] args) {
        Produk permen = new Produk("PER70", "Permen", 37, 7000);
        Produk mochi = new Produk("MOC71", "Mochi", 50, 4500);
        Produk biskuit = new Produk("BIS72", " Biskuit", 0, 12000);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nama produk (Permen/Mochi/Biskuit):");
        String inputNama = scanner.nextLine();

        switch (inputNama.toLowerCase()) {
            case "permen":
                permen.displayInfo();
                break;
            case "mochi":
                mochi.displayInfo();
                break;
            case "biskuit":
                biskuit.displayInfo();
                break;
            default:
                System.out.println("Produk tidak tersedia.");
                break;
        }

        scanner.close();
    }
}