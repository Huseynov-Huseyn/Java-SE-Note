package src_homework.Lesson_7.Inheritance.Employees;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("Huseyn", 123);
        System.out.println(e1.showInfo());
        Developer d1 = new Developer("Huseyn", 12, "Backend");
        System.out.println(d1.showInfo());
    }
}
