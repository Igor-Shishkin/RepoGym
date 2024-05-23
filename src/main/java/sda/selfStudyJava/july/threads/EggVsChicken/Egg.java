package sda.selfStudyJava.july.threads.EggVsChicken;

public class Egg extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(ChickenEgg.getTimeSleep());
                System.out.println("Egg");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
