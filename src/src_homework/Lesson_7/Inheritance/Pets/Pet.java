package src_homework.Lesson_7.Inheritance.Pets;

public class Pet {
    protected String name;
    protected int age;
    protected double weight;


    void eat() {
        System.out.println(this.getClass().getSimpleName() + " is eating");
    }

    void sleep() {
        System.out.println(this.getClass().getSimpleName() + " is sleeping");
    }

    void makeSound() {
        System.out.println(this.getClass().getSimpleName() + " is making sound");
    }

    void showInfo() {
        System.out.print(this.getClass().getSimpleName() + " -> name: " + name + ", age: " + age + ", weight: " + weight);
    }

    public Pet(int age, String name, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
}
