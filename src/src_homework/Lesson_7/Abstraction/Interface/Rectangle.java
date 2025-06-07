package src_homework.Lesson_7.Abstraction.Interface;

public class Rectangle implements Resizable {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public void resize(double factor) {
        this.width *= factor;
        this.length *= factor;
        System.out.println("Current width : " + width + " length : " + length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
