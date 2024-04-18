package Praktikum.Praktikum3;

import java.util.Random;
import java.util.Scanner;

class ResepRahasia {
    String bahan1, bahan2, bahan3;
    
    public ResepRahasia(String bahan1, String bahan2, String bahan3) {
    this.bahan1 = bahan1;
        this.bahan2 = bahan2;
        this.bahan3 = bahan3;
    }

    public String getAll() {
        return bahan1 + " " + bahan2 + " " + bahan3;
    }
}

public class Warteg {
    int penghasilan, saldo;
    String nama;
    ResepRahasia resep;

    public Warteg(String nama, int penghasilan, ResepRahasia resep) {
        this.penghasilan = penghasilan;
        this.nama = nama;
        this.resep = resep;
        System.out.println("=====> Warteg [" + nama + "] berhasil terdaftar dalam sistem <=====\n");
    }

    public Warteg() {
    }

    public void sewaPenglaris(int level) {
        switch (level) {
            case 1:
                if (saldo >= 500000) {
                    penghasilan += (penghasilan / 2);
                    setSaldo(getSaldo() - 50000);
                    System.out.println("-> Penghasilan meningkat sebesar 50%!\n");
                } else {
                    System.out.println("Uang anda sekarang tidak cukup!\n");
                }
                break;
            case 2:
                if (saldo >= 800000) {
                    penghasilan *= 2;
                    setSaldo(getSaldo() - 80000);
                    System.out.println("-> Penghasilan meningkat sebesar 100%!\n");
                } else {
                    System.out.println("Uang anda sekarang tidak cukup!\n");
                }
                break;
            case 3:
                if (saldo >= 1200000) {
                    penghasilan *= 3;
                    setSaldo(getSaldo() - 1200000);
                    System.out.println("-> Penghasilan meningkat sebesar 200%!\n");
                } else {
                    System.out.println("Uang anda sekarang tidak cukup!\n");
                }
                break;
            default:
                System.out.println("Plihan tidak tersedia!\n");
        }
    }

    public void rejekiSeret(Warteg saingan) {
        Random ran = new Random();
        int x = ran.nextInt(50) + 1;
        int nerf;
        if (x > 20) {
            System.out.println("Warung " + saingan.getNama() + " terkena kutukan, penghasilan mereka berkurang 10%\n");
            nerf = saingan.getPenghasilan() / 10;
            saingan.setPenghasilan(saingan.getPenghasilan() - nerf);
        } else {
            System.out.println("Oh tidak, kamu gagal menyeretkan rejeki Warteg " + saingan.getNama()
                    + "! Penghasilan anda berkurang 10%\n");
            nerf = getPenghasilan() / 10;
            setPenghasilan(getPenghasilan() - nerf);
        }
    }

    public void hidupAtauMati(Warteg saingan) {
        System.out.println("=======> Hidup Atau Mati <=======");
        System.out.print("Tebak resep rahasia Warteg " + saingan.getNama() + ", jika benar maka maka Warteg "
                + saingan.getNama()
                + " akan [Gulung Tikar] dan jika salah maka Warteg Anda akan [Gulung Tikar]!\n(ketik BATAL jika ingin membatalkan)"
                + "\nMasukkan Resep Rahasia " + saingan.getNama() + " : ");
        Scanner scan = new Scanner(System.in);
        String tmp = scan.nextLine().toLowerCase();
        if (tmp.equalsIgnoreCase("batal")) {
            System.out.println("Proses dibatalkan\n");
        } else if (tmp.equalsIgnoreCase(saingan.resep.getAll())) {
            this.saldo += saingan.getSaldo();
            saingan.setSaldo(0);
            saingan.setPenghasilan(0);
            System.out.println("Anda berhasil, " + saingan.getNama() + " telah [Gulung Tikar]\n");
        } else {
            saingan.setSaldo(saingan.getSaldo() + getSaldo());
            setSaldo(0);
            setPenghasilan(0);
            System.out.println("Anda telah gagal, saldo anda sekarang 0 dan usaha anda [Gulung Tikar]\n");
        }
        scan.close();
    }

    public void showInfo() {
        System.out.println("============> INFO <============");
        System.out.println("Nama \t\t: Warteg " + getNama());
        System.out.println("Penghasilan \t: Rp. " + getPenghasilan() + "/bulan");
        System.out.println("Saldo \t\t: Rp. " + getSaldo() + "\n");
    }

    public void skipBulan(int jumlah) {
        saldo += jumlah * getPenghasilan();
    }

    public int getPenghasilan() {
        return penghasilan;
    }

    public void setPenghasilan(int penghasilan) {
        this.penghasilan = penghasilan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public ResepRahasia getresep() {
        return resep;
    }

    public void setResep(ResepRahasia resep) {
        this.resep = resep;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}