package src_homework.Lesson_1;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        // 5 mil is 8 km
        Scanner scan = new Scanner(System.in);
        double mil = scan.nextDouble();
        scan.close();
        System.out.printf("%.1f mil is %.1f km%n", mil, mil * 1.6);
    }
}
