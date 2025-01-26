package org.example;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Temperature converter

        double temperature;
        double newTemperature;
        String unit;

        System.out.println("This is temperature converter program.\nEnter the temperature: ");
        temperature = scanner.nextDouble();
        System.out.print("If you want converted celsius to fahrenheit, enter ' F ' and you want converted fahrenheit to celsius, enter ' C ': ");
        unit = scanner.next().toUpperCase();
        if (!unit.equals("C") && !unit.equals("F")) {
            System.out.println("You choose invalid option.");
            return;
        }
        newTemperature = (unit.equals("F")) ? (temperature * 1.8 + 32) : ((temperature - 32) / 1.8);

        System.out.printf("The converted temperature is %.2f°%s", newTemperature, unit);

//        if (choose == 1) {
//            System.out.print("Enter temperature in Celsius: ");
//            temperature = scanner.nextDouble();
//            newTemperature = temperature * 1.8 + 32;
//            System.out.printf("%.2f Celsius is %.2f Fahrenheit.", temperature, newTemperature);
//        }
//        else if (choose == 2) {
//            System.out.print("Enter temperature in Fahrenheit: ");
//            temperature = scanner.nextDouble();
//            newTemperature = (temperature - 32) / 1.8;
//            System.out.printf("%.2f Fahrenheit is %.2f Celsius.", temperature, newTemperature);
//        }
//        else {
//            System.out.println("You choose invalid option.");
//        }


        scanner.close();
    }
}