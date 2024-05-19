import java.util.*;

class Pendidikan extends Kehidupan {
    String[]listPendidikan = {"SD", "SMP", "SMA", "SMK", "S1", "S2", "S3"};
    int pendidikan;

    int getPendidikan(){
        return pendidikan;
    }
    void setPendidikan(int pendidikan){
        this.pendidikan = pendidikan;
    }

    Scanner sc = new Scanner(System.in);

    void prosesKehidupan(){
        System.out.print("Pendidikan terakhir (SD/SMP/SMA/SMK/S1/S2/S3): ");
        boolean validInput = false;
        while (!validInput) {
            String input = sc.nextLine().toUpperCase();
            for (int i = 0; i < listPendidikan.length; i++) {
                if (input.equals(listPendidikan[i])) {
                    pendidikan = i;
                    validInput = true;
                    break;
                }
            }
            if (!validInput) {
                System.out.println("Pilihan tidak ada. Masukkan kembali: ");
            }
        }
    }
}
