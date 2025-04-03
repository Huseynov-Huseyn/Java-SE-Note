package src_homework.Lesson_4;

import java.util.Scanner;

public class IndexOfValue {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array : ");
        int length = scan.nextInt();
        int[] numbers = new int[length];
        System.out.println("Enter the elements of array :");

        for (int i = 0; i < length; i++) {
            System.out.print("Number " + (i + 1) + " of list : ");
            numbers[i] = scan.nextInt();
        }

        System.out.print("Enter the target number : ");
        int target = scan.nextInt();
        int index = -1;
        scan.close();

        for (int i = 0; i < length; i++) {
            if (target == numbers[i]) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Target value found at index : " + index);
        } else {
            System.out.println("Can not found the target");
        }

    }
}