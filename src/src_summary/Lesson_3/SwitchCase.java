package src_summary.Lesson_3;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter your number : ");
        int number = scan.nextInt();

        switch (number) {
            case 1: {
                System.out.println("Your number is one");
                break;
            }
            case 2: {
                System.out.println("Your number is two");
                break;
            }
            case 3: {
                System.out.println("Your number is three");
                break;
            }
            case 4: {
                System.out.println("Your number is four");
                break;
            }
            case 5: {
                System.out.println("Your number is five");
                break;
            }
            default: {
                System.out.println("We can't find your number");
            }
        }

    }
}
