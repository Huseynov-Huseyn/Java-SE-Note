package src_homework.Lesson_7.Inheritance.Vehicles;

public class Car extends Vehicle {
    int numDoors;

    public Car(String make, String model, int numDoors) {
        super(make, model);
        this.numDoors = numDoors;
    }

    @Override
    public String showInfo() {
        return "Car{" +
                "numDoors=" + numDoors +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
