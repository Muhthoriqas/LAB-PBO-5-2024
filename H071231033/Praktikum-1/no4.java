import java.util.InputMismatchException;
import java.util.Scanner;

public class no4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double radius;

        while(true){
            try{
                if(scanner.hasNextDouble()){
                    radius=scanner.nextDouble();
                    break;
                }else{ 
                    throw new InputMismatchException(); 
                }
            }catch(InputMismatchException e){
                scanner.next();
                System.out.println("Masukkan angka valid!");
            }
        }
        
        System.out.println("Luas lingkaran dengan radius " + radius+" adalah: "+String.format("%.2f",hitungLuas(radius)));
        scanner.close();
    }

    public static double hitungLuas(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}