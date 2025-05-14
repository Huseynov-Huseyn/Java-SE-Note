package src_homework.Lesson_7.EmployeeManagment;

public class Employee {
    static int totalEmployee;
    static double totalSalary;
    int employeeId;
    String name;
    double salary;

    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;

        totalEmployee++;
        totalSalary += this.salary;
    }

    public static void showTotalEmployee() {
        System.out.println("Total Employee : " + totalEmployee);
    }

    public static void showTotalSalary() {
        System.out.println("Total salary of Employees : " + totalSalary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setSalary(double salary) {
        totalSalary -= this.salary;
        this.salary = salary;
        totalSalary += salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
