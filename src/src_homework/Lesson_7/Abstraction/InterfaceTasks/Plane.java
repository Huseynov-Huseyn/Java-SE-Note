package src_homework.Lesson_7.Abstraction.InterfaceTasks;

public class Plane implements Flyable, Transport {
    private final double capacity;
    private String destination;

    public Plane(double capacity, String destination) {
        this.capacity = capacity;
        this.destination = destination;
    }

    @Override
    public void takeOff() {
        System.out.println("PLane is taking off");
    }

    @Override
    public void land() {
        System.out.println("Plane is landing");
    }

    @Override
    public String getCapacity() {
        return "Plane's capacity  : " + capacity;
    }

    @Override
    public String getDestination() {
        return "Plane's destination : " + destination;
    }

    @Override
    public void setDestination(String destination) {
        System.out.println("Old destination is : " + this.destination);
        this.destination = destination;
        System.out.println("New destination is : " + destination);
    }
}
