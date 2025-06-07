package src_summary.Lesson_7.OOP.Abstraction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        System.out.println((a + b).length());
        System.out.println(((a.compareTo(b)) > 0) ? "Yes" : "No");
        a = a.substring(0, 1).toUpperCase() + a.substring(1);
        b = b.substring(0, 1).toUpperCase() + b.substring(1);
        System.out.println(a +" "+ b);

    }
}
