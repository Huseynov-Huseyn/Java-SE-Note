package src_homework.Lesson_6.Automobile;

import java.util.Scanner;

public class Car {
    String make;
    String model;
    int year;
    double mil;
    Scanner scan = new Scanner(System.in);

    void milCalculate() {
        System.out.println("Car's km : " + mil * 1.6 + " km");
    }

    void carAge() {
        System.out.println("Car's age : " + (2025 - year));
    }

    public void createCar() {
        System.out.print("Car make : ");
        this.make = scan.nextLine();
        System.out.print("Car model : ");
        this.model = scan.nextLine();
        System.out.print("Car year : ");
        this.year = scan.nextInt();
        System.out.print("Car mil : ");
        this.mil = scan.nextDouble();
        System.out.println();
        milCalculate();
        carAge();
        System.out.println();
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", mil=" + mil +
                '}';
    }
}
