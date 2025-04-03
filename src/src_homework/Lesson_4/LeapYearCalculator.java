package src_homework.Lesson_4;

import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a year : ");

        int year = scan.nextInt();
        scan.close();
        boolean checked = checkLeap(year);

        if (checked) {
            System.out.println(year + " is a leap year!");
        } else {
            System.out.println(year + " is not a leap year!");
        }

    }

    public static boolean checkLeap(int year) {
        return (year % 400 == 0) || (year % 100 != 0 && year % 4 == 0);
    }

}
