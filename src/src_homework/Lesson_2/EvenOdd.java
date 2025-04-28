package src_homework.Lesson_2;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a valid integer number : ");

        int intNumber = scan.nextInt();
        if (intNumber > 10) {
            System.out.println(-intNumber);
        } else {
            System.out.println("Your number is : " + intNumber);
        }

        if (intNumber % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        System.out.print("Please enter a valid decimal number : ");
        double decNumber = scan.nextDouble();
        scan.close();

        System.out.println("Sum of the entered decimal number and the integer : " + (decNumber + intNumber));
        intNumber += (int) (Math.random() * 10) + 1;
        System.out.println(intNumber);

        if (intNumber > 20) {
            System.out.println("Number larger than 20, your number : " + intNumber);
        } else {
            System.out.println("Number not larger than 20, your number : " + intNumber);
        }

    }
}
