package src_summary.Lesson_8.Threads;

import java.util.concurrent.atomic.AtomicInteger;

public class Atomic {
    public static void main(String[] args) {

        AtomicInteger atomicInt = new AtomicInteger(0);
        //atomic increment
        atomicInt.incrementAndGet();
        // Atomic compare-and-set operation
        boolean updated = atomicInt.compareAndSet(1, 2);
        System.out.println("Atomic integer value : " + atomicInt.get());
        System.out.println("Updated successful: " + updated);
    }
}
