package TP02;

class Alamat {
    String jalan, kota;

    String getAll(){
        return jalan + ", " + kota;
    }
}

class Mahasiswa{
    String nama, kota, nim;
    Alamat alamat;

    public void setName(String nama){
        this.nama = nama;
    }
    public String getName(){
        return nama;
    }
    public void setNim (String nim){
        this.nim =nim;
    }
    public String getNim(){
        return nim;
    }
    public void setAlamat(Alamat alamat){
        this.alamat = alamat;
    }
    public String getAlamat(){
        return alamat.getAll();
    }
}
    public class Tuprak4 {
        public static void main(String[] args) {
            Alamat alamat = new Alamat();
            alamat.jalan = "Tamalanrea Indah";
            alamat.kota = "Makassar";

            Mahasiswa mahasiswa = new Mahasiswa();
            mahasiswa.alamat = alamat;
            mahasiswa.nama = "Farhan";
            mahasiswa.nim = "H071231025";

            System.out.println("Nama: "+ mahasiswa.getName());
            System.out.println("Nim: "+ mahasiswa.getNim());
            System.out.println("Alamat: "+ mahasiswa.getAlamat());
        }
    }
