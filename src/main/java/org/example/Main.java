package org.example;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String filePath = "C:\\Users\\ramaz\\Desktop\\letter.txt";
        String textContent = """
                Hi, my name is Ramazan.
                I'm 23 years old. I want to get a job in your company.
                I can write code in Java and other programming languages.
                What do I need to do to get a job in your company?
                """;

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(textContent);
            System.out.println("File has been written! ;D");
        }
        catch (FileNotFoundException e) {
            System.out.println("Could not locate file location! :o");
        }
        catch (IOException e) {
            System.out.println("Could not write file! :|");
        }

        in.close();
    }
}
