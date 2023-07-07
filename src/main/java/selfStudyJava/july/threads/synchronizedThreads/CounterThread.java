package selfStudyJava.july.threads.synchronizedThreads;

public class CounterThread implements Runnable{
    CommonObject res;
    CounterThread(CommonObject res) {
        this.res = res;
    }
    @Override
    public void run() {
    synchronized(res) {
        res.counter = 1;
        for (int i = 1; i < 5; i++) {
            System.out.printf("'%s' - %d\n", Thread.currentThread().getName(),
                    res.counter);
            res.counter++;
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {}
    }
    }
}
