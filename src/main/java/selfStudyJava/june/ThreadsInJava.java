package selfStudyJava.june;

public class ThreadsInJava {
    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();
        ThreadGroup threadGroup = currentThread.getThreadGroup();
        System.out.println("Thread: " + currentThread.getName());
        System.out.println("Thread Group: " + threadGroup.getName());
        System.out.println("Parent Group: " + threadGroup.getParent().getName());
    }
}