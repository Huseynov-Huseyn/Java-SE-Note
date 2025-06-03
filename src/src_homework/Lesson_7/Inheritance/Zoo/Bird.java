package src_homework.Lesson_7.Inheritance.Zoo;

public class Bird extends Animal {
    private double wingSpan;

    public Bird(int age, String name, String sound, double wingSpan) {
        super(age, name, sound);
        this.wingSpan = wingSpan;
    }

    void fly() {
        System.out.println("Bird is flying");
    }
}
