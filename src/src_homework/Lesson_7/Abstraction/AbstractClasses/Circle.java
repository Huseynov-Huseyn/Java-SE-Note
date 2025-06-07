package src_homework.Lesson_7.Abstraction.AbstractClasses;

public class Circle extends Shape {
    private final double radius;

    protected Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }


}
