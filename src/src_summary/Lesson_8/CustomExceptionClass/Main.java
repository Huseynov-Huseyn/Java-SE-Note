package src_summary.Lesson_8.CustomExceptionClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your age : ");
        int i = sc.nextInt();
        try {
            checkAge(i);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("You must be 18+");
        }else{
            System.out.println("You are signed up!");
        }
    }
}
