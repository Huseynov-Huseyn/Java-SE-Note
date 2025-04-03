package src_homework.Lesson_4;

import java.util.Scanner;

public class SumEven {

    public static void main(String[] args) {

        int i = 0, sum = 0;
        while (i <= 100) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
        System.out.println("=========");
        int a;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.print("Please enter a number : ");
            a = scan.nextInt();
        } while (a < 0 || a > 100);

        System.out.println("=========");

        int number1 = 0;
        int number2 = 1;

        for (int z = 0; z < 15; z++) {
            if (z == 5) {
                break;
            } else {
                System.out.println(number1 += number2);
                System.out.println(number2 += number1);
            }
        }

        System.out.println("=========");

        for (int x = 0; x < 21; x++) {
            if (x % 3 == 0) {
                continue;
            }
            System.out.println(x);
        }
    }
}
