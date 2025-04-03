package src_summary.Lesson_2;

import java.util.Random;
import java.util.Scanner;

public class MainRandom {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the minimum number for the random range : ");
        int min = scan.nextInt();
        System.out.print("Please enter the maximum number for the random range : ");
        int max = scan.nextInt();
        scan.close();

        Random random = new Random();
        System.out.println("Your random number is : " + (random.nextInt(min, max)));
    }
}