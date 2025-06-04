package src_homework.Lesson_7.Inheritance.Pets;

public class Bird extends Pet {
    private double wingSpan;

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

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }
}
