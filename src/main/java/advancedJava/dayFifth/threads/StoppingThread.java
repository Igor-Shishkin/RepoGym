package advancedJava.dayFifth.threads;

import java.util.logging.Logger;

public class StoppingThread implements Runnable{
    private static final Logger LOGGER = Logger.getLogger(StoppingThread.class.getName());

    @Override
    public void run() {
        LOGGER.info("WĄtek " + Thread.currentThread().getName() + " został zmieniony.");
        System.out.println("WĄtek " + Thread.currentThread().getName() + " został zmieniony.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e)  {
            LOGGER.info("WĄtek " + Thread.currentThread().getName() + " został przerwany.");
            System.out.println("WĄtek " + Thread.currentThread().getName() + " został przerwany.");
        }
        LOGGER.info("WĄtek " + Thread.currentThread().getName() + " został skończony.");
        System.out.println("WĄtek " + Thread.currentThread().getName() + " został skończony.");

    }
}
