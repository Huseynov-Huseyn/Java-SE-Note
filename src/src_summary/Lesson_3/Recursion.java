package src_summary.Lesson_3;

public class Recursion {
    static int i = 0;

    public static void main(String[] args) {

        if (i < 10) {
            System.out.println("Hello World!");
            i++;
            main(args);
        }
    }
}
