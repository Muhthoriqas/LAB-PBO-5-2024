package Tp8_1_H071231044;
import java.util.*;

class TaskTimeHelper {
    static final Random random = new Random();
    public static int getRandomExecutionTime() {
        return random.nextInt(6) + 1;
    }
}