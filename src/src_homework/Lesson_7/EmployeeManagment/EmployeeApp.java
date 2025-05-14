package src_homework.Lesson_7.EmployeeManagment;

import java.util.Scanner;

public class EmployeeApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("1 - Adding Employee ,  2 - Show number of Employees , 3 - Show Salary of Employees , 4 - Exit");
            System.out.print("Your choice : ");
            int choice = scan.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter your Employee id : ");
                    int empId = scan.nextInt();
                    scan.nextLine();
                    System.out.print("Enter your Employee name : ");
                    String name = scan.nextLine();
                    System.out.print("Enter your Employee salary : ");
                    double salary = scan.nextDouble();
                    Employee emp1 = new Employee(empId, name, salary);
                    System.out.println("============");
                    System.out.println(emp1);
                    System.out.println("============");
                    System.out.println("Employee Successfully Added!");
                }
                case 2 -> Employee.showTotalEmployee();
                case 3 -> Employee.showTotalSalary();
                case 4 -> {
                    return;
                }
                default -> System.out.println("Invalid choice, try again!");
            }
        }

    }
}
