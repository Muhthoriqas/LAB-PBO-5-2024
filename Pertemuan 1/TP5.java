import java.util.Scanner;
public class TP5 {
    public static void main(String[] args){
        int[][] nums = {{1, 2, 3}, 
        {4, 5, 2}, 
        {7, 8, 9}}; // Array Bertipe Data Integer tapi bukan Array biasa karena [][] tetapi namanya Multidimensional Array!
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai yang ingin dicari : ");
        try {
            int angka = input.nextInt();
        String hasil = ""; // Hasilnya String Kosong karena nanti akan diubah menjadi sesuai apa yang diinginkan soal
        for (int i = 0; i < nums.length; i++){  //nums.length ini mengarah ke panjang dari array variabel Nums yaitu 3
            for (int j = 0; j < nums[i].length; j++){ //disini nums[i].length mengacu ke panjang dari array ke-i didalam arrayNums, maka jawabannya juga 3 karena {1, 2, 3}
                if (nums[i][j] == angka){ // Disini Mengecek apakah ada atau apakah didalam arraynya sama dengan angka yang kita ingin cari, jika tidak ada maka, lanjut sampai ada
                    // hasil = String.format("Found %d at [%d][%d]", angka, i, j);
                    System.out.println("Found " + angka + " at [" + i + "]" + "[" + j +"]"   ); // Jika ada akan ke baris ini dengan mengganti hasil yang awalnya "" menjadi itu
                    break; 
                }
            }
            if (hasil != ""){ // Disini mengecek apakah masih kosong hasilnya atau artinya apakah tidak ditemukan karena hasil belum terisi sama sekali
                break; // Kalau memang sudah terisi (hasil != "") maka akan break dan menghentikan loopingnya
            }
        }
        input.close();
        System.out.println(hasil); //Print hasil
        } catch (Exception e){
            System.out.println("Masukan Bukan Angka");
        }
        //Penggunaan Try Catch disini untuk mengendalikan error ketika bukan angka yang diinput
    }
}
