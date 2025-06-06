package src_homework.Lesson_7.Inheritance.VehiclesType;

public class Main {
    public static void main(String[] args) {

        GroundVehicle car = new GroundVehicle("bmw", "i8", 2025, 250, 4, "v8 turbo");
        AirVehicle plane = new AirVehicle("Boeing", "747", 2018, 900.0, 68.5, 140000.0);
        WaterVehicle boat = new WaterVehicle("Yamaha", "WaveRunner", 2020, 85.0, "V-hull", 300.0);

        System.out.println("=== Ground Vehicle ===");
        car.accelerate();
        car.drive();
        car.brake();
        car.park();

        System.out.println("\n=== Air Vehicle ===");
        plane.accelerate();
        plane.takeOff();
        plane.brake();
        plane.land();

        System.out.println("\n=== Water Vehicle ===");
        boat.accelerate();
        boat.sail();
        boat.brake();
        boat.dock();
    }
}
