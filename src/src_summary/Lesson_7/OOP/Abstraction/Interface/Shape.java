package src_summary.Lesson_7.OOP.Abstraction.Interface;

interface Shape {
    double calculateArea();

    String getShapeName();

    default void printDetails() {
        System.out.println("Shape: " + getShapeName());
        System.out.println("Area: " + calculateArea());
    }
}
