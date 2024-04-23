package BangunDatar;

public class Lingkaran {
    public static double jariJari;
    public final static double PHI = 3.14159;

    public static void setJariJari(double jariJari) {
        Lingkaran.jariJari = jariJari;
    }

    public static double luas() {
        return PHI * jariJari * jariJari;
    }

    public static double keliling() {
        return 2 * PHI * jariJari;
    }

    public static void call() {
        System.out.printf("Luas Lingkaran\t\t: %.2f\n", luas());
        System.out.printf("Keliling Lingkaran\t: %.2f\n", keliling());    
    }
}