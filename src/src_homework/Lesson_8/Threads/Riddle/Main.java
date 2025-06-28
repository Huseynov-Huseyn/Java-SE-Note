package src_homework.Lesson_8.Threads.Riddle;

public class Main {
    private static final Object lock = new Object();
    private static int turn = 1;

    public static void main(String[] args) {
        String[] words1 = {"Getdim", "bir", "2", "kor", "yırtıq", "var"};
        String[] words2 = {"gördüm", "dərədə", "kar", "kürkü", "kirpi"};
        Thread t1 = new Thread(() -> {
            for (String s : words1) {
                synchronized (lock) {
                    while (turn != 1) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
//                    System.out.println("Thread 1: " + s);
                    System.out.print(s + " ");
                    turn = 2;
                    lock.notifyAll();
                }
            }
        });
        Thread t2 = new Thread(() -> {
            for (String s : words2) {
                synchronized (lock) {
                    while (turn != 2) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
//                    System.out.println("Thread 2: " + s);
                    System.out.print(s + " ");
                    turn = 1;
                    lock.notifyAll();
                }
            }
        });
        t1.start();
        t2.start();
    }


}
