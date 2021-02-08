package SpaceX_OOP_Fantasy_Plane_Fight;

import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
import javax.swing.*;

public class SoundClipTest extends JFrame {

    // Constructor
    public SoundClipTest() {

        try {

            URL url = this.getClass().getClassLoader().getResource("\\sound\\FunInstrumental.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);

            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }

    }

}
