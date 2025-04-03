package src_homework.Lesson_4;

import java.util.Scanner;

public class Multiply {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int i = scan.nextInt();

        for (int j = 1; j < 11; j++) {
            System.out.println(i + " * " + j + " = " + i * j);
        }
    }

}