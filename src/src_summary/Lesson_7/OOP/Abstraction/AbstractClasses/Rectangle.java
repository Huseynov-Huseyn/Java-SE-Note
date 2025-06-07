package src_summary.Lesson_7.OOP.Abstraction.AbstractClasses;

public class Rectangle extends Shape {
    private final double width;
    private final double length;

    public Rectangle(String color, double width, double length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    double area() {
        return width * length;
    }

    public double getLength() {
        return length;
    }

}
