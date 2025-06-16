package src_summary.Lesson_8.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {


//      Compile (Time) Exception - checked exception
        try {
            FileReader fl = new FileReader("C:\\Users\\Huseyn_\\IdeaProjects\\Java-SE-Note\\src\\src_summary\\Lesson_8\\ExceptionHandling\\nature.jpg");
            System.out.println(fl.getEncoding());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }


//      Runtime (Time) exception - Unchecked exception
        int a = 10, b = 0;
        int[] nums = new int[1];
        try {
            nums[0] = 2;
            nums[1] = 2;
            System.out.println(nums[1]);
            System.out.println(a / b);

        } catch (ArithmeticException e) {
            System.out.println("divide / 0 exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Program continues after handling the exception.");
        }

    }
}
