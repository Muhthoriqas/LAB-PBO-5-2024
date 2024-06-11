package login_app;

import java.util.ArrayList;
import java.util.Scanner;
import login_app.models.Profile;
import login_app.models.User;
import login_app.utils.StringUtils;

public class Main {
    private static ArrayList<User> listUser = new ArrayList<>();
    private static ArrayList<Profile> listUserProfile = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        runApp();
    }

    private static void runApp() {
        int selectMenu;
        do {
            System.out.println("-------------------------");
            System.out.println("Aplikasi Login Sederhana");
            System.out.println("-------------------------");
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Keluar");
            System.out.print("> ");

            while (!sc.hasNextInt()) {
                System.out.print("Input harus berupa angka.\n> ");
                sc.next(); 
            }
            selectMenu = sc.nextInt();
            sc.nextLine(); 
    
            switch (selectMenu) {
                case 1:
                    showLoginMenu();
                    break;
                case 2:
                    showRegisterMenu();
                    break;
                case 3:
                    System.out.println("-".repeat(25));
                    System.out.println("Keluar dari program. Terimakasih.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan masukkan nomor menu yang benar.");
            }
        } while (true);
    }
    

    private static void showLoginMenu() {
        System.out.println("-------------------------");
        System.out.println("Login");
        System.out.println("Masukkan Username");
        System.out.print("> ");
        int userIndex = -1;
        String username = sc.next();
        
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).getUsername().equals(username)) {
                userIndex = i;
                break; 
            }
        }

        if (userIndex == -1) {
            System.out.println("Username tidak ditemukan, silakan Registrasi terlebih dahulu.");
            runApp();
        }

        while (userIndex != -1) {
            System.out.println("Password");
            System.out.print("> ");
            String password = sc.next();
            boolean isPasswordMatch = listUser.get(userIndex).getPassword().equals(password);
            if (isPasswordMatch) {
                System.out.println("Berhasil Login");
                showDetailUser(listUserProfile.get(userIndex)); 
                System.exit(0);
            } else {
                System.out.println("Password Salah");
            }
        }
        runApp();
    }

    private static void showRegisterMenu() {
        System.out.println("-------------------------");
        System.out.println("REGISTER");
        System.out.println("Username");
        System.out.print("> ");
        String username = sc.nextLine();
        System.out.println("Password");
        System.out.print("> ");
        String password = sc.nextLine();

        boolean isValidPassword = false;
        do {
            System.out.println("Password (harus berisi 8 karakter dan mengandung setidaknya satu huruf besar, satu huruf kecil, dan satu angka)");
            System.out.print("> ");
            password = sc.nextLine();

            boolean containsUpperCase = false;
            boolean containsLowerCase = false;
            boolean containsDigit = false;

            for (char n : password.toCharArray()) {
                if (Character.isUpperCase(n)) {
                    containsUpperCase = true;
                } else if (Character.isLowerCase(n)) {
                    containsLowerCase = true;
                } else if (Character.isDigit(n)) {
                    containsDigit = true;
                }
            }
            isValidPassword = containsUpperCase && containsLowerCase && containsDigit && !password.isEmpty() && password.length() >= 8;
            if (!isValidPassword) {
                System.out.println("Password tidak memenuhi persyaratan.");
            }
            } while (!isValidPassword);
    
        User user = new User(username, password);
        Profile profile = new Profile();

        System.out.println("Nama Lengkap");
        System.out.print("> ");
        String fullName = sc.nextLine();
        System.out.println("Umur");
        System.out.print("> ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Hobby");
        System.out.print("> ");
        String hobby = sc.nextLine();

        profile.setFullName(fullName); 
        profile.setUmur(age);
        profile.setHobby(hobby);
        profile.setNickname(StringUtils.nickName(fullName));

        listUser.add(user);
        listUserProfile.add(profile);
        System.out.println("-------------------------");
        System.out.println("Berhasil Membuat User Baru!!");
        runApp();
    }

    private static void showDetailUser(Profile profile) {
        System.out.println("Detail User:");
        System.out.println("Nama: " + profile.getFullName());
        System.out.println("Umur: " + profile.getUmur());
        System.out.println("Hobby: " + profile.getHobby());
        System.out.println("NickName: " + profile.getNickname());
        runApp();
    }
}