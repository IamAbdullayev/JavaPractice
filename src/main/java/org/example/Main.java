package org.example;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // The Quiz Game

        String[] quetions = {"What is the main function of a router?",
                             "Which part of the computer considered with brain?",
                             "What year was Facebook launched?",
                             "Who known as the father of computer?",
                             "What was the first programming language?"};

        String[][] options = {{"1. Storing files", "2. Encrypting data", "3. Directing internet traffic", "4. Managing passwords"},
                              {"1. HDD", "2. CPU", "3. RAM", "4. GPU"},
                              {"1. 2004", "2. 2001", "3. 2009", "4. 2024"},
                              {"1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles Babbage"},
                              {"1. COBOL", "2. C", "3. Fortran", "4. Assembly"}};

        int[] answers = {3, 2, 1, 4, 3};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================");
        System.out.println("Welcome to the Quiz Game!");
        System.out.println("==========================");

        for (int i = 0; i < quetions.length; ++i) {
            System.out.println(quetions[i]);
            for (int j = 0; j < options[i].length; ++j) {
                System.out.println(options[i][j]);
            }
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            if (guess == answers[i]) {
                System.out.println("=======");
                System.out.println("CORRECT");
                System.out.println("=======");
                score++;
            } else {
                System.out.println("=====");
                System.out.println("WRONG");
                System.out.println("=====");
            }
        }
        System.out.println("Your final score is: " + score + " out of " + quetions.length);

        scanner.close();
    }
}
