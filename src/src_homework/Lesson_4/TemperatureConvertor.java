package src_homework.Lesson_4;

import java.util.Scanner;

public class TemperatureConvertor {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter between C (celcius) and F (Fahrenheit) : ");
        String inpTemperature = scan.next().toUpperCase();
        String toTemperature;

        if (inpTemperature.equals("C") || inpTemperature.equals("F")) {
            System.out.print("Please enter temperature value : ");
            double tempValue = scan.nextDouble();
            scan.close();
            double convertedValue;

            if (inpTemperature.equals("C")) {
                convertedValue = (tempValue * 9) / 5 + 32;
                toTemperature = "F";
            } else {
                convertedValue = ((tempValue - 32) * 5) / 9;
                toTemperature = "C";
            }

            System.out.printf("Original temperature : %.2f %s", tempValue, inpTemperature);
            System.out.printf("Converted temperature : %.2f %s", convertedValue, toTemperature);
        } else {
            System.out.println("Error: Invalid temperature unit");
        }

    }
}