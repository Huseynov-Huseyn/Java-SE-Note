package src_homework.Lesson_7.Polymorphism.ShapeGame;

public class ShapeCalculator {

    public void calculateArea(double radius) {
        System.out.println("Area of circle is : " + (Math.PI * radius * radius));
    }

    public void calculateArea(double a, double b, boolean isTriangle) {
        if (isTriangle) {
            System.out.println("Area of triangle is : " + (a * b * 0.5));
        } else {
            System.out.println("Area of rectangle is : " + (a * b));
        }
    }

}
