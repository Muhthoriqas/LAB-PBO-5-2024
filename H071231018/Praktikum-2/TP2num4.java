class Alamat{
    String jalan;
    protected String kota;
}

class Mahasiswa {
    String nama;
    String nim;
    Alamat alamat;
    
    public String getNama(){
        return nama;
    }
    
    public String getNim(){
        return nim;
    }

    public String getAlamat(){
        return alamat.jalan + ", " + alamat.kota;
    }
}


public class TP2num4 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Tamalanrea Indah";
        alamat.kota = "Makassar";
        
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Feri Fadli";
        mahasiswa.nim = "H071231025";
        
        System.out.println("Nama: "+ mahasiswa.getNama());
        System.out.println("Nim: " + mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.getAlamat());
    }
}