package src_summary.Lesson_8.Threads;

public class Threads {
    public static void main(String[] args) {

        SimpleThread thread1 = new SimpleThread();
        SimpleThread thread2 = new SimpleThread();
        thread1.start();
        thread2.start();
    }
}

class SimpleThread extends Thread {
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getId() + " - Count: " + i);
        }
    }
}
