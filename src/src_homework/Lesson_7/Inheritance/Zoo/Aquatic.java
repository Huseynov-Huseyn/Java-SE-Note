package src_homework.Lesson_7.Inheritance.Zoo;

public class Aquatic extends Animal {
    private double swimmingDepth;

    public Aquatic(int age, String name, String sound, double swimmingDepth) {
        super(age, name, sound);
        this.swimmingDepth = swimmingDepth;
    }

    void swim() {
        System.out.println("Aquatic is swimming");
    }
}