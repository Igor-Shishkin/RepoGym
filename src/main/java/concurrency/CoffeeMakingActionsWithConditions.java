package concurrency;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;


public class CoffeeMakingActionsWithConditions {
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition conditionOne = lock.newCondition();
    private final Condition conditionTwo = lock.newCondition();
    private boolean espressoAdded = false;
    private boolean milkAdded = false;

    public void addEspresso() {
        lock.lock();
        try {
            System.out.println("Espresso is added");
            espressoAdded = true;
            conditionOne.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void addMilk() {
        lock.lock();
        try {
            while (!espressoAdded) {
                conditionOne.await();
            }
            System.out.println("Milk is added");
            milkAdded = true;
            conditionTwo.signalAll();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    public void addSprinkles() {
        lock.lock();
        try {
            while (!milkAdded) {
                conditionTwo.await();
            }
            System.out.println("Sprinkles is added");
        } catch (InterruptedException e) {
            System.out.println("Exception: " + e);
        } finally {
            lock.unlock();
        }
    }
}