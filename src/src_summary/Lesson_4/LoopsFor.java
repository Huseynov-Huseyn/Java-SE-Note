package src_summary.Lesson_4;

public class LoopsFor {
    public static void main(String[] args) {
//        for ( ; ; ) {
//            // Infinite for loop
//        }

        aa:
        for (int i = 1; i <= 3; i++) {
            if (i == 1)
                continue;
            bb:
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break aa;
                }
                System.out.println(i + " " + j);
            }
        }

        char letter = 'F';
        for (int i = 0; i < 5; i++) {
            System.out.println(letter -= 1);
        }

    }
}
