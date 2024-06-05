package Nomor1;

public class Projek extends Kehidupan {
    int jumlahProyek;

    public Projek() {

    }

    public Projek (String nama, int gaji, int jumlahProyek) {
        super(nama, gaji);
        this.jumlahProyek = jumlahProyek;
    }

    public void project() {
        System.out.println("Projek IT\n1. Minimal 4\n2. Minimal 8\n3. Minimal 12\n4. Lebih dari 15");
    }

    public void jumlahProyek() {
        boolean stop = false;
        while (!stop) {
            try {
                boolean a = false;
                while (!a) {
                    project();
                    System.out.println("Inputt: ");
                    jumlahProyek = input.nextInt();
                    input.nextLine();

                    switch (jumlahProyek) {
                        case 1:
                            this.nilai = 0;
                            stop = true;
                            a = true;
                            break;
                        case 2:
                            this.nilai = 1;
                            stop = true;
                            a = true;
                            break;
                        case 3:
                            this.nilai = 1;
                            stop = true;
                            a = true;
                            break;
                        case 4:
                            this.nilai = 1;
                            stop = true;
                            a = true;
                            break;                   
                        default:
                            System.out.println("Pilihan hanya (1-4)");
                            break;
                    }
                }
            }catch (Exception e) {
                System.out.println("Inputan hanya menerima Angka");
                input.nextLine();
            }
        }
    }

    @Override
    public void prosesKehidupan() {
        switch (jumlahProyek) {
            case 1:
                System.out.println("Jumlah projek IT: 4");
                break;
            case 2:
                System.out.println("Jumlah projek IT: 8");
                break;
            case 3:
                System.out.println("Jumlah projek IT: 12");
                break;
            case 4:
                System.out.println("Jumlah projek IT: lebih dari 15");
                break;       
            default:
                break;
        }
    }
}