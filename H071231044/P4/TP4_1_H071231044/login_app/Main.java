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
        System.out.println("-------------------------");
        System.out.println("Aplikasi Login Sederhana");
        System.out.println("-------------------------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Keluar");
        System.out.print("> ");

        String selectMenu = sc.nextLine();
        switch (selectMenu) {
            case "1":
                showLoginMenu();
                break;
            case "2":
                showRegisterMenu();
                break;
            case "3":
                break;
            default:
                System.out.println("Salah input bang");
                runApp();
        }
    }

    private static void showLoginMenu() {
        System.out.println("-------------------------");
        System.out.println("Login");
        System.out.println("Masukkan Username");
        System.out.print("> ");

        String username = sc.nextLine();
        int userIndex = findUserByUsername(username);
        if (userIndex != -1) {
            System.out.println("Password");
            System.out.print("> ");
            String password = sc.nextLine();
            boolean isPasswordMatch = listUser.get(userIndex).getPassword().equals(password);
            if (isPasswordMatch) {
                System.out.println("Berhasil Login");
                showDetailUser(listUserProfile.get(userIndex));
                runApp();
            } else {
                System.out.println("Password Salah");
                showLoginMenu();
            }
        } else {
            System.out.println("Username tidak ditemukan.");
            runApp();
        }
    }

    private static void showRegisterMenu() {
        System.out.println("-------------------------");
        System.out.println("REGISTER");

        System.out.println("Username");
        System.out.print("> ");
        String username = sc.nextLine();
        if (isUsernameTaken(username)) {
            System.out.println("Username sudah digunakan. Silakan gunakan username lain.");
            showRegisterMenu();
            return;
        }
        System.out.println("Password (minimal 8 karakter)");
        System.out.print("> ");
        String password = sc.nextLine();
        if (password.length() < 8) {
            System.out.println("Password harus minimal 8 karakter.");
            showRegisterMenu();
            return;
        }
        User user = new User(username, password);
        Profile profile = new Profile();
        System.out.println("Nama Lengkap");
        System.out.print("> ");
        String fullName = sc.nextLine();
        if (fullName.isEmpty()) {
            System.out.println("Nama tidak boleh kosong.");
            showRegisterMenu();
            return;
        }
        System.out.println("Umur");
        System.out.print("> ");
        int age;
        try {
            age = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Umur harus berupa angka.");
            showRegisterMenu();
            return;
        }
        System.out.println("Hobby");
        System.out.print("> ");
        String hobby = sc.nextLine();
        profile.setFullName(fullName);
        profile.setAge(age);
        profile.setHobby(hobby);
        profile.setNickName(StringUtils.generateNickname(fullName));
        listUser.add(user);
        listUserProfile.add(profile);
        System.out.println("-------------------------");
        System.out.println("Berhasil Membuat User Baru!!");
        runApp();
    }

    private static int findUserByUsername(String username) {
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).getUsername().equals(username)) {
                return i;
            }
        }
        return -1;
    }

    private static boolean isUsernameTaken(String username) {
        return findUserByUsername(username) != -1;
    }

    private static void showDetailUser(Profile profile) {
        System.out.println("Detail User:");
        System.out.println("Nama Lengkap\t: " + profile.getFullName());
        System.out.println("Umur\t\t: " + profile.getAge());
        System.out.println("Hobby\t\t: " + profile.getHobby());
        System.out.println("NickName\t: " + profile.getNickName());
    }
}
