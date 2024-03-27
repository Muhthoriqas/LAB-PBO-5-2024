class Person {
    private String name;
    private int age;
    private boolean isMale;

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    
    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }

    public String getIsMale() {
        return isMale ? "male" : "female";
    }

}
public class TP2Num1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Famei");
        person.setAge(18);
        person.setIsMale(false);
        System.out.println("Nama saya " + person.getName() + "\nUmur saya " + person.getAge() + "\nSaya adalah " + person.getIsMale());
    }
}
