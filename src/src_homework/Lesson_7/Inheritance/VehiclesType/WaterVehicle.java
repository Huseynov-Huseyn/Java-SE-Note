package src_homework.Lesson_7.Inheritance.VehiclesType;

class WaterVehicle extends Vehicle {
    private String hullType;
    private double enginePower;

    public WaterVehicle(String make, String model, int year, double topSpeed, String hullType, double enginePower) {
        super(make, model, year, topSpeed);
        this.hullType = hullType;
        this.enginePower = enginePower;
    }

    public void sail() {
        System.out.println("The boat cuts through the waves gracefully.");
    }

    public void dock() {
        System.out.println("The boat is secured at the dock.");
    }

    @Override
    public void accelerate() {
        System.out.println("The boat increases speed steadily.");
    }

    @Override
    public void brake() {
        System.out.println("The boat slows down gradually.");
    }
}

