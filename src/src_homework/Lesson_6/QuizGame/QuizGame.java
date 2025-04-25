package src_homework.Lesson_6.QuizGame;

import java.util.Scanner;

public class QuizGame {

    private static Question[] questions;
    private static int point;
    static Scanner scan = new Scanner(System.in);

    private QuizGame() {
        questions = new Question[5];
        questions[0] = new Question("What is the chemical symbol for water?", "H2O", "CO2", "O2", "A");
        questions[1] = new Question("How many planets are in our solar system?", "7", "8", "9", "B");
        questions[2] = new Question("What is the capital of France?", "Berlin", "Madrid", "Paris", "C");
        questions[3] = new Question("Who painted the Mona Lisa?", "Vincent van Gogh", "Pablo Picasso", "Leonardo da Vinci", "C");
        questions[4] = new Question("What is the largest planet in our solar system?", "Jupiter", "Earth", "Mars", "A");
    }


    public static void main(String[] args) {
        new QuizGame();

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
        evaluateAnswer(choice, ob.getCorrectVariant());
    }

    static void evaluateAnswer(String choice, String correctVariant) {
        if (choice.equals(correctVariant)) {
            point += 20;
            System.out.println("Your answer is correct, you get 20 point ");
        } else {
            System.out.println("Unfortunately your choice is not correct !");
        }
    }

    static void endQuiz() {

        System.out.println("Questions are finished, Your score : " + point + "/100");
    }
}

