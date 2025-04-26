package src_homework.Lesson_6.GradeSystem;

import java.util.Scanner;

public class Student {

    String name;
    int age;
    int grade;
    Scanner scan = new Scanner(System.in);

    void createStudent() {

        System.out.print("Please enter student's name : ");
        this.name = scan.nextLine();
        System.out.print("Please enter student's age : ");
        this.age = scan.nextInt();
        System.out.print("Please enter student's grade : ");
        this.grade = scan.nextInt();
        System.out.println("===========");
        System.out.println("Student Name : " + this.name);
        System.out.println("Student Age : " + this.age);
        System.out.println("Student Grade : " + this.grade);
        System.out.println();
        checkGrade();

    }

    void checkGrade() {

        if (grade > 90) {
            System.out.println("A");
        } else if (grade > 80) {
            System.out.println("B");
        } else if (grade > 70) {
            System.out.println("C");
        } else if (grade > 60) {
            System.out.println("D");
        } else if (grade > 50) {
            System.out.println("E");
        } else {
            System.out.println("F");
        }
        System.out.println();

    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

}