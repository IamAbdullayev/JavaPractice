package org.example;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean invalid = true;

        System.out.println("Hello! This is a calculator.");
        System.out.print("Please, enter the first number: ");
        num1 = scanner.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);
        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Cannot to divide by zero!");
                    invalid = false;
                }
                else {
                    result = num1 / num2;
                }
            }
            case '*' -> result = num1 * num2;
            default -> {
                System.out.println("Invalid operator!");
                invalid = false;
            }
        }

        if (invalid) {
            System.out.println(result);
        }

        scanner.close();
    }
}