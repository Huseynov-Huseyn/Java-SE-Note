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

//      Arrays.copyOf(originalArray, newLength);
        int[] numbersCopy = Arrays.copyOf(numbers, numbers.length);
        System.out.println(numbersCopy);

        int[][] intArr = {{10, 20, 15, 22, 35}};
        int hashCodeComputed = Arrays.deepHashCode(intArr);
        System.out.println("Integer Array: " + hashCodeComputed);
        String stringComputed = Arrays.deepToString(intArr);
        System.out.println("String Array: " + stringComputed);

        int[] numbers3 = {10, 20, 30, 40, 50};
        int number = 55;
        Arrays.fill(numbers3, number);
        System.out.println(Arrays.toString(numbers3));

        System.out.println("The element mismatched at index: " + Arrays.mismatch(numbers2, numbers3));

        int[] numbers4 = {5, 25, 10, 23, 2, 8, 6};
        Arrays.sort(numbers4);
        System.out.println(Arrays.toString(numbers4));

        // To sort the array using normal sort
        //TODO: Learn about this
        System.out.println("Integer Array: " + Arrays.spliterator(intArr));


    }
}
