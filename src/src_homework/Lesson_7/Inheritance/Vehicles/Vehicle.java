package src_homework.Lesson_7.Inheritance.Vehicles;

public class Vehicle {
    protected String model;
    protected String make;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String showInfo() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
