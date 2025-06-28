package src_homework.Lesson_8.Threads.OddEven;

public class Main {
    private static final int MAX = 10000;
    private final Object lock = new Object();
    private int number = 1;

    public static void main(String[] args) {
        Main m = new Main();
        Thread oddThread = new Thread(() -> m.printOdd());
        Thread evenThread = new Thread(() -> m.printEven());
        oddThread.start();
        evenThread.start();
    }

    public void printOdd() {
        while (number <= MAX) {
            synchronized (lock) {
                if (number % 2 == 1) {
                    System.out.println("Odd number : " + number);
                    number++;
                    lock.notify();
                } else {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

            synchronized (lock) {
                lock.notifyAll();
            }
        }
    }

    public void printEven() {
        while (number <= MAX) {
            synchronized (lock) {
                if (number % 2 == 0) {
                    System.out.println("Even number : " + number);
                    number++;
                    lock.notify();
                } else {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            synchronized (lock) {
                lock.notifyAll();
            }
        }
    }
}
