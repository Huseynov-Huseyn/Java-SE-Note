package src_summary.Lesson_7.OOP.Encapsulation;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Huseyn", "Huseynov");
        System.out.println("Student's id : " + s1.getId());
        System.out.println("Student's name : " + s1.getName());
        System.out.println("Student's surname : " + s1.getSurname());
        s1.setId(2);
        s1.setName("Ali");
        s1.setSurname("Valiyev");
    }
}
