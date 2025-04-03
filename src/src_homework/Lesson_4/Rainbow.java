package src_homework.Lesson_4;

import java.util.Random;

public class Rainbow {
    public static void main(String[] args) {
        String[] colors = {"red", "orange", "yellow", "green", "blue", "indigo", "violent"};
        for (String color : colors) {
            System.out.println("Color : " + color);
        }

        System.out.println("============");

        int[] numbers = new int[10];
        int max = 0;
        Random ran = new Random();
        int count = 0;
        for (int i = 0; i < 10; i++) {
            count++;
            numbers[i] = ran.nextInt(0, 10);
        }

        for (int number : numbers) {
            System.out.println("Number : " + number);
            if (number > max) {
                max = number;
            }
        }
        System.out.println(max);
    }
}
