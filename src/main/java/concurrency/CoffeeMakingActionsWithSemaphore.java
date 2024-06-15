package concurrency;

import java.util.concurrent.Semaphore;

public class CoffeeMakingActionsWithSemaphore {
    private final Semaphore s1 = new Semaphore(0);
    private final Semaphore s2 = new Semaphore(0);

    public void addEspresso() {
        System.out.println("Espresso is added");
        s1.release(10);
    }

    public void addMilk() {
        try {
            s1.acquire();
            System.out.println("Milk is added");
            s2.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void addSprinkles() {
        try {
            s2.acquire();
            System.out.println("Sprinkles is added");
        } catch (InterruptedException e) {
            System.out.println("Exception: " + e);
        }
    }
}
