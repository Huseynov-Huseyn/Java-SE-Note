package src_homework.Lesson_7.Inheritance.Pets;

public class Main {
    public static void main(String[] args) {
        System.out.println("=========");
        Cat c = new Cat(4, "Garfield", 12.3, "Red");
        c.showInfo();
        c.eat();
        c.sleep();
        c.meow();
        c.makeSound();
        System.out.println("=========");
        Bird b = new Bird(2, "Pookie", 1.1, 12);
        b.showInfo();
        b.eat();
        b.eat();
        b.fly();
        b.chirp();
        b.makeSound();
        System.out.println("=========");

        Dog d = new Dog(12, "Howwie", 16.2, "Golden Retriever");
        d.showInfo();
        d.eat();
        d.sleep();
        d.bark();
        d.makeSound();
    }
}
