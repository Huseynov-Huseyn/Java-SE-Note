package src_homework.Lesson_3;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your first number : ");
        double firstNumber = scan.nextDouble();

        System.out.print("Enter your second number : ");
        double secondNumber = scan.nextDouble();
        scan.nextLine();

        System.out.print("Enter an arithmetic operation (+,-,*,/): ");
        String operation = scan.next();
        scan.close();

        switch (operation) {
            case "+": {
                System.out.println("Result : " + (firstNumber + secondNumber));
                break;
            }
            case "-": {
                System.out.println("Result : " + (firstNumber - secondNumber));
                break;
            }
            case "*": {
                System.out.println("Result : " + (firstNumber * secondNumber));
                break;
            }
            case "/": {
                System.out.println("Result : " + (firstNumber / secondNumber));
                break;
            }
            default: {
                System.out.println("Invalid operation, try again!");
            }
        }

    }
}
