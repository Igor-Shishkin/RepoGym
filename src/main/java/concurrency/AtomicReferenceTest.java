package concurrency;

import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceTest {
    private static AtomicReference<Integer> counter;

    public static void main(String[] args) throws InterruptedException {
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

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
    static void increment() {
        counter.set(counter.get()+1);
    }
}
