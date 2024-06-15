package concurrency.bySulejmanow.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionSafeDemo {
    public static void main(String[] args) {
        List<Integer> threadSafeList = Collections.synchronizedList(new LinkedList<>());

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                threadSafeList.add(i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1_000_000; i++) {
                threadSafeList.add(i);
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("threadUnsafeList size: " + threadSafeList.size());
    }
}