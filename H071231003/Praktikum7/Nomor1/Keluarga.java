package Nomor1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Keluarga {
    String status1;
    Scanner input = new Scanner(System.in);

    public void status() {
        boolean valid = false;
        while (!valid) {
            try{
                System.out.print("Sudah menikah? (y/t) ");
                String inputan = input.nextLine().toLowerCase();
                if (inputan.equalsIgnoreCase("y")) {
                    this.status1 = "Sudah menikah";
                    valid = true;
                }else if (inputan.equalsIgnoreCase("t")) {
                    this.status1 = "Belum menikah";
                    valid = true;
                }else{
                    System.out.println("Inputan hanya (y/t)");
                }
            }catch (InputMismatchException e) {
                System.out.println("inputan tidak valid");
                input.nextLine();
            }
        }
    }
}