// package login_app;

import java.util.ArrayList;
import java.util.Scanner;
import models.Profile;
import models.User;
import Utils.StringUtils;

public class Main {
    private static ArrayList<User> listUser = new ArrayList<>();
    private static ArrayList<Profile> listUserProfile = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        runApp();
    }

    private static void runApp() {
        System.out.println("-------------------------");
        System.out.println("Aplikasi Login Sederhana");
        System.out.println("-------------------------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("> ");

        int selectMenu = sc.nextInt();
        sc.nextLine();
        switch (selectMenu) {
            case 1:
                showLoginMenu();
                break;
        
            case 2:
                showRegisterMenu();
                break;
            default:
            runApp();
        }
    }

    private static void showLoginMenu() {
        System.out.println("-------------------------");
        System.out.println("Login");
        System.out.println("Masukkan Username");
        System.out.println("> ");

        String username = sc.next();

        int userindex = -1; //diinisialisasikan user indexnya tidak kurang dari -1
        for (int i = 0; i < listUser.size(); i++) { //perulangannya akan berjalan selama nilai i kurang dari ukuran listuser dan nilai inya akan bertambah 1
            // TODO 
            if (username.equals(listUser.get(i).getUsername())){ //mengecek apakah username yang dimasukkan sama dengan username dari listuser
                userindex = i; // jika userindex sama dengan nilai dari i dia akan menyimpan indexnya dalam listUser    
            } 
        } 
        
        if(userindex != -1) {
            System.out.println("Password");
            System.out.println("> ");
            String password = sc.next();
            
            // TODO
            boolean isPasswordMatch = password.equals(listUser.get(userindex).getPassword()); //mengecek apakah sama dengan username yang sudah dimasukkan dan mengakses password dari listuser 

            if (isPasswordMatch) {
                System.out.println("Berhasil Login");
                showDetailUser(listUserProfile.get(userindex));
                System.exit(0);
            } else {
                System.out.println("Password Salah");
            }
        } else {
            System.out.println("Username salah. Silahkan coba lagi.");
            showLoginMenu();
        }
    }


    private static void showRegisterMenu() {
        System.out.println("-------------------------");
        System.out.println("REGISTER");

        System.out.println("Username");
        System.out.println("> ");
        String username = sc.nextLine();
        System.out.println("Password");
        System.out.println("> ");
        String password = sc.nextLine();

        //TODO Instance objek User baru ?
        User user = new User();
        user.setUsername(username);
        
        user.setPassword(password);

        //TODO Instance objek Profile baru ?
         Profile profile = new Profile();

         System.out.println("Nama Lengkap");
         System.out.println("> ");
         String fullname = sc.nextLine();

         System.out.println("Umur");
         System.out.println("> ");
         int age = sc.nextInt();
         sc.nextLine();

         System.out.println("Hobby");
         System.out.println("> ");
         String hobby = sc.nextLine();

         //TODO ?
         profile.setFullname(fullname);
         profile.setAge(age);
         profile.setHobby(hobby);

         //TODO nickname ?
         String nickname = StringUtils.ambilNickname(profile);
         profile.setNickname(nickname);


         listUser.add(user);
         listUserProfile.add(profile);
         System.out.println("-------------------------");
         System.out.println("Berhasil Membuat User Baru!");
         runApp();
    }

    private static void showDetailUser(Profile profil) {
        //TODO
        System.out.println("-------------------------");
        System.out.println("SELAMAT DATANG !!");
        System.out.println("-------------------------");
        System.out.println("Nama Lengkap   : " + profil.getFullname());
        System.out.println("Nama Panggilan : " + profil.getNickname());
        System.out.println("Umur           : " + profil.getAge());
        System.out.println("Hobby          :" + profil.getHobby());
    }
}