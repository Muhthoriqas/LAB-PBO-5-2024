package TP03;
public class Kerajaan {
    String namaKerajaan;
    String pendiri;
    int darah;
    Senjata senjata = new Senjata(); //ini namanya method
    
    public Kerajaan (){ //constructor kerajaan
    }

    // Info info = new Info();
    public void battle(Kerajaan enemy){
        if (this.darah > 0 && enemy.darah >0){
            enemy.darah -= this.senjata.getserangan();
            this.darah -= enemy.senjata.getserangan();

            System.out.println("------------------ Saling Menyerangg -----------------");
        }else if( this.darah <= 0){
            System.out.println("Kerajaan Kita Kalah:(");

        }else if (enemy.darah <= 0){
            System.out.println("Kerajaan Musuh Kalah:)");
        }else{
            System.out.println("Seri");
        }

    }

    public Kerajaan(String namaKerajaan, String pendiri){ // Tambahkan lokasi di sini
        this.namaKerajaan = namaKerajaan;
        this.pendiri = pendiri;
    
    }

    public void displayInfo(){ // Behavior untuk menampilkan informasi
        System.out.println("===============Info Kerajaan===============");
        System.out.println("Nama Kerajaan   : " + this.getNamaKerajaan());
        System.out.println("Nama Pendiri    : " + this.getPendiri());
        System.out.println("Darah           : " + this.getDarah());
        System.out.println("Nama Senjata    : " + this.getSenjata().getNama());
        System.out.println("Damage Senjata  : " + this.getSenjata().getserangan());

    }

    public String getNamaKerajaan() {
        return namaKerajaan;
    }

    public void setNamaKerajaan(String namaKerajaan) {
        this.namaKerajaan = namaKerajaan;
    }
    
    public String getPendiri() {
        return pendiri;
    }
    public void setPendiri(String pendiri) {
        this.pendiri = pendiri;
    }

    public int getDarah() {
        return darah;
    }

    public void setDarah(int darah) {
        this.darah = darah;
    }

    public Senjata getSenjata() {
        return senjata;
    }

    public void setSenjata(Senjata senjata) {
        this.senjata = senjata;
    }
    
}
        
