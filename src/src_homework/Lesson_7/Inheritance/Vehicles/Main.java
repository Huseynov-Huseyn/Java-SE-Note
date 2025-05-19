package src_homework.Lesson_7.Inheritance.Vehicles;

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("BMW", "I8");
        Car c = new Car("BMW", "I8", 6);
        Bike b = new Bike("BMW", "I8", 2);
        System.out.println(v.showInfo());
        System.out.println(c.showInfo());
        System.out.println(b.showInfo());
    }
}
