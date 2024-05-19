import java.util.*;

class Keluarga extends Kehidupan {
    String menikah;
    int anak;

    String getMenikah(){
        return menikah;
    }
    int getAnak(){
        return anak;
    }
    void setMenikah(String menikah){
        this.menikah = menikah;
    }
    void setAnak(int anak){
        this.anak = anak;
    }

    Scanner sc = new Scanner(System.in);

    void menikah(){
        String cekNikah;
        System.out.print("Menikah (y/t) : ");
        do{
            cekNikah = sc.nextLine().toLowerCase();
        }while (cekNikah.isEmpty());

        if (cekNikah.equals("y")){
            anak();
            setMenikah("Sudah menikah");
        }else if (cekNikah.equals("t")){
            setMenikah("Belum menikah");
            setAnak(0);
        }
    }

    void anak(){
        try {
            System.out.print("Jumlah Anak : ");
            setAnak(sc.nextInt());
        }catch (InputMismatchException e){
            System.out.println("Inputan harus angka");
            anak();
        }
    }

    void prosesKehidupan(){
        menikah();
    }
}

