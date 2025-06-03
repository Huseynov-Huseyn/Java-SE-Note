package src_summary.Lesson_7.OOP.Inheritance;

public class Animal {
    private String name;
    private double weight;

    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public Animal(Animal a) {
        this.name = a.name;
        this.weight = a.weight;
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

    public void sayName() {
        System.out.println("My name is " + this.name);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
