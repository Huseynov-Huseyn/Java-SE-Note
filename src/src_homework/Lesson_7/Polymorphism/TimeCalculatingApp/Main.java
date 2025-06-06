package src_homework.Lesson_7.Polymorphism.TimeCalculatingApp;

public class Main {
    public static void main(String[] args) {
        TimeCalculator tc = new TimeCalculator();

        System.out.println(tc.calculateDifference(2, 40, 4, 20));
        System.out.println(tc.calculateDifference(4, 40, 4, 20));
        System.out.println(tc.calculateDifference(1, 55, 4, 50));
        System.out.println(tc.calculateDifference("18:20", "17:30"));
    }
}
