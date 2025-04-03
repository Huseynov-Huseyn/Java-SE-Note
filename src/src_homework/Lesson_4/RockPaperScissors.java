package src_homework.Lesson_4;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    static int computerScore = 0, playerScore = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("The game started!");
        while (computerScore < 3 && playerScore < 3) {
            System.out.println("Please choose between : 1-Rock 2-Paper 3-Scissors");
            int computerChoice = new Random().nextInt(1, 4);
            int playerChoice = 0;
            do {
                System.out.print("Your choice : ");
                playerChoice = scan.nextInt();
            }
            while (playerChoice > 3 || playerChoice < 1);
            if (!checker(playerChoice, computerChoice)) {
                System.out.println("Tie");
            }

        }
        System.out.println((playerScore == 3) ? "You win the game, score is : " + playerScore + " - " + computerScore : "You lose the game, score is : " + playerScore + " - " + computerScore);
    }

    static boolean checker(int choice, int randomNumber) {
        if (choice == randomNumber) {
            return false;
        }

        switch (choice + "_" + randomNumber) {
            case "1_2": {
                System.out.println("Lose, your choice : Rock , computer choice : Paper ");
                computerScore++;
                break;
            }
            case "1_3": {
                System.out.println("Win, your choice : Rock , computer choice : Scissors ");
                playerScore++;
                break;
            }
            case "2_1": {
                System.out.println("Win, your choice : Paper , computer choice : Rock ");
                playerScore++;
                break;
            }
            case "2_3": {
                System.out.println("Lose, your choice : Paper , computer choice : Scissors ");
                computerScore++;
                break;
            }
            case "3_1": {
                System.out.println("Lose, your choice : Scissors , computer choice : Rock ");
                computerScore++;
                break;
            }
            case "3_2": {
                System.out.println("Win, your choice : Scissors , computer choice : Paper ");
                playerScore++;
                break;
            }
        }
        return true;
    }

}