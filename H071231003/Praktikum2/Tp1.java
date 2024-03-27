
 class Person {

    String name;
    int age;
    boolean isMale;

    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge( int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }


    public void setGender(boolean gender) {
        this.isMale = gender;
    }
    public String getGender() {
        if (isMale == true){
            return "Laki-laki";
        }else{
            return "Perempuan";
        }
    }

}


public class Tp1{

    public static void main(String[] args) {
        Person person = new Person();
        Person person1 = new Person();
        

        person.setName ("Kiki");
        person.setAge (19);
        person.setGender(false);
        person1.setName ("Frisilia");
        person1.setAge (19);
        person1.setGender(false);

        System.out.println("------------");
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getGender());
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.getGender());
    }
}