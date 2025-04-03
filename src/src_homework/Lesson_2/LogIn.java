package src_homework.Lesson_2;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your username : ");
        String username = scan.next();

        System.out.print("Please enter your password : ");
        String password = scan.next();
        scan.close();

        System.out.println((username.equals("admin") && password.equals("12345")) ? "You are logged in" : "You are not logged in");

    }
}
