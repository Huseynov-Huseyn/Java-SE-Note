package src_homework.Lesson_7.Abstraction.AbstractClasses;

public class Square extends Shape {
    private final double length;

    protected Square(double length) {
        this.length = length;
    }

    @Override
    double calculateArea() {
        return Math.pow(length, 2);
    }


}
