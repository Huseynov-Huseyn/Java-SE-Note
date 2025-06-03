package src_homework.Lesson_7.Inheritance.Employees;

public class Employee {
    protected String name;
    protected int workYears;

    public Employee(String name, int workYears) {
        this.name = name;
        this.workYears = workYears;
    }

    public String showInfo() {
        return this.getClass().getSimpleName() + " -> name: " + name + ", work years: " + workYears;
    }
}
