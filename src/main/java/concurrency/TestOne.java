package concurrency;

public class TestOne {
    public static Integer counter = 0;
    public static Integer anotherCounter = 0;
    private static final Object counterLock = new Object();
    private static final Object anotherCounterLock = new Object();

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                increment();
            }
        });

        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                anotherIncrement();
            }
        });

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.println("Counter: " + counter);
        System.out.println("another counter: " + anotherCounter);
        System.out.println("Time: " + duration);
    }

    private static void increment() {
        synchronized (counterLock) {
            counter++;
        }
    }
    private static void anotherIncrement() {
        synchronized (anotherCounterLock) {
            anotherCounter++;
        }
    }
}
