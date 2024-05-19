import java.util.*;
class Pengalaman extends Kehidupan{
    String pengalaman;
    String organisasi;

    String getPengalaman(){
        return pengalaman;
    }
    void setPengalaman(String pengalaman){
        this.pengalaman = pengalaman;
    }

    String getOrganisasi(){
        return organisasi;
    }

    void setOrganisasi(String organisasi){
        this.organisasi = organisasi;
    }

    Scanner scanner = new Scanner(System.in);


    void jenisPekerjaan() {
        try {
            System.out.println("Pengalaman sebelumnya :\n1. Freelancer\n2. Magang\n3. Pekerja tetap\n4.Tidak ada");
            System.out.print("input: ");
            int kerja = scanner.nextInt();
            if (kerja == 1) {
                setPengalaman("Freelancer");
            }
            else if (kerja == 2) {
                setPengalaman("Magang");;
            }
            else if (kerja == 3) {
                setPengalaman("Pekerja tetap");
            }
            else if (kerja == 4) {
                setPengalaman("Tidak ada");
            }
            else {
                System.out.println("Input diluar pilihan!");
                jenisPekerjaan();
            }
        }
        catch (InputMismatchException e){
                System.out.println("Hanya menerima integer");
                scanner.nextLine();
                jenisPekerjaan();
            }
    }

    void organisasi(){
        try {
            System.out.print("pengalaman berorganisasi:\n1. Ada\n2. Tidak ada\ninput: ");
            int organisasi = scanner.nextInt();
            if (organisasi == 1) {
                System.out.print("Masukkan organisasi: ");
                do{
                    setOrganisasi(scanner.nextLine());
                    }while(getOrganisasi().isEmpty());
                }

            else if (organisasi == 2) {
                setOrganisasi("Tidak ada");
            }
            
            else {
                System.out.println("Input diluar pilihan!");
                organisasi();
            }
        }
        catch(InputMismatchException e) {
            System.out.println("Hanya menerima integer");
                scanner.nextLine();
                organisasi();
        }
    }
    void prosesKehidupan() {
        jenisPekerjaan();
        organisasi();
    }
    
}
