package src_summary.Lesson_7.ThisKeyword;

public class Student {
    static String name;


//    this.name = name; is only meaningful when name is an instance variable.
//    public Student(String name) {
//        this.name = name;
//    }

    //    Correct version : You should not use this to access static variables — use the class name instead.
    public Student(String name) {
        Student.name = name;
    }

}