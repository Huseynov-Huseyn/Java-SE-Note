package src_homework.Lesson_7.Encapsulation;

public class Main {
    public static void main(String[] args) {

        Person p = new Person(1, "Huseyn", "Huseynov", "Student");
        System.out.println("Person's age : " + p.getAge());
        System.out.println("Person's name : " + p.getName());
        System.out.println("Person's surname : " + p.getSurname());
        System.out.println("Person's title : " + p.getTitle());

        p.setAge(2);
        p.setName("Ali");
        p.setSurname("Vali");
        p.setTitle("Teacher");
    }
}
