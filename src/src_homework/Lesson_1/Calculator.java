package src_homework.Lesson_1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your number1:");
        int number1 = scan.nextInt();
        System.out.print("Please enter your number2:");
        int number2 = scan.nextInt();
        // scan.nextInt().var .var auto create type
        scan.close();

        System.out.println("number1 + number2 = " + (number1 + number2));
        System.out.println("number1 - number2 = " + (number1 - number2));
        System.out.println("number1 * number2 = " + (number1 * number2));
        System.out.println("number1 / number2 = " + (number1 / number2));
    }
}
