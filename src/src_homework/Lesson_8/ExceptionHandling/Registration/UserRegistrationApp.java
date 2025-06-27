package src_homework.Lesson_8.ExceptionHandling.Registration;

import java.util.Scanner;

public class UserRegistrationApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try (scan) {
            System.out.print("Please enter your username : ");
            String username = scan.next();
            System.out.print("Please enter your password : ");
            String password = scan.next();
            if (UserRegistration.registerUser(username, password)) {
                System.out.println("Checking is good!");
            }
        } catch (UserRegistrationException e) {
            System.err.println(e.getMessage());
        }
    }
}
