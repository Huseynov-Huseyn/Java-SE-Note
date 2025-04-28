package src_homework.Lesson_6.LibrarySystem;

public class Author {
    String name;
    int birthYear;

    public Author(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Author : " + name + " (Birth Year: " + birthYear + ")";
    }
}
