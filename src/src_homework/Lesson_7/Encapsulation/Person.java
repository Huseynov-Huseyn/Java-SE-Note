package src_homework.Lesson_7.Encapsulation;

public class Person {
    private int age;
    private String name;
    private String surname;
    private String title;

    public Person(int age, String name, String surname, String title) {
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.title = title;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
