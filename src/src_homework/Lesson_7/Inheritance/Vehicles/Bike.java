package src_homework.Lesson_7.Inheritance.Vehicles;

public class Bike extends Vehicle {
    int numWheels;

    public Bike(String make, String model, int numWheels) {
        super(make, model);
        this.numWheels = numWheels;
    }

    @Override
    public String showInfo() {
        return "Bike{" +
                "numWheels=" + numWheels +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
