import java.util.Scanner; // supaya bisa mengakses kelas scanner yang dimana kelas scanner pengguna dapat memasukkan inputam

public class TP1 { // Membuat Class yang bernama TP1 yang harus sama dengan nama filenya
    public static void main(String[] args){ // main method  yang dimana dapat dimasukkan seluruh perintah yang akan dituliskan nnti
        Scanner input = new Scanner(System.in); // membuat objek dari Scanner yang akan digunakan untuk menginput dari user
        int jumlahBilanganBulat = 0, jumlahBilanganDesimal = 0, jumlahHuruf = 0; // Membuat 3 variabel bertipe data integer dan memberikan nilai 0 kesetiap variabelnya
        int x = input.nextInt(); // Membuat variabel X yang dimana valuenya berdasarkan dari input penguguna
        for (int i = 0; i < x; i++){ // Perulangan for sebanyak X kali yang diinput, i nya akan berulang selagi i kurang dari X
            try { // blok try-catch disini artinya mencoba terlebih dahulu, nantinya jika eror atau menangkap sesuatu eror akan masuk ke blok kode catch (Exception e)
                try { 
                    int angka = input.nextInt();
                    jumlahBilanganBulat++; // Disini maksudnya jika angka yang diinput merupakan angka Int maka Jumlah Bilangan bulat otomatis tambah 1
                    angka = angka+1; // Gunanya agar variabel angka pernah digunakan dapat dihapus
                } catch (Exception e){
                    double angka = input.nextDouble();
                    angka = angka+1;
                    jumlahBilanganDesimal++; // Sama dengan diatas
                }
            } catch (Exception e) {
                jumlahHuruf++; //Disini jika memang apa yang kita input bukan merupakan antara int atau double maka dia masuk ke blok catch ini dan akan menambah variabel Jumlah huruf sebanyak 1
            }
        }
        input.close(); // Menutup input agar tak ada lagi yang bisa diinput
        if (jumlahHuruf == 0){ // Disini hanya membuat kondisi jika memang tidak ada error atau tidak ditemukan huruf  maka yang diprint sisa jumlah bilangan bulat dan juga bilangan desimal, jika ada maka 3 yaitu jumlah int, double, dan huruf
            System.out.println(jumlahBilanganBulat + " Bilangan Bulat\n" + jumlahBilanganDesimal + " Bilangan Desimal"); // Ingat \n merupakan enter atau baris baru
        } else {
            System.out.println(jumlahBilanganBulat + " Bilangan Bulat\n" + jumlahBilanganDesimal + " Bilangan Desimal\n" + jumlahHuruf + " Huruf/Karakter");
        }
    }
}
