package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();


        String filePath = "C:\\Users\\ramaz\\Desktop\\words.txt";
        ArrayList<String> words = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                words.add(line.trim());
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Could not locate file!");
        }
        catch (IOException e) {
            System.out.println("Something went wrong...");
        }

        String word = words.get(random.nextInt(words.size()));

        int wrongGuesses = 0;

        ArrayList<Character> wordState = new ArrayList<>();
        for (int i = 0; i < word.length(); ++i) {
            wordState.add('_');
        }

        System.out.println("************************");
        System.out.println("Welcome to Hangman Game!");
        System.out.println("************************");

        while (wrongGuesses < 6) {
            System.out.print(getHangmanArt(wrongGuesses));

            System.out.print("Word: ");
            for (char c : wordState) {
                System.out.print(c + " ");
            }
            System.out.println();

            System.out.print("Guess a letter: ");
            char guess = in.next().toLowerCase().charAt(0);

            if (word.indexOf(guess) >= 0) {
                System.out.println("Correct");
                for (int i = 0; i < word.length(); ++i) {
                    if (word.charAt(i) == guess) {
                        wordState.set(i, guess);
                    }
                }

                if (!wordState.contains('_')) {
                    System.out.println(getHangmanArt(wrongGuesses));
                    System.out.println("You win!");
                    System.out.println("The word is: " + word);
                    break;
                }
            } else {
                System.out.println("Wrong guess!");
                wrongGuesses++;
            }
        }

        if (wrongGuesses >= 6) {
            System.out.print(getHangmanArt(wrongGuesses));
            System.out.println("GAME OVER!");
            System.out.println("The word is: " + word);
        }


        in.close();
    }

    static String getHangmanArt(int wrongGuesses) {
        return switch (wrongGuesses) {
            case 1 -> """
                      o


                    """;

            case 2 -> """
                      o
                      |

                    """;

            case 3 -> """
                      o
                     /|

                    """;

            case 4 -> """
                      o
                     /|\\

                    """;

            case 5 -> """
                      o
                     /|\\
                     /
                    """;

            case 6 -> """
                      o
                     /|\\
                     / \\
                    """;

            default -> "";
        };
    }
}
