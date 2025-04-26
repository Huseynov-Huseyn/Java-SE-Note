package src_homework.Lesson_6.Rectangle;

public class Shape {

    String color;
    double width;
    double length;

    public Shape(double width, double length, String color) {
        this.width = width;
        this.length = length;
        this.color = color;
    }

    double calculateArea() {
        return width * length;
    }

    void printShape() {
        double square = calculateArea();
        if (width == length) {
            System.out.println(this.color + " square is " + square + " sq.metres. ");
        } else {
            System.out.println(this.color + " rectangle  is " + square + " sq.metres. ");
        }
    }
}
