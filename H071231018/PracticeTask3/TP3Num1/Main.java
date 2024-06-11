import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static ArrayList<MotoGP> pembalapList = new ArrayList<>();
    
    public static void main(String[] args) {
        Motor motor1 = new Motor("Aprilia", 363.60);
        Motor motor2 = new Motor("Honda", 350.5);
        Motor motor3 = new Motor("Ducati", 364.80);
        Motor motor4 = new Motor("KTM", 366.10);
        Motor motor5 = new Motor("Honda", 349.30);

        MotoGP pembalap1 = new MotoGP("Maverick Vinales", motor1);
        MotoGP pembalap2 = new MotoGP("Marc Marquez", motor2);
        MotoGP pembalap3 = new MotoGP("Enea Bastianini", motor3);
        MotoGP pembalap4 = new MotoGP("Brad Binder", motor4);
        MotoGP pembalap5 = new MotoGP("Dani Pedrosa", motor5);

        pembalapList.add(pembalap1);
        pembalapList.add(pembalap2);
        pembalapList.add(pembalap3);
        pembalapList.add(pembalap4);
        pembalapList.add(pembalap5);

        Scanner n = new Scanner(System.in);
        String input = "";
        System.out.println("==========SELAMAT DATANG DI MOTOGP==========");
        while (!input.equalsIgnoreCase("N")) {
            System.out.println("Ingin memulai balapan? (Y/N)");
            input = n.nextLine();
            if (input.equalsIgnoreCase("Y")) {
                for (int i = 0; i < pembalapList.size(); i++) {
                    System.out.println((i + 1) + ". " + pembalapList.get(i).info());
                }
                System.out.print("Pilih pembalap pertama: ");
                int balap1 = n.nextInt() - 1;
                System.out.print("Pilih pembalap kedua: ");
                int balap2 = n.nextInt() - 1;
                n.nextLine(); // consume the newline character
                pembalapList.get(balap1).balapWoo(pembalapList.get(balap2));
            } else if (!input.equalsIgnoreCase("N")) {
                System.out.println("Input tidak valid, silakan masukkan Y atau N.");
            }
        }

        while (input.equalsIgnoreCase("N")){
            System.out.println("Pilih menu lainnya:");
            System.out.println("1. Tampilkan info pembalap\n2. Ganti motor pembalap\n3. Upgrade motor pembalap\n4. Daftarkan diri menjadi pembalap\n5. Keluar dari MotoGP");
            System.out.print("> ");
            int menu = n.nextInt();
            n.nextLine();
            switch (menu) {
                case 1:
                    System.out.println("Berikut adalah info pembalap: ");
                    for (int i = 0; i < pembalapList.size(); i++) {
                        System.out.println((i + 1) + ". " + pembalapList.get(i).getInfo());
                    }
                    break;
                case 2:
                    System.out.print("Pilih pembalap untuk mengganti motor: ");
                    int index = n.nextInt() - 1;
                    n.nextLine();
                    System.out.print("Masukkan merk motor baru: ");
                    String brandBaru = n.nextLine();
                    System.out.print("Masukkan top speed motor baru: ");
                    double tsBaru = n.nextDouble();
                    pembalapList.get(index).getMotor().gantiMotor(brandBaru, tsBaru);
                    break;
                case 3:
                    System.out.print("Pilih pembalap untuk mengganti motor: ");
                    int index2 = n.nextInt() - 1;
                    n.nextLine();
                    System.out.print("Masukkan top speed motor baru: ");
                    double tsBaru2 = n.nextDouble();
                    pembalapList.get(index2).getMotor().upgradeMotor(tsBaru2);
                    break;
                case 4:
                    System.out.print("Masukkan nama Anda: ");
                    String namaPembalapBaru = n.nextLine();
                    
                    System.out.print("Masukkan merk motor Anda: ");
                    String brandMotorBaru = n.nextLine();
                    System.out.print("Masukkan top speed motor Anda: ");
                    double tsMotorBaru = n.nextDouble();
                    Motor motorBaru = new Motor(brandMotorBaru, tsMotorBaru);
                    MotoGP pembalapBaru = new MotoGP(namaPembalapBaru, motorBaru);
                    pembalapList.add(pembalapBaru);
                    System.out.println("Anda telah berhasil mendaftar sebagai pembalap baru.");
                    break;
                case 5:
                    System.out.println("=============SAMPAI JUMPA LAGI=============");
                    System.exit(0);
                default:
                    System.out.println("Input tidak valid.");
                    break;
                }
        }
        n.close();
    }
}
