package src_summary.Lesson_7.OOP.Abstraction.AbstractClasses;

public abstract class Shape {
    protected String color;

    public Shape(String color) {
        System.out.println("shape constructor");
        this.color = color;
    }

    abstract double area();

}
