package sda.selfStudyJava.july.threads.EggVsChickenWithRunnable;

public class Egg implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(ChickenEgg.getTimeSleep());
                System.out.println("Egg");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
