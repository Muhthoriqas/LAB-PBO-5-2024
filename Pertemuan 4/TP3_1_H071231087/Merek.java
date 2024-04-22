public class Merek {
    String nama;
    String pabrik;

    public Merek() {
    }

    public Merek(String nama, String pabrik) {
        this.nama = nama;
        this.pabrik = pabrik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPabrik() {
        return pabrik;
    }

    public void setPabrik(String pabrik) {
        this.pabrik = pabrik;
    }

    public void getInfoMerek() {
        System.out.println("Merek: " + nama);
        System.out.println("Pabrik: " + pabrik);
    }
}























// import java.util.ArrayList;

// public class Merek {
//            String name;
//            String pabrik;
//         //   private ArrayList<String> daftarBarang = new ArrayList<>();

//           public Merek() {

//           }
      
//           public Merek(String name, String pabrik) {
//               this.name = name;
//               this.pabrik = pabrik;
//           }
      
//           // Metode untuk mendapatkan informasi merek
//           public void getInfoMerek() {
//                     System.out.println("========== INFO MEREK ==========");
//                     System.out.println("Nama : " + getName());
//                     System.out.println("Pabrik : " + getPabrik());
//           }
                
      
          // Metode untuk menambahkan barang baru ke merek
        //   public void tambahBarang(String namaBarang, String pabrikBarang) {
        //       daftarBarang.add(namaBarang + " (merek: " + pabrikBarang + ")");
        //   }
      
        //   // Metode untuk menampilkan daftar barang dari merek
        //   public void listBarang() {
        //       System.out.println("Daftar Barang:");
        //       for (String barang : daftarBarang) {
        //           System.out.println(barang);
        //       }
        //   }
      
    //       public String getName() {
    //           return name;
    //       }
      
    //       public void setName(String name) {
    //           this.name = name;
    //       }
      
    //       public String getPabrik() {
    //           return pabrik;
    //       }
      
    //       public void setPabrik(String pabrik) {
    //           this.pabrik = pabrik;
    //       }
    //   }







// public class Merek {
//           String name, pabrik;
//           String[] list;

//           public Merek(){

//           }

//           public void getInfoMerek(String name, String pabrik) {
//                     System.out.println("========== INFO BARANG ==========");
//                     System.out.println("Nama : " + getName());
//                     System.out.println("Pabrik : " + getPabrik());
//           }

//           public void listBarang() {
                    
//           }

//           public Merek(String name, String pabrik) {
//                     this.name = name;
//                     this.pabrik = pabrik;
          
//           }

//           public String getName() {
//                     return name;
//           }

//           public void setName(String name) {
//                     this.name = name;
//           }

//           public String getPabrik() {
//                     return pabrik;
//           }

//           public void setPabrik(String pabrik) {
//                     this.pabrik = pabrik;
//           }

// }
