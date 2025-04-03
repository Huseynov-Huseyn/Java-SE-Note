package src_homework.Lesson_4;

import java.util.Scanner;

public class Tree {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter your tree size : ");
        int rows = scan.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Reverse time ");

        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j >= i; j--) {
                System.out.print("*");
            }
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
