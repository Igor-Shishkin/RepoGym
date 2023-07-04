package advancedJava.dayFifth.threads;

public class HelloWorldRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("WITAJ" +
                "\n\t" + Thread.currentThread().getName() +
                "\n\t" + Thread.currentThread().getThreadGroup() +
                "\n\t" + Thread.currentThread().getId() +
                "\n\t" + Thread.currentThread().getPriority() +
                "\n\t" + Thread.currentThread().getState() );
    }

}
