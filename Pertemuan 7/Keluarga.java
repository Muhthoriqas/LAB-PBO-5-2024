import java.util.Scanner;

public class Keluarga {
    boolean menikah;
    String jawaban;
    Scanner sc = new Scanner(System.in);

    void jalankan() {
        System.out.print("Sudah berkeluarga/menikah? (Sudah atau belum):");
        jawaban = sc.next().toLowerCase();

    }

    void menikah() {
        if (jawaban.equals("sudah")) {
            menikah = true;
        } else {
            menikah = false;
        }
    }

}
