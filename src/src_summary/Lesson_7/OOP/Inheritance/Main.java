package src_summary.Lesson_7.OOP.Inheritance;

public class Main {
    public static void main(String[] args) {

        Animal a1 = new Animal("ASD", 123);
        a1.sayName();
        Dog d1 = new Dog(a1, true);
        d1.sayName();
        System.out.println(a1);
        System.out.println(d1);
    }
}
