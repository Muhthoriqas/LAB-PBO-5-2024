import java.io.File;
import javax.sound.sampled.*;

public abstract class Audio {
    public static void playAudio(String audioFile) {
        File file = new File("bumi.wav");

        Clip clip = null;
        try{
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(file));
        } catch (Exception e){
            e.printStackTrace();
        }

        if (clip != null) {
            clip.start();
            while (!clip.isRunning()) {
                // Menunggu hingga klip dimulai
                Thread.yield();
            }
            while (clip.isRunning()) {
                // Menunggu hingga klip selesai
                Thread.yield();
            }
            clip.close();
        }
    }

    public static void playAudioLose(String audioFile) {
        File file = new File("d2.wav");

        Clip clip = null;
        try{
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(file));
        } catch (Exception e){
            e.printStackTrace();
        }

        if (clip != null) {
            clip.start();
            while (!clip.isRunning()) {
                // Menunggu hingga klip dimulai
                Thread.yield();
            }
            while (clip.isRunning()) {
                // Menunggu hingga klip selesai
                Thread.yield();
            }
            clip.close();
        }
    }
}