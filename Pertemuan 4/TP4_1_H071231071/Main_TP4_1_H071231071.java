package TP4_1_H071231071;

import java.util.ArrayList;
import java.util.Scanner;
import TP4_1_H071231071.models.Profile;
import TP4_1_H071231071.models.User;
import TP4_1_H071231071.utils.StringUtils;

public class Main_TP4_1_H071231071 {
    private static ArrayList<User> listUser = new ArrayList<>();
    private static ArrayList<Profile> listUserProfile = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Memanggil method runApp();
        runApp();
    }

    private static void runApp() {
        // Menu Utama Aplikasi
        System.out.println("-------------------------");
        System.out.println("Aplikasi Login Sederhana");
        System.out.println("-------------------------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.print("> ");

        // Menginput pilihan menu
        int selectMenu = sc.nextInt();
        sc.nextLine();
        switch (selectMenu) {
            case 1:
                // Membuka Halaman Login
                if (listUser.isEmpty()) {
                    System.out.println("Registrasi terlebih dahulu");
                    showRegisterMenu();
                } else {
                    showLoginMenu();
                }
                break;
            case 2:
                // Membuka Halaman Register
                showRegisterMenu();
                break;
            default:
                // Mengulang Pemanggilan Menu Utama
                runApp();
        }
    }

    private static void showLoginMenu() {
        // Halaman Login
        System.out.println("-------------------------");
        System.out.println("Login");
        // Menginput Username dan Menyimpannya di attribute username;
        System.out.println("Masukkan Username");
        System.out.print("> ");

        String username = sc.next();

        // Membuat variabel userIndex yang mana nanti akan menampung index dari user
        int userIndex = -1;
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).getUsername().equals(username)) {
                userIndex = i;
                break;
            }
        }
        // Saat userIndex tidak sama dengan -1 atau userIndexnya ditemukan
        if (userIndex != -1) {
            // Menginput Password
            System.out.println("Password");
            System.out.print("> ");
            boolean isPasswordMatch;
            do {
                String password = sc.next();
                /*
                 * Todo
                 * Mengecek apakah password dari User yang login berdasarkan username
                 * sama dengan password yang diinput sebelumnya, kemudian simpan
                 * hasilnya di variabel isPasswordMatch
                 */
                isPasswordMatch = listUser.get(userIndex).getPassword().equals(password); // ditambahkan
                if (isPasswordMatch) {
                    System.out.println("Berhasil Login");
                    /*
                     * Todo
                     * panggil method showDetailUser dan kirimkan data Profile User yang login
                     * 
                     */
                    showDetailUser(listUserProfile.get(userIndex)); // ini ditambahkan
                    System.exit(0);
                    // Jika passwordnya sama maka berhasil login
                } else {
                    // saat password salah akan menampikan password salah
                    System.out.println("Password Salah");
                }
            } while (!isPasswordMatch);
        } else {
            System.out.println("Username tidak di temukan");
        }
    }

    private static void showRegisterMenu() {
        System.out.println("-------------------------");
        System.out.println("REGISTER");

        // Menginput username dan password
        String username, password;
        do {
            System.out.println("Username ");
            System.out.print("> ");
            username = sc.nextLine().trim();
        } while (username.isEmpty());

        do {
            System.out.println("Password (minimal 8 karakter)");
            System.out.print("> ");
            password = sc.nextLine().trim();
        } while (password.isEmpty() || password.length() < 8);

        // mengecek jika username sudah ada
        boolean usernameExists;
        do {
            usernameExists = false;
            for (User existingUser : listUser) {
                if (existingUser.getUsername().equals(username)) {
                    usernameExists = true;
                    System.out.println("Username sudah digunakan, silakan masukkan username lain");
                    System.out.print("> ");
                    username = sc.nextLine().trim();
                    break;
                }
            }
        } while (usernameExists);

        // Menginput Data Profile
        String fullName, hobby;
        int age;
        System.out.println("Nama Lengkap");
        System.out.print("> ");
        fullName = sc.nextLine();
        System.out.println("Umur");
        do {
            System.out.print("> ");
            while (!sc.hasNextInt()) {
                System.out.println("Umur harus berupa angka");
                System.out.print("> ");
                sc.next();
            }
            age = sc.nextInt();
            sc.nextLine();
        } while (age <= 0);

        System.out.println("Hobby");
        System.out.print("> ");
        hobby = sc.nextLine();

        Profile profile = new Profile(fullName, age, hobby);
        String nickname = StringUtils.ambilNick(profile);
        profile.setNickname(nickname);

        // Menambahkan user yang dibuat ke list user
        listUser.add(new User(username, password));
        // Menambahkan profile user yang dibuat ke list profile
        listUserProfile.add(profile);
        System.out.println("-------------------------");
        System.out.println("Berhasil Membuat User Baru!!");
        runApp();
    }

    private static void showDetailUser(Profile profile) {
        /*
         * Todo *
         * Tampilkan semua data profile user yang login
         */
        System.out.println("-------------------------");
        System.out.println("SELAMAT DATANG !!");
        System.out.println("-------------------------");
        System.out.println("Nama Lengkap    : " + profile.getNama());
        System.out.println("Nama Panggilan  : " + profile.getNickName());
        System.out.println("Umur            : " + profile.getUmur());
        System.out.println("Hobby           : " + profile.getHobi());

    }
}
