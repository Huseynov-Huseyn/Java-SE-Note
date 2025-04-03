package src_summary.Lesson_4;

import java.util.Scanner;

public class LoopsDoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Lütfen 1 ile 100 arasında bir sayı girin: ");
            number = scanner.nextInt();
        } while (number < 1 || number > 100);

        System.out.println("Geçerli sayı girildi: " + number);
        scanner.close();
    }
}
