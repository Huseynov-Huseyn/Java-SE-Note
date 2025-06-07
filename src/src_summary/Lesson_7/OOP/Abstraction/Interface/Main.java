package src_summary.Lesson_7.OOP.Abstraction.Interface;

public class Main {
    public static void main(String[] args) {
        System.out.println("=======================");

        Circle c = new Circle(10);
        c.printDetails();

        System.out.println("=======================");

        Rectangle r = new Rectangle(5, 10);
        r.printDetails();
    }
}
