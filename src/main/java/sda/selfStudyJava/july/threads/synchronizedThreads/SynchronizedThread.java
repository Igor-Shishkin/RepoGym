package sda.selfStudyJava.july.threads.synchronizedThreads;

public class SynchronizedThread {
    public static void main(String[] args) {
        CommonObject commonObject = new CommonObject();
        for (int i = 1; i<6; i++) {
            Thread t;
            t = new Thread(new CounterThread(commonObject));
            t.setName("Thread" + i);
            t.start();
        }
    }
}
