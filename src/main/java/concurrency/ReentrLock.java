package concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrLock {
    private static Integer counter = 0;
    private static final Lock counterLock = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() ->
        {
            for (int i = 0; i < 1_000_000; i++) {
                increment();
            }
        });
        Thread t2 = new Thread(() ->
        {
            for (int i = 0; i < 1_000_000; i++) {
                increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("counter: " + counter);
    }


    private static void increment() {
//        counterLock.lock();
        counter++;
//        counterLock.unlock();
    }
}
