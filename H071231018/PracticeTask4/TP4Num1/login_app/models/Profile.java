package login_app.models;

public class Profile {
    String fullName, hobby, nickname;
    int umur;

    public Profile( String fullName, String hobby, String nickname, int umur){
        this.fullName = fullName;
        this.hobby = hobby;
        this.nickname = nickname;
        this.umur = umur;
    }

    public Profile(){
        
    }

    public String getFullName(){
        return fullName;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public String getHobby(){
        return hobby;
    }

    public void setHobby(String hobby){
        this.hobby = hobby;
    }

    public String getNickname(){
        return nickname;
    }

    public void setNickname(String nickname){
        this.nickname = nickname;
    }

    public int getUmur(){
        return umur;
    }

    public void setUmur(int umur){
        this.umur = umur;
    }


    // public  void showProfile(String frontName, String lastName, String hobby, String nickname, int umur){
    //     System.out.println("Nickname : " + nickname);
    //     System.out.println("Nama : " +  frontName + lastName);
    //     System.out.println("Hobi : " + hobby);
    //     System.out.println("Umur : " + umur);
    // }
}