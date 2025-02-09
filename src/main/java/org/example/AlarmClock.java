package org.example;

import javax.sound.sampled.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class AlarmClock implements Runnable {

    private final LocalTime alaramTime;
    private final String filePath;
    private final Scanner in;

    AlarmClock(LocalTime alarmTime, String filePath, Scanner in) {
        this.alaramTime = alarmTime;
        this.filePath = filePath;
        this.in = in;
    }

    @Override
    public void run() {

        while (LocalTime.now().isBefore(alaramTime)) {

            try {
                Thread.sleep(1000);

                LocalTime now = LocalTime.now();
                System.out.printf("\r%02d:%02d:%02d", now.getHour(), now.getMinute(), now.getSecond());

            }
            catch (InterruptedException e) {
                System.out.println("Thread was interrupted!");
            }

        }

        System.out.println("\n**Alarm noises**");
        playSound(filePath);

    }

    private void playSound(String filePath) {

        File audioFile = new File(filePath);

        try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile)) {

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            System.out.println("Press *ENTER* to stop the alarm");
            in.nextLine();
            clip.stop();

            in.close();
        }
        catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file format is not supported!");
        }
        catch (LineUnavailableException e) {
            System.out.println("Audio is unavailable");
        }
        catch (IOException e) {
            System.out.println("Something went wrong..");
        }
    }

}
