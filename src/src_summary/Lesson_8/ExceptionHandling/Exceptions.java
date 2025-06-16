package src_summary.Lesson_8.ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class Exceptions {
    public static void main(String[] args) {

//      Inout/Output exception
        try {
            FileReader reader = new FileReader("nonexistent.txt");
            reader.read();
            reader.close();
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        }

//       stackOverflowException
        callMe(2);
    }

    public static void callMe(int a) {
        System.out.println(a);
        callMe(++a);
    }
}
