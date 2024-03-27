import java.util.Scanner;

class Person {
    String name;
    int age;
    boolean isMale;

    public String getName() {
        name = name.toLowerCase();
        char[] arr = name.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i - 1] == ' ') {
                arr[i] = Character.toUpperCase(arr[i]);
            }
        }
        String result = new String(arr);
        return result;
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

    public boolean getGender() {
        if (isMale) {
            return true;
        } else {
            return false;
        }
    }

    public void setGender(String gender) {
        if (gender.equals("Male") || gender.equals("male")) {
            this.isMale = true;
        } else {
            this.isMale = false;
        }
    }

    public String info() {

        return ("\nYour Data \nName   : " + getName() + "\nAge    : " + age);

    }
}

public class TP2_1_H071231071 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your data please \nName   : ");
        String n = sc.nextLine();
        System.out.print("Age    : ");
        int a = sc.nextInt();
        System.out.print("Gender : ");
        String g = sc.next();

        sc.close();

        Person person1 = new Person();
        person1.setName(n);
        person1.setAge(a);
        person1.setGender(g);

        System.out.println(person1.info());
        System.out.println(person1.getName() + " is Male? " + person1.getGender());
    }
}
