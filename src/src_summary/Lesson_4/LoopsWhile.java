package src_summary.Lesson_4;

public class LoopsWhile {
    public static void main(String[] args) {
        int number = 0, time = 0;

        while (number != 77) {
            number = (int) (Math.random() * 100) + 1;
            System.out.println("Random number is : " + number);
            time++;
        }

        System.out.println("How many time while used : " + time);

    }
}
