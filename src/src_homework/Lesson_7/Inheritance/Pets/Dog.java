package src_homework.Lesson_7.Inheritance.Pets;

public class Dog extends Pet {
    private String breed;

    public Dog(int age, String name, double weight, String breed) {
        super(age, name, weight);
        this.breed = breed;
    }

    void bark() {
        System.out.println(this.getClass().getSimpleName() + " is barking");
    }

    @Override
    void showInfo() {
        super.showInfo();
        System.out.println(", breed : " + breed);
    }

    public String isBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
