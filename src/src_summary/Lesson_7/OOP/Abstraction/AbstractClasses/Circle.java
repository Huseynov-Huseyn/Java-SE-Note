package src_summary.Lesson_7.OOP.Abstraction.AbstractClasses;

public class Circle extends Shape {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        System.out.println("circle constructor");
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
