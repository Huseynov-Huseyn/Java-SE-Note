package src_homework.Lesson_4;


import java.util.Arrays;
import java.util.Random;

public class SumArray {

    public static void main(String[] args) {

        int[] numbers = new int[5];
        int sum = 0;
        Random ran = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = ran.nextInt(10);
            sum += numbers[i];
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Sum of list : " + sum);
    }
}
