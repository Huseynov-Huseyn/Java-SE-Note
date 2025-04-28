package src_homework.Lesson_6.AparmentManagement;

import java.util.UUID;

public class Building {
    UUID id;
    String buildingName;
    int buildingNumber;
    int countOfFloor;
    String apartmentNumber;
    boolean mortgage;

    public Building(String buildingName, int buildingNumber, int countOfFloor, String apartmentNumber, boolean mortgage) {
        this.id = UUID.randomUUID();
        this.buildingName = buildingName;
        this.buildingNumber = buildingNumber;
        this.countOfFloor = countOfFloor;
        this.apartmentNumber = apartmentNumber;
        this.mortgage = mortgage;
    }

    @Override
    public String toString() {
        return "Building{" +
                "id=" + id +
                ", buildingName='" + buildingName + '\'' +
                ", buildingNumber=" + buildingNumber +
                ", countOfFloor=" + countOfFloor +
                ", apartmentNumber='" + apartmentNumber + '\'' +
                ", mortgage=" + mortgage +
                '}';
    }
}