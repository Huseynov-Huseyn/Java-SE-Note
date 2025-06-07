package src_summary.Lesson_7.OOP.Abstraction.AbstractClasses;

public class Main {
    public static void main(String[] args) {

        TVController tvc = new TVController();
        tvc.turnOn();
        tvc.turnOff();

        Circle c = new Circle("blue", 10);
        System.out.println(c.area());
        Rectangle r = new Rectangle("red", 10, 20);
        System.out.println(r.area());
    }
}
