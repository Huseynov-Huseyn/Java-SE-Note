package src_summary.Lesson_7.OOP.Abstraction.Interface;

public class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return (Math.pow(radius, 2) * Math.PI);
    }

    @Override
    public String getShapeName() {
        return this.getClass().getSimpleName();
    }
}
