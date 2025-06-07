package src_homework.Lesson_7.Abstraction.InterfaceSegregation;

public class Person implements Swim, Walk {
    @Override
    public void swim() {
        System.out.println(this.getClass().getSimpleName() + " is swimming");
    }

    @Override
    public void walk() {
        System.out.println(this.getClass().getSimpleName() + " is walking");
    }
}
