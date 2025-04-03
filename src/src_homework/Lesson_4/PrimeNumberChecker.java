package src_homework.Lesson_4;

import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {
        System.out.println("Prime Number Checker");
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a positive integer : ");
        int number = scan.nextInt();
        boolean isPrime = true;

        if (number <= 1) {
            System.out.println("This number " + number + " is not a prime number.");
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("This number " + number + " is not a prime number.");
        } else {
            System.out.println("This number " + number + " is a prime number.");
        }

    }
}
