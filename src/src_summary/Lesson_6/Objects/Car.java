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
        //Override toString() = Car{brand='BMW', model='I5', year='2022'}
    }

    //Object class's toString() = src_summary.Lesson_6.Objects.Car@5f184fc6
}
