package src_homework.Lesson_8.Threads.Ordered;

public class MultiThreadExample {
    public static void main(String[] args) {

        NumberPrinter numberPrinter = new NumberPrinter();
        Thread t1 = new Thread(numberPrinter);
        LetterPrinter letterPrinter = new LetterPrinter();
        Thread t2 = new Thread(letterPrinter);
        t1.start();
        t2.start();
    }
}
