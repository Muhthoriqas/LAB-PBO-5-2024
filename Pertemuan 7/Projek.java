import java.util.Scanner;

public class Projek extends Kehidupan {
    String[] projek = { "Minimal 8", "Minimal 2", "Lebih dari 15" };
    int input;

    @Override
    void prosesKehidupan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Projek IT :");
        System.out.println("1. Minimal 4");
        System.out.println("2. Minimal 8");
        System.out.println("3. Minimal 12");
        System.out.println("4. Lebih dari 15");
        System.out.print("Input: ");
        input = sc.nextInt();
    }

    public int getInput() {
        return input;
    }

    String getProjek() {
        return projek[input - 1];
    }
}
