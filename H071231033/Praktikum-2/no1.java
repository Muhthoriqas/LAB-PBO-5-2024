public class no1 {
    public String name;
    public int age;
    public boolean isMale;
    
    public void setName(String name){
        this.name=name;
    }
    
    public void setAge(int age){
        this.age=age;
    }
    public void setGender(boolean isMale){
        this.isMale=isMale;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getGender(){
        // return isMale ? "Male" : "Not male"; //ternary operator(kyk if else)
        if (isMale==true){
            return "Male";
        }else{
            return "Not male";
        }
    }
}