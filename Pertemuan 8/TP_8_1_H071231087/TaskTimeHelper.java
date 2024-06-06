package TP_8_1_H071231087;

import java.util.Random;

public class TaskTimeHelper {
          public static int getAngkaRandom() {
                    Random random = new Random();
                    int angkaRandom = random.nextInt(6) + 1; 
                    return angkaRandom;
}
}
