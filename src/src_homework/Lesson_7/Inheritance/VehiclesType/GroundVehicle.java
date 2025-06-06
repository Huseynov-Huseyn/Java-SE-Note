package src_homework.Lesson_7.Inheritance.VehiclesType;

class GroundVehicle extends Vehicle {
    private int numWheels;
    private String engineType;

    public GroundVehicle(String make, String model, int year, double topSpeed, int numWheels, String engineType) {
        super(make, model, year, topSpeed);
        this.numWheels = numWheels;
        this.engineType = engineType;
    }

    public void drive() {
        System.out.println("The vehicle smoothly navigates the road.");
    }

    public void park() {
        System.out.println("The car effortlessly parks in the spot.");
    }

    @Override
    public void accelerate() {
        System.out.println("The car accelerates quickly.");
    }

    @Override
    public void brake() {
        System.out.println("The car comes to a smooth stop.");
    }
}
