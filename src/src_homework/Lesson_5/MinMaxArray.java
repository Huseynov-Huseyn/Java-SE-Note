package src_homework.Lesson_5;

import java.util.Scanner;

public class MinMaxArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter row : ");
        int row = scan.nextInt();
        System.out.print("Enter column : ");
        int column = scan.nextInt();

        int[][] arr = new int[row][column];
        int max = arr[0][0];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print("Enter element at (" + i + ", " + j + ") : ");
                arr[i][j] = scan.nextInt();
                if (arr[i][j] > max) max = arr[i][j];
            }
        }
        System.out.println("Biggest element : " + max);
    }
}
