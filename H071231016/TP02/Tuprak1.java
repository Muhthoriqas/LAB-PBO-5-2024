package TP02;

public class Tuprak1 {
    String nama;
    int age;
    boolean isMale;

    public void setName(String nama){
        this.nama = nama;
    }
    public String getName(){
        return nama;
    }
    public void setUmur (int age){
        this.age =age;
    }
    public int getUmur(){
        return age;
    }
    public void setGender(boolean isMale){
        this.isMale = isMale;
    }
    public boolean getGender(){
        return isMale;
    }

    public static void main(String[] args) {
        Tuprak1 person = new Tuprak1();
        
        person.setName ("Athifah");
        person.setUmur(19);
        person.setGender(false);

        System.out.println("Name    : " + person.getName());
        System.out.println("Age     : " + person.getUmur());
        System.out.println("Gender  : " + (person.getGender()? "Male" : "Female"));
    }
}
