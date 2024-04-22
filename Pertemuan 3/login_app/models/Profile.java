package models;

public class Profile{
          private String fullname;
          private String nickname;
          private int age;
          private String hobby;

          public String getFullname() {
                    return fullname;
          }
          public void setFullname(String fullname) {
                    this.fullname = fullname;
          }
          public String getNickname() {
                    return nickname;
          }
          public void setNickname(String nickname) {
                    this.nickname = nickname;
          }
          public int getAge() {
                    return age;
          }
          public void setAge(int age) {
                    this.age = age;
          }
          public String getHobby() {
                    return hobby;
          }
          public void setHobby(String hobby) {
                    this.hobby = hobby;
          }
}