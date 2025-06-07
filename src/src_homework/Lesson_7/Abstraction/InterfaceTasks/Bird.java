package src_homework.Lesson_7.Abstraction.InterfaceTasks;

public class Bird implements Animal, Flyable {
    private final String name;

    public Bird(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return "Bird name is : " + name;
    }

    @Override
    public void makeSound() {
        System.out.println("Bird is chirping");
    }

    @Override
    public void takeOff() {
        System.out.println("Bird is take off");
    }

    @Override
    public void land() {
        System.out.println("Bird is landing");
    }
}
