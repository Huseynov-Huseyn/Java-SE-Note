package src_summary.Lesson_7.OOP.Inheritance;

public class Dog extends Animal {
    private boolean isWild;

    public Dog(String name, double weight, boolean isWild) {
        super(name, weight);
        this.isWild = isWild;
    }

    public Dog(Animal a, boolean isWild) {
        super(a);
        this.isWild = isWild;
    }

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }

    public void sayName() {
        super.sayName();
        if (this.isWild) {
            System.out.println("And i am wild");
        } else {
            System.out.println("And i am not wild");
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + super.getName() + '\'' +
                ", weight=" + super.getWeight() +
                ", isWild=" + isWild +
                '}';
    }
}
