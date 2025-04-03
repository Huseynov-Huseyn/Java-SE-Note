package src_homework.Lesson_4;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer : ");
        int number = scan.nextInt();
        scan.close();
        int loopNumber = number;
        int reversedNumber = 0;
        while (loopNumber > 0) {
            reversedNumber = reversedNumber * 10 + loopNumber % 10;
            loopNumber /= 10;
        }

        System.out.println("Reversed number : " + reversedNumber);

        System.out.println((number == reversedNumber) ? "The number " + number + " is a palindrome" : "The number " + number + " is not a palindrome");

    }
}
