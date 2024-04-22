import java.util.Scanner;
public class TP3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String tanggal = input.nextLine(); // Seperti biasa
        String[] pisah = tanggal.split("-"); // Seperti biasa memisah String tanggal yang diinput dengan pemisahnya tanda "-"
        // Jadi misalnya "28-2-21", maka terpisah menjadi ["28", "2", "21"]
        konversiString(pisah); // Memanggil fungsi atau method yang bernama konversiString dengan parameter pisah
        input.close();
    }
    static void konversiString(String[] hasil){
        int tanggal = Integer.parseInt(hasil[0]); // Apa itu Integer.parseInt, simpelnya mengubah angka yang bertipe data String ke Tipe data Integer
        // Terus mengapa hasil[0]?? karena disini dalam soalnya sudah pasti ada 3 unsur pertama tanggal yang berada pada index 0, dan index 1, bulan, dan index 2 tahun
        int bulanAwal = Integer.parseInt(hasil[1]); //Simpelnya parseInt, mengkonversi Dari Sttring ke Int
        int tahunAwal = Integer.parseInt(hasil[2]); // Namanya bulan awal, dan tahun awal karena belum final bulan yang pasti karena di cek terlebih dahulu
        int tahun = CekTahun(tahunAwal); // disini di cek melalui Method CekTahun >> Silahkan ke Method cek tahun
        // Metode CekTahun disini berfungsi untuk merubah tahun yang awalnya 2 digit ke 4 digit
        String bulan = Validasi(bulanAwal, tanggal, tahun);  // Memvalidasi apakah bulan yang diberikan sesuai dengan format 12 bulan seperti biasanya
        System.out.println(tanggal + " " + bulan + " " + tahun);
    }

    static String Validasi(int bulan, int tanggal, int tahun){
        String x = ""; // Disini String X berfungsi sebagai return karena nanti method Validasi mereturn String, yang tersetor di variabel Bulan
    
       
        switch (bulan){
            case 1:
                if (tanggal > 0 && tanggal <= 31){
                    x = "Januari";
                } else {
                    System.out.println("Tanggal Tidak Valid!");
                    System.exit(1);
                }
                break;
            case 2:
                if (tanggal > 0 && tanggal <= 29){
                    if (tanggal == 29) {
                        if (tahun % 4 == 0 && (tahun % 100 != 0 || tahun % 400 == 0)){
                            x = "Februari";
                        } else {
                            System.out.println("Tanggal Tidak Valid!");
                            System.exit(1);
                        }
                    } else {
                        x = "Februari";
                    }
                } else {
                    System.out.println("Tanggal Tidak Valid!");
                    System.exit(1);
                }
                break;
            case 3:
                if (tanggal > 0 && tanggal <= 31){
                    x = "Maret";
                } else {
                    System.out.println("Tanggal Tidak Valid!");
                    System.exit(1);
                }
                break;
            case 4:
                if (tanggal > 0 && tanggal <= 30){
                    x = "April";
                } else {
                    System.out.println("Tanggal Tidak Valid!");
                    System.exit(1);
                }
                break;
            case 5:
                if (tanggal > 0 && tanggal <= 31){
                    x = "Mei";
                } else {
                    System.out.println("Tanggal Tidak Valid!");
                    System.exit(1);
                }
                break;
            case 6:
                if (tanggal > 0 && tanggal <= 30){
                    x = "Juni";
                } else {
                    System.out.println("Tanggal Tidak Valid!");
                    System.exit(1);
                }
                break;
            case 7:
                if (tanggal > 0 && tanggal <= 31){
                    x = "Juli";
                } else {
                    System.out.println("Tanggal Tidak Valid!");
                    System.exit(1);
                }
                break;
            case 8:
                if (tanggal > 0 && tanggal <= 31){
                    x = "Agustus";
                } else {
                    System.out.println("Tanggal Tidak Valid!");
                    System.exit(1);
                }
                break;
            case 9:
                if (tanggal > 0 && tanggal <= 30){
                    x = "September";
                } else {
                    System.out.println("Tanggal Tidak Valid!");
                    System.exit(1);
                }
                break;
            case 10:
                if (tanggal > 0 && tanggal <= 31){
                    x = "Oktober";
                } else {
                    System.out.println("Tanggal Tidak Valid!");
                    System.exit(1);
                }
                break;
            case 11:
                if (tanggal > 0 && tanggal <= 30){
                    x = "November";
                } else {
                    System.out.println("Tanggal Tidak Valid!");
                    System.exit(1);
                }
                break;
            case 12:
                if (tanggal > 0 && tanggal <= 31){
                    x = "Desember";
                } else {
                    System.out.println("Tanggal Tidak Valid!");
                    System.exit(1);
                }
                break;
        }
        return x;
    }
    
    static int CekTahun(int tahun){
        /* Method Cek Tahun disini untuk mengecek 2 digit tahun yang diberikan jika dia tahunnya 40 keatas maka
         * maksunya itu 1940 dan seterusnya, jika 23 maka 2023
         * Otomatis Maksudnya jika 40 tahun ke atas maka 1900 + tahunnya = 1900 + 40 menjadi = 1940 
         * sama halnya dengan 23 = 2000 + 23
         */
        if (tahun >= 24){
            return (1900 + tahun);
        } else {
            return (2000 + tahun);
        }
    }
}