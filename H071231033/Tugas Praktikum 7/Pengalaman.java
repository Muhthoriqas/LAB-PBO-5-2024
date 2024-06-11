public class Pengalaman extends Kehidupan{
    int pengalaman;
  
    public Pengalaman(int pengalaman) {
        this.pengalaman = pengalaman;
    }

    @Override
    public void prosesKehidupan(){
        System.out.println("Pernah");
    }

    public void organisasi(){
        if(pengalaman == 4){
            System.out.println("Ketua organisasi");
        }else{}     
    }

    public void jenisPekerjaan(){
        System.out.println("1. Freelancer");
        System.out.println("2. Magang");
        System.out.println("3. Pekerja Tetap");
        System.out.println("4. Tidak ada");
    }

    public int getPengalaman() {
        return pengalaman;
    }

    public void setPengalaman(int pengalaman) {
        this.pengalaman = pengalaman;
    }
    
}