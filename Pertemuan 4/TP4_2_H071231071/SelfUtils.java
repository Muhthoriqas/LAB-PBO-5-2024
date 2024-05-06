package TP4_2_H071231071;

public class SelfUtils {
    private String nama, nim;

    public SelfUtils(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    void displaySelfData() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }

}

class Main {
    public static void main(String[] args) {

        SelfUtils selfUtils = new SelfUtils("Alifsa Rezky Rahmah ", "H071231071");
        selfUtils.displaySelfData();
    }
}
