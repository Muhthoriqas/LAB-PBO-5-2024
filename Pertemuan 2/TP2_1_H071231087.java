import java.util.Scanner;

public class TP2_1_H071231087 {
    public static void main(String[] args){ //main method
        //Scanner input = new Scanner(System.in);
        Person orang = new Person();

        orang.setAge(18);
        orang.setName("Tia");
        orang.setGender("Perempuan"); 
        
        System.out.println(orang.getAge());
        System.out.println(orang.getName());
        System.out.println("Apakah " + orang.getName() + " adalah seorang laki-laki ? " + orang.getGender());
        //input.close();
    }
}

class Person {
    private String name;
    private int age;
    private String isMale;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }

    void setAge(int age){
        this.age = age;
    }
    int getAge(){
        return age;
    }
    
    void setGender(String gender){
        this.isMale = gender;
    }
    Boolean getGender(){
        if (isMale == "Laki-laki"){
            return true;
        } else {
            return false;
        }
    }


}