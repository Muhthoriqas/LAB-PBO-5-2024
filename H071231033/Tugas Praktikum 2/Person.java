import java.util.Scanner;

public class Person {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        no1 person=new no1();

        System.out.print("Nama: ");
        String nama=scanner.nextLine();
        person.setName(nama);
        System.out.print("Umur: ");
        int umur=scanner.nextInt();
        person.setAge(umur);
        System.out.print("Male?: ");
        boolean gender=scanner.nextBoolean();
        person.setGender(gender);


        System.out.println("\nNama: "+person.getName());
        System.out.println("Umur: "+person.getAge());
        System.out.println("Male?: "+person.getGender());
        scanner.close();
    }
}