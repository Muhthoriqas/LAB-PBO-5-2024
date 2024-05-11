public class Pengalaman extends Kehidupan{
    String pengalaman = "Default";

    @Override
    public void prosesKehidupan() {
        System.out.println("Bayi sampai dewasa");
    }

    public void freelancer(Karyawan user){
        user.pengalaman.pengalaman = "Freelancer";
    }
    public void tidakAda(Karyawan user){
        user.pengalaman.pengalaman = "Tidak ada";
    }
    public void magang(Karyawan user){
        user.pengalaman.pengalaman = "Magang";
    }
    public void pekerjaTetap(Karyawan user){
        user.pengalaman.pengalaman = "Pekerja tetap";
    }
}