package src_homework.Lesson_8.Threads.Ordered;

public class LetterPrinter implements Runnable {
    @Override
    public void run() {
        for (int i = 65; i < 70; i++) {
            System.out.println(this.getClass().getSimpleName() + " " + (char) i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}