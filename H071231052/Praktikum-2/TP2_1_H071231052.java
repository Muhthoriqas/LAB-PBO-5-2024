package Praktikum.Praktikum2;

public class TP2_1_H071231052 {
    public String name;
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
    public String getGender() {
        return isMale? "Pria" : "Wanita";
    }
    public void setGender(boolean isMale) {
        this.isMale = isMale;
    }
}
