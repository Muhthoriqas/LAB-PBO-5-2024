import java.util.Random;

public class TaskTimeHelper {
    protected static int getAngkaRandom() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}
