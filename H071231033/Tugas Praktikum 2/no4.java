public class no4 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Tamalanrea Indah";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Farhan";
        mahasiswa.nim = "H071231025";

        System.out.println("Nama: "+ mahasiswa.getNama());
        System.out.println("Nim: "+ mahasiswa.getNim());
        System.out.println("Alamat: "+ mahasiswa.getAlamat());
    }
}

class Alamat{
    String jalan;
    String kota;
    
    public String toString() {
        return kota + ", " + jalan;
    }
}

class Mahasiswa{
    String nama;
    String nim;
    Alamat alamat;

    public String getNim(){
        return nim;
    }
    public String getNama(){
        return nama;
    }
    public Alamat getAlamat(){
        return alamat;
    }
}