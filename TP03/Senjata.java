package TP03;
public class Senjata {
    String nama;
    int serangan;
    
    // Constructor tanpa parameter
    public Senjata() {
    }
    
    // Constructor dengan parameter untuk inisialisasi nama dan serangan
    public Senjata(String nama, int serangan) {
        this.nama = nama;
        this.serangan = serangan;
    }
    
    // Getter dan setter
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getserangan() {
        return serangan;
    }
    public void setserangan(int serangan) {
        this.serangan = serangan;
    }
}

