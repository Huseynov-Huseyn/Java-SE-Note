package src_summary.Lesson_7.OOP.Inheritance;

public class Animal {
    protected String name;
    protected double weight;

    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public void sayName() {
        System.out.println("My name is " + this.name);
    }

    public String showInfo() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
