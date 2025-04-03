package src_homework.Lesson_2;

import java.util.Random;
import java.util.Scanner;

public class FindLargestNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int largestNumber = 0;
        int randomNumber = new Random().nextInt(10);
        System.out.println("Game started, enter a number between 0 and 10 !");
        for (int i = 1; i < 4; i++) {
            System.out.print("Please enter your " + i + " number : ");
            int inputNumber = scan.nextInt();

            if (inputNumber < 0 || inputNumber > 10) {
                System.out.println("Error : number must be between 0 and 10");
                break;
            } else {
                largestNumber = Math.max(largestNumber, inputNumber);
            }
        }
        scan.close();
        System.out.println((randomNumber == largestNumber) ? "Congratulations, you win !" : ("Random number:" + randomNumber + " not equals with: " + largestNumber));


        /*
            I can use while till i get valid number:  
            while (largestNumber < 0 || largestNumber > 10) {
            System.out.println("Please enter your number :");
            largestNumber = scan.nextInt();}
         */

    }


}
