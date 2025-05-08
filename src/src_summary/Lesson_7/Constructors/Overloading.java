package src_summary.Lesson_7.Constructors;

public class Overloading {
    String name;
    String surname;
    int age;
    double score;

    // Constructor Overloading
    public Overloading(String name) {
        this.name = name;
    }

    // Constructor Overloading
    public Overloading(double score) {
        this.score = score;
    }


    //    Default Constructor
    public Overloading() {
    }

    //  Parameterized Constructor
    public Overloading(int age) {
        this.age = age;
    }


    //    Copy Constructor
    public Overloading(Overloading obj) {
        this.name = obj.name;
        this.surname = obj.surname;
        this.age = obj.age;
    }
}