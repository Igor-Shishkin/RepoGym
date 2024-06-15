package concurrency.bySulejmanow.collections;

import java.util.concurrent.BlockingQueue;

public class WriteToPriorityQueueWorker implements Runnable {

    private final BlockingQueue<Integer> queue;

    public WriteToPriorityQueueWorker(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            queue.put(4);
            queue.put(3);
            queue.put(1);
            queue.put(2);
            queue.put(Integer.MAX_VALUE);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}