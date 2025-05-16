package src_homework.Lesson_6.QuizGame;

import java.util.Scanner;

public class QuizGame {

    static Scanner scan = new Scanner(System.in);
    private static Question[] questions;
    private static int point;

    public static void main(String[] args) {
        questions = new Question[5];
        questions[0] = new Question("What is the chemical symbol for water?", "H2O", "CO2", "O2", "A", 10);
        questions[1] = new Question("How many planets are in our solar system?", "7", "8", "9", "B", 20);
        questions[2] = new Question("What is the capital of France?", "Berlin", "Madrid", "Paris", "C", 30);
        questions[3] = new Question("Who painted the Mona Lisa?", "Vincent van Gogh", "Pablo Picasso", "Leonardo da Vinci", "C", 20);
        questions[4] = new Question("What is the largest planet in our solar system?", "Jupiter", "Earth", "Mars", "A", 20);

        startQuiz();
        scan.close();
        System.out.println("======================================");
        endQuiz();
    }

    public static void startQuiz() {
        System.out.println("Welcome to Quiz game!");
        System.out.println("Look at the questions and answer it!");
        System.out.println("======================================");

        for (int i = 0; i < 5; i++) {
            askQuestion(questions[i], i);
        }

    }

    static void askQuestion(Question ob, int i) {
        System.out.println();
        System.out.println("Question " + ++i + " : " + ob.getQuestionText());
        System.out.println("Options : " + "A) " + ob.getVariantA() + " B) " + ob.getVariantB() + " C) " + ob.getVariantC());
        System.out.print("Your Choice : ");

        String choice = scan.nextLine().toUpperCase();
        evaluateAnswer(choice, ob.getCorrectVariant(), ob.getQuestionPoint());
    }

    static void evaluateAnswer(String choice, String correctVariant, int questionPoint) {
        if (choice.equals(correctVariant)) {
            point += questionPoint;
            System.out.println("Your answer is correct, you get " + questionPoint + " point ");
        } else {
            System.out.println("Unfortunately your choice is not correct !");
        }
    }

    static void endQuiz() {

        System.out.println("Questions are finished, Your score : " + point + "/100");
    }
}

