package org.example;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String filePath = "C:\\Users\\ramaz\\Downloads\\Billie Eilish - BIRDS OF A FEATHER (from Saturday Night Live, 2024).wav";

        while (alarmTime == null) {
            try {
                System.out.print("Enter the time of alarm (HH:MM:SS): ");
                String inputTime = in.nextLine();
                alarmTime = LocalTime.parse(inputTime, formatter);

                System.out.println("Alarm set for " + alarmTime);
            }
            catch (DateTimeParseException e) {
                System.out.println("Invalid format! Please use HH:MM:SS");
            }
        }

        AlarmClock alarmClock = new AlarmClock(alarmTime, filePath, in);
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();

    }
}
