package TP7Num1;

class Pengalaman extends Kehidupan{
    String jenisPekerjaan;

    Pengalaman(String jenisPekerjaan) {
        this.jenisPekerjaan = jenisPekerjaan;
    }

    Pengalaman(){
    }

    public void Freelancer(Karyawan pKaryawan) {
        pKaryawan.pglm.jenisPekerjaan = "Freelancer";
    }

    public void Magang(Karyawan pKaryawan) {
        pKaryawan.pglm.jenisPekerjaan = "Magang";
    }
    
    public void PekerjaanTetap(Karyawan pKaryawan) {
        pKaryawan.pglm.jenisPekerjaan = "Pekerjaan Tetap";
    }

    public void TidakAda(Karyawan pKaryawan) {
        pKaryawan.pglm.jenisPekerjaan = "Tidak Ada";
    }

    @Override
    public void prosesKehidupan(){
        System.out.println("Jenis pekerjaan : " + jenisPekerjaan);
    }
}
