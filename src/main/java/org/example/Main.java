package org.example;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        System.out.println(Math.PI);
//        System.out.println(Math.E);
//        System.out.println(Math.TAU+"\n");
//
//        double result;
//
//        result = (int) Math.pow(2, 5);
//        System.out.println(result);
//        result = Math.sqrt(4);
//        System.out.println(result);
//        result = Math.abs(-5);
//        System.out.println(result);
//        result = Math.round(6.4);
//        System.out.println(result);
//        result = Math.ceil(6.2);
//        System.out.println(result);
//        result = Math.floor(6.7);
//        System.out.println(result);
//        result = Math.max(8, 9);
//        System.out.println(result);
//        result = Math.min(8, 9);
//        System.out.println(result);

        Scanner scanner = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius of circle: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("The circumference of the circle is %.1fcm\nThe area of the circle is %.1fcm²\nThe volume of the circle is %.1fcm³\n", circumference, area, volume);
    }
}