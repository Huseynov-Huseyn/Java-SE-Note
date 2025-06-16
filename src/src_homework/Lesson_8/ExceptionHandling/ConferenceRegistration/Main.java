package src_homework.Lesson_8.ExceptionHandling.ConferenceRegistration;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Please enter your name : ");
            String name = scan.next();
            System.out.print("Please enter your age : ");
            int age = scan.nextInt();
            System.out.print("Please enter your email : ");
            String email = scan.next();
            Participant p = new Participant(name, age, email);
            System.out.println(p);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input type. Please enter correct data.");
        }
    }

    public static void displayParticipants() {
        try {
            FileReader fl = new FileReader("C:\\Users\\Huseyn_\\Desktop\\participants.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException f) {
            System.out.println(f.getMessage());
        }
    }
}
