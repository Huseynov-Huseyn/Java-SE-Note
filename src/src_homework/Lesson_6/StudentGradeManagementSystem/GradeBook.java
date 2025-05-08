package src_homework.Lesson_6.StudentGradeManagementSystem;

import java.util.Arrays;
import java.util.UUID;

public class GradeBook {
    Student[] students = new Student[2];

    public boolean addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                return true;
            }
        }
        System.out.println("Grade Book is full!");
        return false;
    }


    public Student removeStudentById(UUID id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getStudentId().equals(id)) {
                Student s1 = students[i];
                students[i] = null;
                return s1;
            }
        }
        System.out.println("Can not find student with this id !");
        return null;
    }

    public Student findStudentById(UUID id) {
        for (Student student : students) {
            if (student != null && student.getStudentId().equals(id)) {
                return student;
            }
        }
        System.out.println("Can't find student with this id !");
        return null;
    }

    public double classAverageGrade() {
        double total = 0.0;
        int count = 0;
        for (Student s : students) {
            if (s != null) {
                total += s.averageGrade();
                count++;
            }
        }
        return count == 0 ? 0.0 : total / count;
    }

    @Override
    public String toString() {
        return "GradeBook{" +
                "students=" + Arrays.toString(students) +
                '}';
    }
}