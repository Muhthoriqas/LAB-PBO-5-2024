public class Proyek extends Kehidupan{
    int jumlah;

    public Proyek(int jumlah) {
        this.jumlah = jumlah;
    }

    public Proyek(){
        
    }

    @Override
    public void prosesKehidupan(){
        System.out.println("Pernah Memiliki Projek");
    }
    
    public void jumlahProjek(){
        if(this.jumlah == 1){
            System.out.println("Jumlah Projek IT: 4");
        }else if(this.jumlah == 2){
            System.out.println("Jumlah Projek IT: 8");
        }else if(this.jumlah == 3){
            System.out.println("Jumlah Projek IT: 12");
        }else if(this.jumlah == 4){
            System.out.println("Jumlah Projek IT: 15");
        }else{}
    }

    public int getJumlah() {
        return jumlah;
    }
}