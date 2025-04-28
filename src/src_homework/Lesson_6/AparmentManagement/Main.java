package src_homework.Lesson_6.AparmentManagement;

public class Main {
    public static void main(String[] args) {

        Building building1 = new Building("Apartment-US", 5, 10, "Second", true);
        Person person1 = new Person("Ali", "Alili", 25, "Prof", 5, building1);
        System.out.println(building1);
        System.out.println(person1);

    }
}
