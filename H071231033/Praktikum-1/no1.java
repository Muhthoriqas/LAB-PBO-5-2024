import java.util.Scanner;

public class no1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int baris1;
        double baris2;
        int bilBulat = 0;
        int bilDesimal = 0;

        try {
            baris1=scanner.nextInt(); //jika bil. bulat masuk
        if (baris1>=0){
            for (int i=0; i<baris1; i++){
                if(scanner.hasNextDouble()) { //jika bilangan apapun masuk
                    baris2=scanner.nextDouble();
                    if (baris2 % 1 ==0){ //jika bil. bulat yang masuk
                        bilBulat++;
                    }else {
                        bilDesimal++;
                    }
                }else{ //jika bukan bil. yang masuk
                    System.out.println("Inputan Salah");
                    scanner.next();
                    i--;
                }
            }

        System.out.println(bilBulat+" Bilangan Bulat");
        System.out.println(bilDesimal + " Bilangan Desimal");

        }else { //jika baris1 tidak >= 0
            System.out.println("Masukkan Bilangan Bulat");
        }
        }catch (Exception e){ //jika bukan bil. bulat yang masuk
            System.out.println("Masukkan Bilangan Bulat");
        }
        
        scanner.close();
    }
}