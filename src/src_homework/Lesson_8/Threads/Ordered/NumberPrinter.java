package src_homework.Lesson_8.Threads.Ordered;

public class NumberPrinter implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println(this.getClass().getSimpleName() + " " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
