public class Keluarga {
    String jumlahAnak;

    public Keluarga(String jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public void status(){
        System.out.println("Status : " + getJumlahAnak());
    }

    public String getJumlahAnak() {
        return jumlahAnak;
    }

    
}