package src_summary.Lesson_3;

import java.util.Scanner;

public class ScannerLogic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        System.out.println(num);
        System.out.println("=======");

        String line = scan.nextLine();  // Consume the newline character
        System.out.println(line);
        System.out.println("=======");

        line = scan.nextLine();  // Now it works as expected
        scan.close();
        System.out.println(line);
        System.out.println("=======");

    }
}
