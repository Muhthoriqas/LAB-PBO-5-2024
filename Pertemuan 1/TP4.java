import java.util.Scanner;
public class TP4 {
    /* Program ini simple hanya mencari Luas Lingkaran jika dikeetahui Diameternya saja atau jari-jarinya saja */
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        final double PI = 3.14; // Final ini untuk apa? Final itu sama seperti Konstan maksudnya tidak dapat diubah atau permanen, jadi misal PI = 3.14 itu sudah ketentuan pasti
        // Jika mencoba mengubahnya mengakibatkan error!
        System.out.println("Program Menghitung Luas Lingkaran !");
        System.out.print("Apa yang Diketahui?\n1. Diameter\n2. Jari-jari\n >> ");
        int pilihan = input.nextInt(); // Memilih Menu
        switch (pilihan){
            case 1:
                try {
                    System.out.print("Masukkan Diameter : ");
                    double d = input.nextDouble();
                    double luas = (1.0/4) * PI * (d*d); // Mengapa 1.0? agar hasilnya double
                    System.out.printf("Luasnya adalah : %.2f", luas);  // printf atau printformat disini berguna untuk mengformat string, tapi dikasus ini digunakan untuk memanipulasi double menjadi 2 angka dibelakang koma "%.2f"
                    // Mengapa persen? persen biasanya dipakai untuk memasukkan variabel (Attribute)
                } catch (Exception e){
                    System.out.println("Bukan angka!");
                    System.exit(1);
                } // Try Catch disini berfungsi untuk mengendalikan eror jika diameter yang dimasukkan bukan angka melainkan Huruf
                break;
            case 2:
                try {
                    System.out.print("Masukkan Jari-jari : ");
                    double r = input.nextDouble();
                    double luas = PI * (r*r);
                    System.out.printf("Luasnya adalah : %.2f", luas);
                } catch (Exception e){
                    System.out.println("Bukan Angka!");
                    System.exit(1);
                }
                break;
        }
        input.close(); // Menutup Input
    }

}
