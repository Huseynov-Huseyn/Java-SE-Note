package src_homework.Lesson_7.Abstraction.InterfaceTasks;

public class Main {
    public static void main(String[] args) {
        Bird b = new Bird("Chippy");
        System.out.println("================");
        System.out.println(b.getName());
        b.makeSound();
        b.takeOff();
        b.land();
        Plane p = new Plane(23.4, "Baku");
        System.out.println("================");
        p.setDestination("Dubai");
        System.out.println(p.getCapacity());
        System.out.println(p.getDestination());
        p.takeOff();
        p.land();
    }
}
