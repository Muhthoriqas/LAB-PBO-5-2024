import java.util.Scanner; 

public class tp1 {

    public static void main(String[] args) {
        try {

        Scanner input = new Scanner(System.in); //utk membaca inputan dari user
        System.out.print(" masukan jumlah bilangan: ");
        int n = input.nextInt(); //menyimpan 
        if (n<1) {
            System.out.println(" jumlah bilangan harus lebih dari nol");
            return;
        }

        //untuk menyimpan jumlah bil.bulat & desimal
        int bilanganBulat = 0 , bilanganDesimal = 0;

        System.out.print(" masukan bilangan: ");

        //perulangan untuk membaca n bilangan
        for (int i = 0; i < n; i++) {
                double bilangan = input.nextDouble();
                if (bilangan % 1 == 0) {
                    bilanganBulat++;
                }else {
                    bilanganDesimal++;
                }
               
            } 
            System.out.println();
            System.out.println(bilanganBulat + " Bilangan Bulat");
            System.out.println(bilanganDesimal + " Bilangan Desimal");
        }catch (Exception e) {
            System.out.println("input bukan angka");
        }
        
    }
    
}
