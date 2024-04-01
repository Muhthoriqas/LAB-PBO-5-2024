package TP02;

import java.util.Scanner;

public class Tuprak1a {
    String nama;
    int umur;
    boolean isMale;

    public void setName (String nama){
        this.nama = nama;
    }
    public String getName(){
        return nama;
    }
    public void setAge(int umur){
        this.umur = umur;
    }
    public int getAge(){
        return umur;
    }
    public void setGender(boolean isMale){
        this.isMale = isMale;
    }
    public boolean getGender(){
        return isMale;
    }
    
    public static void main(String[] args) {
        Tuprak1a person = new Tuprak1a();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Name  : ");
        String nama = scanner.nextLine();
        person.setName(nama);

        System.out.print("Input Age   : ");
        int umur = scanner.nextInt();
        person.setAge(umur);

        System.out.print("The gender is Male(true/false):");
        boolean isMale = scanner.nextBoolean();
        person.setGender((isMale));

        scanner.close();

        System.out.println("\nThe Result below\n");
        System.out.println("Name    : " + person.getName());
        System.out.println("Age     : " + person.getAge());
        System.out.println("Gender  : " + (person.getGender()? "Male" : "Female"));


    }
}
