package Nomor1;

import java.util.InputMismatchException;

public class Pengalaman extends Kehidupan {
    int jenisPekerjaan;
    String organisasi;

    public Pengalaman (String nama, int gaji, int jenisPekerjaan) {
        super (nama, gaji);
        this.jenisPekerjaan = jenisPekerjaan;
    }

    public Pengalaman (String nama, int gaji) {
        super (nama, gaji);
    }

    public Pengalaman (String organisasi) {
        this.organisasi = organisasi;
    }

    public Pengalaman() {

    }

    @Override
    public void prosesKehidupan() {
        if (jenisPekerjaan== 1) {
            System.out.println("Freelancer");
        } else if (jenisPekerjaan== 2) {
            System.out.println("Magang");
        } else if (jenisPekerjaan== 3) {
            System.out.println("Kerja tetap");
        } else if (jenisPekerjaan== 4) {
            System.out.println("Tidak Ada");
        }

    }

    public void organisasi() {
        System.out.print("Masukan pengalaman organiasi (jika tidak ada ketik 'Tidak Ada'): ");
        String organisasi = ip.nextLine();
        organisasi = organisasi.toLowerCase();
        String[] pisah = organisasi.split(" ");
        for (int i = 0; i < pisah.length; i++) {
            pisah[i] = Character.toUpperCase(pisah[i].charAt(0)) + pisah[i].substring(1);
        }
        String hasil = String.join(" ", pisah);
        if (hasil.equalsIgnoreCase("Tidak Ada")) {
            this.nilai = 0;
        } else {
            this.nilai = 1;
        }

    }

    public void pengalamanKerja() {
        boolean stop = false;
        while (!stop) {
            try {
                boolean a = false;
                while (!a) {
                    System.out.println("jenis Pekerjaan sebelumnya\n1. Freelancer\n2. Magang\n3. Pekerjaan tetap\n4. Tidak bekerja");
                    System.out.print("Input: ");
                    this.jenisPekerjaan = input.nextInt();
                    input.nextLine();

                    if (jenisPekerjaan >= 1 && jenisPekerjaan <= 3) {
                        System.out.print("GAji sebelumnya: ");
                        this.gaji = input.nextInt();
                        input.nextLine();
                        stop = true;
                        a = true;
                    }else if (jenisPekerjaan == 4) {
                        organisasi();
                        stop = true;
                        a = true;
                    }else {
                        System.out.println("Pilihan tidak adaaa");
                    }
                }
            }catch (InputMismatchException e) {
                System.out.println("Inoutan hanya menerima angka");
                ip.nextLine();
            }
        }
    }
    public int getPengalaman() {
        return jenisPekerjaan;
    }
}