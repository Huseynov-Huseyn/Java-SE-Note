package src_summary.Lesson_8.Threads;

public class ThreadMethods {
    private static Object lock = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread 1: Waiting...");
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1 : waked up");
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread 2: Notifying...");
                lock.notify();
                System.out.println("Thread 2 : Notified!");
            }
        });
        t1.start();
        t2.start();
    }
}
