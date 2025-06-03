package src_homework.Lesson_7.Inheritance.Zoo;

public class Animal {
    protected String name;
    protected int age;
    protected String sound;

    public Animal(int age, String name, String sound) {
        this.age = age;
        this.name = name;
        this.sound = sound;
    }

    void makeSound() {
        System.out.println(name + " makes sound : " + sound);
    }
}
