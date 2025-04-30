package src_homework.Lesson_6.SlotMachineGame;

import java.util.Scanner;

public class CasinoApp {
    public static void main(String[] args) {
        SlotMachine game = new SlotMachine();
        Scanner scan = new Scanner(System.in);

        User user = new User();
        System.out.print("Please enter your name : ");
        user.setName(scan.nextLine());
        System.out.println("Hello " + user.getName() + ", let's start");
        System.out.println("Welcome to our Casino, 1 - Pull Lever 2 - Show balance 3 - Exit game!");
        boolean gameStatus = true;
        do {
            int userInput = scan.nextInt();
            switch (userInput) {
                case 1: {
                    System.out.print("How much time : ");
                    int time = scan.nextInt();
                    if (user.getBalance() >= time * 5) {
                        for (int a = 0; a < time; a++) {
                            if (game.pullLever()) {
                                System.out.println("You win 100 credit ! ");
                                user.addBalance();
                            } else {
                                System.out.println("You lose 5 credit ");
                                user.deductBalance();
                            }
                        }
                        printMenu();

                    } else {
                        System.out.println("You dont have enough money :( ");
                        gameStatus = false;
                    }
                    break;
                }
                case 2: {
                    System.out.println(user.getBalance());
                    printMenu();
                    break;
                }
                case 3: {
                    gameStatus = false;
                    System.out.println("You exit game, see you soon!");
                    break;
                }
                default: {
                    System.out.println("You entered the wrong number!  try again");
                    printMenu();
                    break;
                }
            }
        } while (gameStatus);
        scan.close();

    }

    private static void printMenu() {
        System.out.println("1 - Pull Lever 2 - Show balance 3 - Exit game!");
    }
}