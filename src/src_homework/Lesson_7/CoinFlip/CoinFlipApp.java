package src_homework.Lesson_7.CoinFlip;

import java.util.Random;
import java.util.Scanner;

public class CoinFlipApp {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Coin Flip game!");
        while (true) {
            System.out.print("Enter your choice : Heads(1) or Tails(2) : ");
            int userChoice = scan.nextInt();

//      1 - Heads, 2 - Tails
            int randomChoice = random.nextInt(1, 3);
            if (userChoice == randomChoice) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            System.out.println("Play again? (1 - Yes, 2 - No) ");
            int playAgain = scan.nextInt();
            if (playAgain == 2) {
                return;
            }
        }
    }
}
