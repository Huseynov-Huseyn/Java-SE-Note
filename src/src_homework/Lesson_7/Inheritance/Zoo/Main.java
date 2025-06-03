package src_homework.Lesson_7.Inheritance.Zoo;

public class Main {
    public static void main(String[] args) {

        Aquatic a = new Aquatic(12, "Nemo", "Splash", 200);
        Bird b = new Bird(12, "Mordecai", "Chirp", 123);
        Mammal m = new Mammal(12, "Lion King", "Roar", "Red");
        a.swim();
        a.makeSound();
        b.fly();
        b.makeSound();
        m.giveBirth();
        m.makeSound();
    }
}
