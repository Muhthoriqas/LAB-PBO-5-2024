import java.util.*;
import javax.sound.sampled.*;

class Karyawan extends Kehidupan{
    String nama;
    int umur;
    String jabatan = "Karyawan";
    int gaji;

    String getNama(){
        return nama;
    }

    int getUmur(){
        return umur;
    }

    String getJabatan(){
        return jabatan;
    }

    int getGaji(){
        return gaji;
    }

    void setNama(String nama){
        this.nama = nama;
    }

    void setUmur(int umur){
        this.umur = umur;
    }

    void setJabatan(String jabatan){
        this.jabatan = jabatan;
    }

    void setGaji(int gaji){
        this.gaji = gaji;
    }

    Pengalaman pengalaman = new Pengalaman();
    Keluarga keluarga = new Keluarga();
    Scanner scan = new Scanner(System.in);
    Projek projek = new Projek();
    Pendidikan pendidikan = new Pendidikan();

    public Karyawan(){}

    public Karyawan(String nama, int umur, String jabatan, int gaji, String menikah, int anak){
        this.nama = nama;
        this.umur = umur;
        this.jabatan = jabatan;
        this.gaji = gaji;
        this.keluarga.menikah = menikah;
        this.keluarga.anak = anak;

    }
    
    void runDataNama() {
        String testNama;
        System.out.print("Masukkan nama: ");
        do {
            testNama = scan.nextLine();
        } while (testNama.isEmpty());
    
        setNama(testNama);
    }

    void runDataUmur(){
        try {
            System.out.print("Masukkan umur: ");
            setUmur(scan.nextInt());
        }
        catch (InputMismatchException e) {
            System.out.println("Inputan Harus integer");
            scan.nextLine();
            runDataUmur();
        }
    }
    
    void runDataGaji(){
        try{
            System.out.print("Gaji sebelumnya: ");
            setGaji(scan.nextInt());
        }
        catch (InputMismatchException e){
            System.out.println("Inputan Harus integer");
            scan.nextLine();
            runDataGaji();
        }
    }

    public static void playSound(String filePath) {
        try {
            Clip clip = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(Karyawan.class.getResourceAsStream(filePath));
            clip.open(inputStream);
            clip.start();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void displayInfo() {
        System.out.println("Nama                : " + this.getNama());
        System.out.println("Umur                : " + this.getUmur());
        System.out.println("Jabatan             : " + this.getJabatan());
        System.out.println("Gaji                : Rp. " + this.getGaji());
        System.out.println("Status Perkawinan   : " + this.keluarga.getMenikah());
        System.out.println("Jumlah anak         : " + this.keluarga.getAnak());
        System.out.println();
    }

    void prosesKehidupan(){
        runDataNama();
        runDataUmur();
        pengalaman.prosesKehidupan();
        runDataGaji();
        keluarga.menikah();
        pendidikan.prosesKehidupan();
        projek.prosesKehidupan();
    }

}