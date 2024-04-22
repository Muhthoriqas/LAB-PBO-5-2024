public class Main {
    public static void main(String[] args) {
        Merek merek1 = new Merek("Samsung", "Korea");
        Elektronik elektronik1 = new Elektronik("Toko Elektronik ABC", 10, 123, merek1);

        Merek merek2 = new Merek();
        merek2.setNama("Sharp");
        merek2.setPabrik("Jepang");

        Elektronik elektronik2 = new Elektronik();
        elektronik2.setNamaToko("Toko Elektronik 2");
        elektronik2.setId(1234567);
        elektronik2.setHarga(0);
        elektronik2.setMerek(merek2);

        printBarier();
        elektronik1.getInfoBarang();
        elektronik1.beliDong(40);
        printBarier();
        elektronik2.getInfoBarang();
        elektronik1.beliBarangtokolain(elektronik2); 
    }

    public static void printBarier() {
        System.out.println("===============================================");
    }
}





// public class Main {
//           public static void main(String[] args) {
//               // Membuat objek merek
//               Merek merek = new Merek("Samsung", "Korea");
      
//               // Membuat objek elektronik dengan merek yang telah dibuat
//               Elektronik elektronik = new Elektronik("123", "Toko Elektronik", 1000, merek);
            

//               // Menampilkan informasi merek dari objek elektronik
//               elektronik.getMerekInfo();
      
//               // Menambahkan barang baru ke merek melalui objek elektronik
//               elektronik.tambahBarang("Smartphone", "Samsung");
//               elektronik.tambahBarang("laptop", "hp");
      
//               // Menampilkan daftar barang dari merek melalui objek elektronik
//               elektronik.listBarang();
//           }
//       }
      
