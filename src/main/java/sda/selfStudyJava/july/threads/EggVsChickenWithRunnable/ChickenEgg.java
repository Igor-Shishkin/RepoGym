package sda.selfStudyJava.july.threads.EggVsChickenWithRunnable;

import java.util.Random;

public class ChickenEgg {
    public static int getTimeSleep() {
        final Random random = new Random();
        int tm = random.nextInt(1000);
        if (tm<10) { tm *= 100;}
         else if (tm<100) {tm *= 10;}
        return tm;

    }
    public static void main(String[] args) throws InterruptedException {
        Thread egg = new Thread(new Egg());
        System.out.println("Which came first: the egg or the chicken?");
        egg.start();
        egg.setPriority(4);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(getTimeSleep());
                System.out.println("Chicken");
            } catch (InterruptedException e) {};
        }
        if (egg.isAlive()) {
            try {
                egg.join();
            } catch (InterruptedException e) {}
            System.out.println("The egg came first!");
        } else {
            System.out.println("The chicken came first!");
        }
    }
}
