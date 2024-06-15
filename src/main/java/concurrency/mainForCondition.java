package concurrency;

public class mainForCondition {
    public static void main(String[] args) throws InterruptedException {
        CoffeeMakingActionsWithSemaphore actions = new CoffeeMakingActionsWithSemaphore();

        Thread t1 = new Thread(actions::addEspresso);
        Thread t2 = new Thread(actions::addMilk);
        Thread t3 = new Thread(actions::addSprinkles);


        t3.start();
        t2.start();
        t1.start();


        try {
            t2.join();
            t3.join();
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
