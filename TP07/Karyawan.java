public class Karyawan extends Keluarga{
    String name;
    int umur;
    String jabatan = "Karyawan";
    double gaji = 1.21212127;

    public Karyawan(String jumlahAnak, String name, int umur) {
        super(jumlahAnak);
        this.name = name;
        this.umur = umur;
    }

    public void pengalamanKerja(Pengalaman pengalaman){
    }

    @Override
    public void status(){
        System.out.println("Menjadi karyawan selama 10 tahun di Unilever");
    }

    public void display(){
        System.out.println();
        System.out.println("==========================");
        System.out.println("Detail Karyawan");
        System.out.println("==========================");
        System.out.println("Nama\t: " + getName());
        System.out.println("Jabatan : " + getJabatan());
        System.out.println("Umur\t: " + getUmur());
        System.out.println("Gaji\t: " + getGaji());
        System.out.println("Status\t: " + getJumlahAnak());
        System.out.println("==========================");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
}