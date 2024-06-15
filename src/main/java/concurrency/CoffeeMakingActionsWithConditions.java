package concurrency;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;


public class CoffeeMakingActionsWithConditions {
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition conditionOne = lock.newCondition();
    private final Condition conditionTwo = lock.newCondition();

    public void addEspresso() {
        lock.lock();
        try {
            System.out.println("Espresso is added");
            conditionOne.signal();
        } finally {
            lock.unlock();
        }
    }

    public void addMilk() {
        lock.lock();
        try {
            conditionOne.await();
            System.out.println("Milk is added");
            conditionTwo.signal();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }

    }

    public void addSprinkles() {
        lock.lock();
        try {
            conditionTwo.await();
            System.out.println("Sprinkles is added");
        } catch (InterruptedException e) {
            System.out.println("Exception: " + e);
        } finally {
            lock.unlock();
        }

    }
}