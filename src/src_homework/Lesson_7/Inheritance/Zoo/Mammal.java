package src_homework.Lesson_7.Inheritance.Zoo;

public class Mammal extends Animal {
    private String furColor;

    public Mammal(int age, String name, String sound, String furColor) {
        super(age, name, sound);
        this.furColor = furColor;
    }

    void giveBirth() {
        System.out.println("Mammal is birthing");
    }
}
