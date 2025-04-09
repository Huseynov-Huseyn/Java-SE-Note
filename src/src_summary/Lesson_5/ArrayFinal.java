package src_summary.Lesson_5;

public class ArrayFinal {
    public static void main(String[] args) {

        int[] numbers = {5, 10, 20, 30};
        System.out.println("Before reassigned : ");
        for (int i : numbers) {
            System.out.println(i);
        }

        System.out.println("After reassigned : ");
        numbers = new int[6];
        for (int i : numbers) {
            System.out.println(i);
        }

//        Final keyword in Arrays

        final int[] numbers2 = {5, 10, 20, 30};
//        Can not reassign Arrays with final keyword
//        numbers2 = new int[6];


    }
}
