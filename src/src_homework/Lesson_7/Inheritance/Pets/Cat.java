package src_homework.Lesson_7.Inheritance.Pets;

public class Cat extends Pet {
    private final String furColor;

    public Cat(int age, String name, double weight, String furColor) {
        super(age, name, weight);
        this.furColor = furColor;
    }

    void meow() {
        System.out.println(this.getClass().getSimpleName() + " is meowing");
    }

    @Override
    void showInfo() {
        super.showInfo();
        System.out.println(", fur color : " + furColor);
    }

}
