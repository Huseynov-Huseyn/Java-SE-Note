package src_summary.Lesson_7.OOP.Inheritance;

public class Dog extends Animal {
    private boolean isWild;

    public Dog(String name, double weight, boolean isWild) {
        super(name, weight);
        this.isWild = isWild;
    }

    public void sayName() {
        super.sayName();
        if (isWild) {
            System.out.println("And i am wild");
        } else {
            System.out.println("And i am not wild");
        }
    }

    @Override
    public String showInfo() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", isWild=" + isWild +
                '}';
    }
}
