package org.example;
import javax.sound.sampled.*;
import javax.xml.stream.events.StartDocument;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String pathFile = "C:\\Users\\ramaz\\Downloads\\Billie Eilish - BIRDS OF A FEATHER (from Saturday Night Live, 2024).wav";
        File file = new File(pathFile);

        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Scanner in = new Scanner(System.in)) {

            System.out.println("AAA");

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

            String response = "";

            while (!response.equals("Q")) {
                System.out.println("Play = P");
                System.out.println("Stop = S");
                System.out.println("Reset = R");
                System.out.println("Quit = Q");

                System.out.print("Enter your choice: ");
                response = in.nextLine().toUpperCase();

                switch (response) {
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice!");
                }

            }

        }
        catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file is not supported! ;o");
        }
        catch (FileNotFoundException e) {
            System.out.println("Could not locate file! ;D");
        }
        catch (LineUnavailableException e) {
            System.out.println(";A");
        }
        catch (IOException e) {
            System.out.println("Something went wrong! ;p");
        }
    }
}
