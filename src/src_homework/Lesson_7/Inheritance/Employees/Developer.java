package src_homework.Lesson_7.Inheritance.Employees;

public class Developer extends Employee {
    private String major;

    public Developer(String name, int workYears, String major) {
        super(name, workYears);
        this.major = major;
    }

    @Override
    public String showInfo() {
        return super.showInfo() + ", major: " + major;
    }
}
