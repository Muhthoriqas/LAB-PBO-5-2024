import java.util.Scanner;

class BangunDatar{
    double luas;

    void hitungLuas(){
    }

}

class BangunRuang extends BangunDatar{
    double volume;

    void hitungLuas(){

    }
}

class Persegi extends BangunDatar{
    double sisi;

    public Persegi(double sisi){
        this.sisi = sisi;
    }

    public void hitungLuas(){
        luas = sisi * sisi;
    }

    public void hitungKeliling(){
        double keliling = 4 * sisi;
        System.out.println("Keliling Persegi : " + keliling);
    }
}

class PersegiPanjang extends BangunDatar{
    double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void hitungLuas(){
        luas = panjang * lebar;
    }

    public void hitungKeliling(){
        double keliling = 2 * (panjang + lebar);
        System.out.println("Keliling Persegi Panjang : " + keliling);
    }
}
class Kubus extends BangunRuang{
    double sisi;

    Kubus(double sisi){
        this.sisi = sisi;
    }

    public void hitungLuas(){
        luas = 6 * Math.pow(sisi, 2);
    }

    public void hitungVolume(){
        volume = Math.pow(sisi, 3);
    }
}

class Balok extends BangunRuang{
    double panjang, lebar, tinggi;

    public Balok(double panjang, double lebar, double tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public void hitungLuas(){
        luas = 2 * (panjang * lebar + panjang + tinggi + lebar * tinggi);
    }

    public void hitungVolume(){
        volume = panjang * lebar * tinggi;
    }
}

class Bola extends BangunRuang{
    double jariJari;

    public Bola(double jariJari){
        this.jariJari = jariJari;
    }

    public void hitungLuas(){
        luas = 4 * Math.PI * jariJari * jariJari;
    }

    public void hitungVolume(){
        volume = (4.0 / 3) * Math.PI * jariJari * jariJari * jariJari;
    }
}

class Tabung extends BangunRuang{
    double jariJari, tinggi;

    public Tabung(double jariJari, double tinggi){
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    void hitungLuas(){
        luas = 2 * Math.PI * jariJari * (jariJari + tinggi);
    }

    void hitungVolume(){
        volume = Math.PI * jariJari * jariJari * tinggi;
    }
}

class Lingkaran extends BangunDatar{
    double jariJari;

    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }

    public void hitungLuas(){
        luas = Math.PI * jariJari * jariJari;
    }

    public void hitungKeliling(){
        double keliling = 2 * (Math.PI + jariJari);
        System.out.println("Keliling Lingkaran : " + keliling);
    }
}

class Trapesium extends BangunDatar{
    double sisi1, sisi2, sisi3, sisi4;
    double tinggi;

    public Trapesium(double sisi1, double sisi2, double sisi3, double sisi4, double tinggi) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
        this.sisi4 = sisi4;
        this.tinggi = tinggi;
    }

    public void hitungLuas(){
        double setengahAlas = (sisi1 + sisi2) / 2;
        double luasTrapesium = setengahAlas * tinggi;
        System.out.println("Luas Trapesium : " + luasTrapesium);
    }

    public void hitungKeliling(){
        double keliling = sisi1 + sisi2 + sisi3 + sisi4;
        System.out.println("Keliling Trapesium : " + keliling);
    }
   
}

public class No1{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int pilihan;

        System.out.println("===========================================================");
        System.out.println("========== BANGUN RUANG ==========");
        System.out.println("1. KUBUS");
        System.out.println("2. BALOK");
        System.out.println("3. BOLA");
        System.out.println("4. TABUNG");
        System.out.println("========== BANGUN DATAR ==========");
        System.out.println("5. PERSEGI");
        System.out.println("6. PERSEGI PANJANG");
        System.out.println("7. LINGKARAN");
        System.out.println("8. TRAPESIUM");
        System.out.println("===========================================================");

        System.out.println("Masukkan Pilihan Anda : ");
        pilihan = sc.nextInt();

        switch (pilihan) {
            case 1: //kubus
                System.out.println("Masukkan Sisi Kubus : ");
                double sisiKubus = sc.nextDouble();
                
                Kubus kubus = new Kubus(sisiKubus);
                kubus.hitungLuas();
                kubus.hitungVolume();

                System.out.println("Luas Kubus : " + kubus.luas);
                System.out.println("Volume Kubus : " + kubus.volume);
                break;

            case 2: //Balok
                System.out.println("Masukkan Panjang Balok : ");
                double panjangBalok = sc.nextDouble();

                System.out.println("Masukkan Lebar Balok : ");
                double lebarBalok = sc.nextDouble();

                System.out.println("Masukkan Tinggi Balok : ");
                double tinggiBalok = sc.nextDouble();
                
                Balok balok = new Balok(panjangBalok, lebarBalok, tinggiBalok);
                balok.hitungLuas();
                balok.hitungVolume();

                System.out.println("Luas Balok : " + balok.luas);
                System.out.println("Volume Balok : " + balok.volume);
                break;

            case 3: //Bola
                System.out.println("Masukkan Jari Jari Bola : ");
                double jariJariBola = sc.nextDouble();

                Bola bola = new Bola(jariJariBola);
                bola.hitungLuas();
                bola.hitungVolume();

                System.out.println("Luas Bola : " + bola.luas);
                System.out.println("Volume Bola : " + bola.volume);
                break;

            case 4: //Tabung
                System.out.println("Masukkan Jari Jari Tabung : ");
                double jariJariTabung = sc.nextDouble();

                System.out.println("Masukkan Tinggi Tabung : ");
                double tinggiTabung = sc.nextDouble();

                Tabung tabung = new Tabung(jariJariTabung, tinggiTabung);
                tabung.hitungLuas();
                tabung.hitungVolume();

                System.out.println("Luas Bola : " + tabung.luas);
                System.out.println("Volume Bola : " + tabung.volume);
                break;

            case 5: //Persegi
                System.out.println("Masukkaan Sisi Persegi : ");
                double sisiPersegi = sc.nextDouble();

                Persegi persegi = new Persegi(sisiPersegi);
                persegi.hitungLuas();
                persegi.hitungKeliling();

                System.out.println("Luas Persegi : " + persegi.luas);
                break;

            case 6: //Persegi Panjang
                System.out.println("Masukkan Panjang Persegi Panjang : ");
                double panjangPersegiPanjang = sc.nextDouble();

                System.out.println("Masukkan Tinggi Tabung : ");
                double lebarPersegiPanjang = sc.nextDouble();

                PersegiPanjang persejang = new PersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);
                persejang.hitungLuas();
                persejang.hitungKeliling();

                System.out.println("Luas Persegi Panjang : " + persejang.luas);
                break;

            case 7: //Lingkaran
                System.out.println("Masukkan Jari Jari Lingkaran : ");
                double jariJariLingkaran = sc.nextDouble();

                Lingkaran lingkaran = new Lingkaran(jariJariLingkaran);
                lingkaran.hitungLuas();
                lingkaran.hitungKeliling();

                System.out.println("Luas Lingkaran : " + jariJariLingkaran );
                break;

            case 8: //Trapesium
                System.out.println("Masukkan Sisi 1 Trapesium : ");
                double sisi1Trapesium = sc.nextDouble();

                System.out.println("Masukkan Sisi 2 Trapesium : ");
                double sisi2Trapesium = sc.nextDouble();

                System.out.println("Masukkan Sisi 3 Trapesium : ");
                double sisi3Trapesium = sc.nextDouble();

                System.out.println("Masukkan Sisi 4 Trapesium : ");
                double sisi4Trapesium = sc.nextDouble();

                System.out.println("Masukkan Tinggi Trapesium : ");
                double tinggiTrapesium = sc.nextDouble();

                Trapesium trapesium = new Trapesium(sisi1Trapesium, sisi2Trapesium, sisi3Trapesium, sisi4Trapesium, tinggiTrapesium);
                trapesium.hitungLuas();
                trapesium.hitungKeliling();
                break;
        
            default:
            System.out.println("Pilihan Tidak Valid");
                break;
        }

        sc.close();

    }
}