package src_summary.Lesson_6.Memory;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Huseyn", 123);
        System.out.println(s1);
        Student s2 = s1;
        System.out.println(s2);

        System.out.println(s1 == s2);
        System.out.println(s2.equals(s1));
    }
}
