import java.util.Scanner; // Meng-import class scanner agar dapat menginput dari user

public class TP2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Masukkan Judul Film :\n> "); // print String
        String judul = input.nextLine(); // Menginput nextLine yaitu mengambil satu baris penuh dengan tipe data String
        judul = judul.toLowerCase();
        System.out.println(hurufJudul(judul)); // Memprint sebuah method bernama hurufJudul dengan parameter judul
        input.close(); // Input di close
    }
    static String hurufJudul(String judul){ // Method yang mengembalikan nilai String dengan parameter bertipe string
        String[] arrString = judul.split(" "); // Kalau dalam python ini namanya list tapi sekarang disebut Array
        // String[] adalah array yang bertipe data String yang dimana nilainya atau valuenya merupakan judul.split(" "), maksudnya judul.split, String judul tersebut akan dipisah dengan spasi " ",
        // Misal "aku Pulang" maka isi dari array string itu menjadi ["aku", "Pulang"]
        for (int i = 0; i < arrString.length; i++){ // Perulangan sebanyak panjang (length) dari array string tersebut
            arrString[i] = Character.toUpperCase(arrString[i].charAt(0)) + arrString[i].substring(1);
        
        }
        // Setelah kita mengubah seluruh kata di dalam array tersebut kita menyusunnya kembali dan menggabungnya kembali
        String hasil = String.join(" ", arrString); // disini kita join, artinya menggabungkannya kembali dengan delimiternya/pemisahnya yaitu " " spasi 
        return hasil; // Mengembalikan nilai hasil, dikembalikan (direturn) karena fungsi kita bukan Void, tapi bertipe data.
    }
}
