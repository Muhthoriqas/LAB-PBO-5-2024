package BangunDatar;

public class PersegiPanjang extends Trapesium {
    public static void setLebar(double lebar) {
        PersegiPanjang.lebar1 = lebar;
        PersegiPanjang.lebar2 = lebar;
        PersegiPanjang.setTinggi(lebar);
    }
}
