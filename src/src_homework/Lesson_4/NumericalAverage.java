package src_homework.Lesson_4;

import java.util.Random;

public class NumericalAverage {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random ran = new Random();
        double average = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = ran.nextInt(100);
            System.out.println((i + 1) + ". Number : " + numbers[i]);
            average += numbers[i];
        }
        average /= numbers.length;
        System.out.println("Numerical average of list : " + average);
    }
}
