package src_homework.Lesson_2;

import java.util.Random;

public class RandomEvenOdd {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(200);
        System.out.println(randomNumber);
        if (random.nextInt(200) <= 100) {
            if (randomNumber % 2 == 1) {
                System.out.println("Number is odd");
            } else {
                System.out.println("Number is even");
            }
        } else {
            System.out.println("Invalid number");
        }

    }
}
