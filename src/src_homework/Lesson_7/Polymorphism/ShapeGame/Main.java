package src_homework.Lesson_7.Polymorphism.ShapeGame;

public class Main {
    public static void main(String[] args) {
        double a = 12.4;
        double b = 0.2;
        double c = 5.5;
        ShapeCalculator sc = new ShapeCalculator();
        sc.calculateArea(c);
        sc.calculateArea(a, b, true);
        sc.calculateArea(c, b, false);
    }
}
