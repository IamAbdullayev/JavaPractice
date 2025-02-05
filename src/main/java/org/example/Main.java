package org.example;
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String filePath = "C:\\Users\\ramaz\\Desktop\\JavaEE_copy.docx";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            System.out.println("File exist! ;D\n");

            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }

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
