package src_homework.Lesson_7.Inheritance.VehiclesType;

class AirVehicle extends Vehicle {
    private double wingspan;
    private double enginePower;

    public AirVehicle(String make, String model, int year, double topSpeed, double wingspan, double enginePower) {
        super(make, model, year, topSpeed);
        this.wingspan = wingspan;
        this.enginePower = enginePower;
    }

    public void takeOff() {
        System.out.println("The plane gracefully lifts off the runway.");
    }

    public void land() {
        System.out.println("The plane touches down on the runway.");
    }

    @Override
    public void accelerate() {
        System.out.println("The plane takes off with a powerful thrust.");
    }

    @Override
    public void brake() {
        System.out.println("The plane reduces speed as it lands.");
    }
}

