package PracticeTask1;
import java.util.Scanner;

public class TP1Num4 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        boolean isTrue;
        
        do{
            try {
                System.out.println("Masukkan jari-jari lingkaran: ");
                double jariJari = n.nextDouble();
                isTrue = (jariJari > 0);
                if (!isTrue) {
                    System.out.println("Inputan Salah");
                } else {
                    double luasLingkaran = Math.PI * Math.pow(jariJari, 2);
                    System.out.printf("Luas lingkaran yaitu  : %.2f", luasLingkaran);
                }
            } catch (Exception e) {
                isTrue  = false;
                System.out.println("Inputan Salah");
            }
        } while (!isTrue);
        n.close();
    }
}