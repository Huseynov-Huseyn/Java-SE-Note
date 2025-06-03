package src_homework.Lesson_7.Inheritance.Shapes;

public class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        System.out.println("Sup class calculate Area : " + super.calculateArea());
        return length * width;
    }
}
