package src_homework.Lesson_7.Polymorphism.Math;

public class Main {
    public static void main(String[] args) {

        int a = 25;
        int b = 5;

        double c = 25.5;
        double d = 5.1;

        MathOperations m = new MathOperations();
        System.out.println(m.add(a, b));
        System.out.println(m.add(c, d));

        System.out.println(m.subtract(a, b));
        System.out.println(m.subtract(c, d));

        System.out.println(m.multiply(a, b));
        System.out.println(m.multiply(c, d));

        System.out.println(m.divide(a, b));
        System.out.println(m.divide(c, d));

    }
}
