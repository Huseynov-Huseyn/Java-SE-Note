package src_summary.Lesson_7.StaticKeyword;

import static java.lang.Math.random;
import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {

        // Static Import usage
        double random = random();
        double sqrt = sqrt(random);

        Parent obj1 = new Child();
        obj1.display(); // OUTPUT: Static method from Parent class

        Child obj2 = new Child();
        obj2.display(); // OUTPUT: Static method from Child class
    }

    static class Parent {
        static void display() {
            System.out.println("Static method from Parent class");
        }
    }

    static class Child extends Parent {
        static void display() { // This method hides Parent.display(), it does NOT override it!
            System.out.println("Static method from Child class");
        }
    }
}
