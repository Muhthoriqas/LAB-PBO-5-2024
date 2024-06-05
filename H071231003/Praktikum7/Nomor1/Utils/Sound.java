package Nomor1.Utils;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sound {

    public static void Accept(String audioFile) {
        File file = new File(audioFile);

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

