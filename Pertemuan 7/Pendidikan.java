import java.util.Scanner;

public class Pendidikan extends Kehidupan {
    String[] pengalaman = { "SD", "SMP", "SMA", "S1", "S2", "S3" };
    String input;

    @Override
    void prosesKehidupan() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Pendidikan terakhir (SD/SMP/SMA/S1/S2/S3): ");
            input = sc.next();
            input.toUpperCase();

        } catch (Exception e) {
            System.out.println("Inputan harus berupa String");
        }
    }

    public String getInput() {
        return input.toUpperCase();
    }

}
