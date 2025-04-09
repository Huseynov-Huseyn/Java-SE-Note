package src_summary.Lesson_5;

import java.util.Arrays;
import java.util.List;

public class ArrayMethods {

    public static void main(String[] args) {

        int[] numbers = {5, 10, 15, 20, 25};

        List<int[]> list = Arrays.asList(numbers);
        System.out.println("Array list of numbers : " + list);

        //Binary search: If the key is found, it returns its index; otherwise, it indicates the position where the key could be inserted.
        int i1 = Arrays.binarySearch(numbers, 1, 3, 30);
        if (i1 >= 0) {
            System.out.println("Element found at index: " + i1);
        } else {
            System.out.println("Element not found! Insert at: " + (-i1 - 1));
        }

        // 0= no dif, -1=first is smaller, +1=first is bigger
        int[] numbers2 = {5, 10, 15, 20, 25};
        int compare = Arrays.compare(numbers, numbers2);
        System.out.println(compare);

        int[] numbersPlagiat = Arrays.copyOf(numbers, numbers.length);
        System.out.println(numbersPlagiat);
    }
}
