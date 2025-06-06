package src_homework.Lesson_7.Inheritance.VehiclesType;

class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    protected double topSpeed;

    public Vehicle(String make, String model, int year, double topSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.topSpeed = topSpeed;
    }

    public void accelerate() {
        System.out.println("The vehicle accelerates.");
    }

    public void brake() {
        System.out.println("The vehicle slows down.");
    }

    public double getTopSpeed() {
        return topSpeed;
    }
}
