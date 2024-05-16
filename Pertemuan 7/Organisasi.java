import java.util.Scanner;

public class Organisasi extends Kehidupan {
    String input;

    @Override
    void prosesKehidupan() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ada pengalaman organisasi? (Y/N): ");
        input = sc.next();
        input.toUpperCase();
    }

    public String getInput() {
        return input.toUpperCase();
    }
}
