package src_homework.Lesson_7.Inheritance.Pets;

public class Bird extends Pet {
    private final double wingSpan;

    public Bird(int age, String name, double weight, double wingSpan) {
        super(age, name, weight);
        this.wingSpan = wingSpan;
    }

    void fly() {
        System.out.println(this.getClass().getSimpleName() + " is flying");
    }

    void chirp() {
        System.out.println(this.getClass().getSimpleName() + " is chirping");
    }

    @Override
    void showInfo() {
        super.showInfo();
        System.out.println(", wing span : " + wingSpan);
    }

}
