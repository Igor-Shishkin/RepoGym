package concurrency;

public class mainForCondition {
    public static void main(String[] args) throws InterruptedException {
        CoffeeMakingActionsWithConditions actions = new CoffeeMakingActionsWithConditions();

        Thread t1 = new Thread(actions::addEspresso);
        Thread t2 = new Thread(actions::addMilk);
        Thread t3 = new Thread(actions::addSprinkles);

        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");

        t1.start();
        t2.start();
        t3.start();


        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
