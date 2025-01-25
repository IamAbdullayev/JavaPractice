package org.example;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // WEIGHT CONVERSION PROGRAM

        // Declare variables
        double number;
        double convertedNumber = 0;
        String userMeasurementUnit;
        String convertedMeasurementUnit;

        // Get number and unit of measurement
        System.out.println("Hello, this is weight conversion program. Please enter number without unit of measurement. ");
        number = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Choose your measurement unit (kg, lbs, oz): ");
        userMeasurementUnit = scanner.nextLine();
        System.out.println("Enter converted measurement unit (kg, lbs, oz): ");
        convertedMeasurementUnit = scanner.nextLine();

        // Converting
        if(userMeasurementUnit.equals("kg")) {
            if(convertedMeasurementUnit.equals("kg")) {
                convertedNumber = number;
            }
            else if(convertedMeasurementUnit.equals("lbs")) {
                convertedNumber = (number * 2.20462);
            }
            else if(convertedMeasurementUnit.equals("oz")) {
                convertedNumber = (number * 35.274);
            }
//            System.out.println(number + userMeasurementUnit + " = " + convertedNumber);
            System.out.printf("%.2f%s = %.2f%s%n", number, userMeasurementUnit, convertedNumber, convertedMeasurementUnit);
        }

        if(userMeasurementUnit.equals("lbs")) {
            switch (convertedMeasurementUnit) {
                case "kg" -> convertedNumber = (number / 2.20462);
                case "lbs" -> convertedNumber = number;
                case "oz" -> convertedNumber = (number * 28.3495);
            }
            System.out.printf("%.2f%s = %.2f%s%n", number, userMeasurementUnit, convertedNumber, convertedMeasurementUnit);
        }

        if (userMeasurementUnit.equals("oz")) {
            switch (convertedMeasurementUnit) {
                case "kg" -> convertedNumber = (number / 35.274);
                case "lbs" -> convertedNumber = (number / 28.3495);
                case "oz" -> convertedNumber = number;
            }
            System.out.printf("%.2f%s = %.2f%s%n", number, userMeasurementUnit, convertedNumber, convertedMeasurementUnit);
        }

    }
}