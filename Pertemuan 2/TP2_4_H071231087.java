public class TP2_4_H071231087 {
          
    public static void main(String[] args){
        Alamat alamat = new Alamat();
        alamat.jalan  = "Jalan Kebahagiaan";
        alamat.kota   = "Kota Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat.alamat();
        mahasiswa.nama   = "Bunda";
        mahasiswa.nim    = "H071231087";

        System.out.println("Nama : "+ mahasiswa.getNama());
        System.out.println("Nim : "+ mahasiswa.getNim());
        System.out.println("Alamat : "+ mahasiswa.getAlamat());
    }
    
}

class Alamat{
    String jalan;
    String kota;

    String alamat(){
        return jalan + ", " + kota;
    }
}

class Mahasiswa{
    String nama;
    String nim;
    String alamat;

    String getNama(){
        return nama;
    }
    String getNim(){
        return nim;
    }
    String getAlamat(){
        return alamat;

    }
}
