import java.util.Scanner;

class Data{
    String name;
    int age;
    boolean isMale;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(boolean isMale) {
        this.isMale = isMale;
    }
    public String getGender() {
        return isMale ? "Laki-laki" : "Perempuan";
    }
}

public class TP2_1_H071231044 {

    public static void main(String[] args) {
        Data orang = new Data();

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama : ");
        String name = input.nextLine();
        boolean Ceknama = false;
        while (!Ceknama) {
            if (name.replaceAll(" ", "").matches("[a-zA-Z]+")) {
                Ceknama = true;
                break;
            } else {
                System.out.println("Nama harus berisi karakter huruf. Coba lagi.\n");
                System.out.print("Masukkan nama : ");
                name = input.nextLine();
            }
        }

        System.out.print("Masukkan Umur : ");
        while (!input.hasNextInt()) {
            System.out.println("Umur harus berupa angka. Coba lagi.\n");
            System.out.print("Masukkan umur: ");
            input.next();
        }
        int age = input.nextInt();

        System.out.print("Jenis kelamin Laki-laki atau Perempuan ? [true/false]");
        while (!input.hasNextBoolean()) {
            System.out.println("Input harus true atau false. Coba lagi.\n");
            System.out.print("Jenis kelamin Laki-laki atau Perempuan ? [true/false] ");
            input.next();
        }
        boolean ismale = input.nextBoolean();

        input.close();

        orang.setName(name);
        orang.setAge(age);
        orang.setGender(ismale);

        System.out.println("\nNama\t: " + orang.getName());
        System.out.println("Umur\t: " + orang.getAge());
        System.out.println("Gender\t: " + orang.getGender());
    }
}