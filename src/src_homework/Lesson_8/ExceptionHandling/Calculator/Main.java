package src_homework.Lesson_8.ExceptionHandling.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Division d = new Division();
        System.out.print("Please enter your first number : ");
        int number1 = scan.nextInt();
        System.out.print("Please enter your second number : ");
        int number2 = scan.nextInt();
        System.out.println(d.divideNumber(number1, number2));
        scan.close();
    }
}
