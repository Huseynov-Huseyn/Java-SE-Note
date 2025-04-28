package src_homework.Lesson_6.AparmentManagement;

import java.util.UUID;

public class Person {
    UUID id;
    String name;
    String lastName;
    int age;
    String profession;
    int numberOfFamilies;
    Building building;


    public Person(String name, String lastName, int age, String profession, int numberOfFamilies, Building building) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.profession = profession;
        this.numberOfFamilies = numberOfFamilies;
        this.building = building;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", profession='" + profession + '\'' +
                ", numberOfFamilies=" + numberOfFamilies +
                ", building=" + building +
                '}';
    }
}
