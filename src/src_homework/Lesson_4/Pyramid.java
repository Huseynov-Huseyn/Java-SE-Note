package src_homework.Lesson_4;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter your tree size : ");
        int rows = scan.nextInt();

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < 2 * i; k++) {
                System.out.print("*");
            }
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println("Reverse time ");

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = rows * 2; k >= 2 * i; k--) {
                System.out.print("*");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
