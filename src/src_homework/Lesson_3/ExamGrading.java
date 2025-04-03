package src_homework.Lesson_3;

import java.util.Scanner;

public class ExamGrading {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your score out of 100 : ");
        if (scan.hasNextInt()) {
            int score = scan.nextInt();
            if (score > 100 || score < 0) {
                System.out.println("Error : score must be between 0 and 100 ");
            } else {
                String grade;
                if (score >= 91) {
                    grade = "A";
                } else if (score >= 81) {
                    grade = "B";
                } else if (score >= 71) {
                    grade = "C";
                } else if (score >= 61) {
                    grade = "D";
                } else {
                    grade = "F";
                }

                switch (grade) {
                    case "A":
                        System.out.println("Excellent! You got an A.");
                        break;
                    case "B":
                        System.out.println("Good job! You got a B.");
                        break;
                    case "C":
                        System.out.println("Fair effort! You got a C.");
                        break;
                    case "D":
                        System.out.println("You passed with a D.");
                        break;
                    case "F":
                        System.out.println("Unfortunately, you failed with an F.");
                        break;
                }
                String result = (score >= 61) ? "You passed the exam" : "You Failed!";
                System.out.println(result);
            }
            scan.close();
        } else {
            System.out.println("Error: Please enter a valid integer score.");
        }
    }
}
