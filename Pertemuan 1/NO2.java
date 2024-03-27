import java.util.Scanner;

public class NO2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String userinput = new String();

        try {
            System.out.println("Masukkan Judul Film : ");
            userinput = sc.nextLine();
        } catch (Exception e) {
            System.out.println("Text Tidak Valid!");
        }

        sc.close();

        System.out.println(Title(userinput));

    }

    public static String Title(String userinput) {
        userinput = userinput.toLowerCase();
        char[] inputArray = userinput.toCharArray();

        for (int i = 0; i < inputArray.length; i++) {

            if (i == 0 || inputArray[i - 1] == ' ') {

                inputArray[i] = Character.toUpperCase(inputArray[i]);
            }
        }
        String result = new String(inputArray);
        return result;
    }

}
