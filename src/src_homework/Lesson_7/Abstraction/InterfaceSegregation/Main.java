package src_homework.Lesson_7.Abstraction.InterfaceSegregation;

public class Main {
    public static void main(String[] args) {
        System.out.println("==========");
        Person p = new Person();
        p.swim();
        p.walk();
        System.out.println("==========");
        Duck d = new Duck();
        d.fly();
        d.swim();
        d.walk();
    }
}
