package src_homework.Lesson_6.StudentGradeManagement;

import java.util.Arrays;
import java.util.Scanner;
import java.util.UUID;

public class Student {
    static Scanner scan = new Scanner(System.in);
    UUID studentId;
    String name;
    double[] grades;

    public Student() {
        this.studentId = UUID.randomUUID();
    }

    public Student createStudent() {
        Student s = new Student();

        System.out.print("Please enter your Student's name : ");
        s.setName(scan.nextLine());

        if (s.getName().isEmpty()) {
            s.setName(scan.nextLine());
        }

        System.out.print("How much grade do you want to add : ");
        int gradeNumber = scan.nextInt();

        double[] grades = new double[gradeNumber];
        for (int i = 0; i < gradeNumber; i++) {
            System.out.print("Please enter your " + (i + 1) + " grade : ");
            grades[i] = scan.nextDouble();
        }
        s.setGrades(grades);
        return s;

    }

    public double averageGrade() {
        double average = 0.0;
        for (double grade : grades) {
            average += grade;
        }
        average /= grades.length;
        return average;
    }

    public double highestGrade() {
        double highest = grades[0];
        for (double grade : grades) {
            if (highest < grade) {
                highest = grade;
            }
        }
        return highest;
    }

    public UUID getStudentId() {
        return studentId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }
}
