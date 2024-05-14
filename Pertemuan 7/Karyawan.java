class Karyawan {
    private String nama;
    private int umur;
    private String jabatan;
    private double gaji;
    private Pengalaman pengalaman;
    private Projek projek;

    public Projek getProjek() {
        return projek;
    }

    public void setProjek(Projek projek) {
        this.projek = projek;
    }

    Karyawan(String nama, int umur, String jabatan, double gaji){
        this.nama = nama;
        this.umur = umur;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }
    
    Karyawan(){

    }

    public Pengalaman getPengalaman() {
        return pengalaman;
    }

    public void setPengalaman(Pengalaman pengalaman) {
        this.pengalaman = pengalaman;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    public String getJabatan() {
        return jabatan;
    }
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    public double getGaji() {
        return gaji;
    }
    public void setGaji() {
        this.gaji = pengalaman.getGaji();
    }


    public void showInfoKaryawan(){
        System.out.println("Detail Karyawan: ");
        System.out.println("Nama : " + getNama());
        System.out.println("Umur : " + getUmur());
        System.out.println("Jabatan : " + getJabatan());
        System.out.println("Gaji : " + getGaji());
    }
}
