package src_summary.Lesson_6.Objects;

public class Car {

    String model;
    String brand;
    int year;

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
