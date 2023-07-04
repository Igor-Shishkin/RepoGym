package advancedJava.dayFifth.threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*
        // Tworzenie wątku za pomocą klasy rozszeranej
        HelloWorldThread t1 = new HelloWorldThread();
        HelloWorldThread t2 = new HelloWorldThread();
        HelloWorldThread t3 = new HelloWorldThread();

        t1.setName("Pierwszy z Thread");
        t2.setName("Drugi z Thread");
        t3.setName("Trzeci z Thread");
        System.out.println("t1: " + t1 + "\nt2: " + t2 + "\nt3: " + t3);

        t1.setPriority(1);
        t2.setPriority(2);
        t3.setPriority(3);

        t1.run();
        t2.run();
        t3.run();

        t1.start();
        t2.start();
        t3.start();
         */

        /*
        Integer[] numbers = new Integer[1];
        Integer number = numbers[1];

        HelloWorldRunnable helloWorldRunnable1 = new HelloWorldRunnable();
        Thread t11 = new Thread(helloWorldRunnable1);
        Thread t21 = new Thread(helloWorldRunnable1);
        Thread t31 = new Thread(helloWorldRunnable1);
        t11.setName("HelloRunnable11");
        t21.setName("HelloRunnable21");
        t31.setName("HelloRunnable31");
        //t11.run();
        t11.start();
        t21.start();
        t31.start();
         */


        System.out.println("Przerwany wątek");
        Thread sleepingThread = new Thread(new SleepingThreadIsInterruptedCheck());
        sleepingThread.start();
        Thread.sleep(1300);
        sleepingThread.interrupt();


        System.out.println("Przerywanie wątków");
        Thread sleeping = new Thread(new SleepingThreadIsInterruptedCheck());
        sleeping.start(); //510 milisekund
        Thread.sleep(500);
        sleeping.interrupt();
        StoppingThread stoppingThread = new StoppingThread();
        Thread stopping01 = new Thread(stoppingThread);
        Thread stopping02 = new Thread(stoppingThread);
        stopping02.setName("Drugi");
        stopping01.setName("Pierwszy");
        stopping01.start();
        stopping02.start();
        Thread.sleep(1000);
        stopping01.interrupt();
        stopping02.interrupt();
/*
        Thread count01 = new Thread(new Counting());
        Thread count02 = new Thread(new Counting());
        count01.setName("Counter_1");
        count02.setName("Counter_2");
        //count02.setPriority(5);
        count01.start();
        count02.start();

 */

        new Thread(() -> System.out.println(Thread.currentThread().getName()));













    }
}
