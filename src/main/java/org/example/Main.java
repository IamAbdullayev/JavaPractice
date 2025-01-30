package org.example;
import java.util.Scanner;
import java.util.Random;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double balance = 0;
        boolean isRunning = true;
        double amount = 0;
        int choice;

        while(isRunning) {
            System.out.println("========================");
            System.out.println("BANKING PROGRAM");
            System.out.println("========================");
            System.out.println("1. Show Balance\n2. Deposit\n3. Withdraw\n4. Exit");
            System.out.println("========================");
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch(choice) {
                case 1 -> getBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("It is invalid choice.");
            }
        }

        scanner.close();
    }

    static double deposit() {
        double amount;
        System.out.print("Enter an amount to be deposited: ");
        amount = scanner.nextDouble();
        if(amount < 0) {
            System.out.println("Amount can't be negative.");
            return 0;
        } else {
            return amount;
        }
    }

    static double withdraw(double balance) {
        double amount;
        System.out.print("Enter an amount to be withdraw: ");
        amount = scanner.nextDouble();
        if(amount < 0 || amount > balance) {
            System.out.println("Amount can't be negative and greater than balance.");
            return 0;
        } else {
            return amount;
        }
    }

    static void getBalance(double balance) {
        System.out.println("========================");
        System.out.printf("Your currently balance: %.2f%n%n", balance);
    }
}
