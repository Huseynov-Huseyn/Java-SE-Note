package src_homework.Lesson_7.Inheritance.Shapes;

public class Main {
    public static void main(String[] args) {

        Circle c = new Circle(2);
        System.out.println(c.calculateArea() + " sm");
        Rectangle r = new Rectangle(10, 30);
        System.out.println(r.calculateArea() + " sm");
        MathUtils math = new MathUtils();
        math.twoSum(5, 10);

    }
}
