package src_homework.Lesson_6.StudentGradeManagementSystem;

import java.util.Scanner;
import java.util.UUID;

public class GradeBookApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Book of grade !");
        System.out.println("1 - Add Student , 2 - Remove Student , 3 - Find student by ID , 4 - List all Students , 5 - Calculate class average , 6 - Exit");
        GradeBook gb = new GradeBook();

        while (true) {
            System.out.print("Your choice : ");
            int choice = scan.nextInt();
            switch (choice) {
                case 1 -> {
                    Student newStudent = new Student().createStudent();
                    if (gb.addStudent(newStudent)) {
                        System.out.println("Your Student successfully added to system !");
                        System.out.println("Student's highest grade is : " + newStudent.highestGrade());
                    } else {
                        System.out.println("Your Student can not add to system ! ");
                    }
                }
                case 2 -> {
                    String uuuidString = scan.next();
                    System.out.println(gb.removeStudentById(UUID.fromString(uuuidString)));
                }
                case 3 -> {
                    System.out.print("Please enter your Student's id : ");
                    String uuuidString = scan.next();
                    System.out.println(gb.findStudentById(UUID.fromString(uuuidString)));
                }
                case 4 -> System.out.println(gb);
                case 5 -> System.out.println(gb.classAverageGrade());
                case 6 -> {
                    return;
                }
                default -> System.out.println("You entered the wrong number!  try again");
            }
        }


    }
}
