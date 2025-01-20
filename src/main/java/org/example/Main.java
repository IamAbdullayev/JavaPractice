package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double a;
        Double b;
        Double c;

        System.out.println("Enter side \"a\": ");
        a = scanner.nextDouble();

        System.out.println("Enter side \"b\": ");
        b = scanner.nextDouble();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("The hypotenuse is "+ c);

        scanner.close();
    }
}