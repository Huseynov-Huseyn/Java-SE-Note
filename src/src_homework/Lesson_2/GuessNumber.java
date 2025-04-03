package src_homework.Lesson_2;


import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int randomNumber = (int)(Math.random()*10);
        int randomNumber = new Random().nextInt(10);
        int life = 2;
        System.out.println("Welcome to the Guess the Number Game,you have 2 life!");
        System.out.println("I'm thinking of a number between 1 and 10.");
        System.out.println("Guess the Number!");

        while (life > 0) {
            System.out.print("Please enter your guess : ");
            int number = scan.nextInt();
            if (number < 0 || number > 10) {
                System.out.println("Your name isn't valid1");
            }
            if (number < randomNumber) {
                System.out.println("Your guess is too low, try again!");
                life--;
            } else if (number > randomNumber) {
                System.out.println("Your guess is too high, try again!");
                life--;
            } else {
                break;
            }
        }

        if (life == 0) {
            System.out.println("You lose, number is : " + randomNumber);
        } else {
            System.out.println("You Win mate!");
        }

    }
}
