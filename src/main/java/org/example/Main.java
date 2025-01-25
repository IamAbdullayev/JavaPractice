package org.example;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Compound Interest Calculator
        String email;
        String username;
        String domain;

        System.out.print("Please enter your email: ");
        email = scanner.nextLine();

        if(email.contains("@")) {
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@"));

            System.out.println(username);
            System.out.println(domain);

            scanner.close();
        } else {
            System.out.println("You entered an invalid email address");
        }

    }
}