package src_homework.Lesson_4;

import java.util.Arrays;
import java.util.Random;

public class MinMax {

    public static void main(String[] args) {

        int[] numbers = new int[5];
        Random ran = new Random();
        numbers[0] = ran.nextInt(0, 100);
        int min = numbers[0], max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = ran.nextInt(0, 100);
            if (max < numbers[i]) {
                max = numbers[i];
            }
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println("Array : " + Arrays.toString(numbers));
        System.out.println("Min number of array : " + min);
        System.out.println("Max number of array : " + max);

    }
}
