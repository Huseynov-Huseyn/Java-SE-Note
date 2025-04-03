package src_summary.Lesson_5;

import java.util.Arrays;

public class ArrayEqualization {

    public static void main(String[] args) {

        int[] arr = m1();
        for (int j : arr) {
            System.out.println(j + " ");
        }

        int[] arr2 = arr.clone();
        System.out.println(arr.equals(arr2));
        System.out.println(arr == arr2);
        System.out.println(Arrays.equals(arr, arr2));

        int[] arr3 = java.util.stream.IntStream.range(1, 5).toArray();
    }

    public static int[] m1() {
        return new int[]{1, 2, 3};
    }


}
