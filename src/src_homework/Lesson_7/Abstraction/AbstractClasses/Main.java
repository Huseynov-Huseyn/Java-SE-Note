package src_homework.Lesson_7.Abstraction.AbstractClasses;

public class Main {
    public static void main(String[] args) {
        Square s = new Square(22);
        System.out.println(s.calculateArea());

        Circle c = new Circle(22);
        System.out.println(c.calculateArea());

    }
}
