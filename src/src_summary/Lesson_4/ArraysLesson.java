package src_summary.Lesson_4;

public class ArraysLesson {

    public static void main(String[] args) {

        String[] names = new String[3];
        String[] surnames = {"Huseynov", "Eliyev", "Veliyev"};
        System.out.println(names[2]);

//        Datatypes static values

        for (int i = 0; i < surnames.length; i++) {
            System.out.println(surnames[i]);
        }

        for (String s : surnames) {
            System.out.println(s);
        }

    }
}
