import java.util.*;

class Projek extends Kehidupan {
    int projek;

    int getProyek(){
        return projek;
    }
    void setProyek(int projek){
        this.projek = projek;
    }

    Scanner sc = new Scanner(System.in);

    void prosesKehidupan() {
        try{
            System.out.print("Proyek IT :\n1. Minimal 4\n2. Minimal 8\n3. Minimal 12\n4. Lebih dari 15\nInput : ");
            int jProjek = sc.nextInt();
            if (jProjek == 1) {
                setProyek(4);
            }
            else if (jProjek == 2) {
                setProyek(8);
            }
            else if (jProjek == 3) {
                setProyek(12);
            }
            else if (jProjek == 4) {
                setProyek(15);
            }
            else {
                System.out.println("Input diluar pilihan!");
                prosesKehidupan();
            }
        }
        catch (InputMismatchException e){
            System.out.println("Hanya menerima integer");
            sc.nextLine();
            prosesKehidupan();
        }
    }
}
