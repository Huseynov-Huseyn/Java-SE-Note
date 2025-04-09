package src_summary.Lesson_4;

public class ReturnAndBreak {
    public static void main(String[] args) {

        example();

    }

    public static void example() {
        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                return; // Stop Method
            }
            System.out.println("return example: " + i);
        }

        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                break; // Stop loop
            }
            System.out.println("break example: " + i);
        }

        System.out.println("This Line can't run after return!");
    }

}
