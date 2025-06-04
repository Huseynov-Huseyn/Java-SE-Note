package src_homework.Lesson_7.Inheritance.Pets;

public class Pet {
    protected String name;
    protected int age;
    protected double weight;

    public Pet(int age, String name, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
