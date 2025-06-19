package src_homework.Lesson_8.ExceptionHandling.PasswordChecking;

public class Main {
    public static void main(String[] args) {

        Account a = new Account("Huseyn", "Huseyn123");
        System.out.println(a.validatePassword());

    }
}
