package src_summary.Lesson_7.OOP.Abstraction.Interface;

interface Shape {
    double calculateArea();

    String getShapeName();

    static void saySomething() {
        System.out.println("This is the static keyword use in interface");
    }

    default void printDetails() {
        System.out.println("Shape: " + getShapeName());
        System.out.println("Area: " + calculateArea());
        sayItsPrivate();
    }

    private void sayItsPrivate() {
        System.out.println("This is private method.");
    }
}
