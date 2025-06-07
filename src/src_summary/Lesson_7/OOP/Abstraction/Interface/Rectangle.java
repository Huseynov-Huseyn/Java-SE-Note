package src_summary.Lesson_7.OOP.Abstraction.Interface;

public class Rectangle implements Shape {
    private final double width;
    private final double length;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return (width * length);
    }

    @Override
    public String getShapeName() {
        return this.getClass().getSimpleName();
    }

}
