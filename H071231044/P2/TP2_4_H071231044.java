import java.util.Scanner;

class Mahasiswa {
    String nama;
    String nim;
    Alamat alamat;

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getAlamat() {
        return alamat.getAlamat();
    }
}

class Alamat {
    String area;
    String kota;

    public String getAlamat() {
        return area + ", " + kota;
    }
}

public class TP2_4_H071231044 {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        Mahasiswa mahasiswa = new Mahasiswa();
        Alamat alamat = new Alamat();

        System.out.print("Masukkan nama  : ");
        String nama = data.nextLine();

        System.out.print("Masukkan nim   : ");
        String nim = data.nextLine();

        System.out.print("Masukkan Area  : ");
        String area = data.nextLine();
        alamat.area = area;

        System.out.print("Masukkan Kota  : ");
        String kota = data.nextLine();
        alamat.kota = kota;

        mahasiswa.nama = nama;
        mahasiswa.nim = nim;
        mahasiswa.alamat = alamat;
        data.close();

        System.out.println("\nData Mahasiswa :");
        System.out.println("Nama\t: " + mahasiswa.getNama());
        System.out.println("NIM\t: " + mahasiswa.getNim());
        System.out.println("Alamat\t: " + mahasiswa.getAlamat());
    }
}