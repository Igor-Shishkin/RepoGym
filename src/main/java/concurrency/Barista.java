package concurrency;

public class Barista extends Thread{
    private final String name;
    private int numberOfCoffee;
    private final int speed;

    public Barista(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void makeCoffee(int numberOfCoffee) {
        this.numberOfCoffee = numberOfCoffee;
        start();
    }

    @Override
    public void run() {
        for (int i = 0; i < numberOfCoffee; i++) {
            try {
                sleep(speed);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name + ": " + (i+1) +" cup of coffee ready");
        }
    }

    public static void main(String[] args) {
        Barista b1 = new Barista("Bob", 500);
        Barista b2 = new Barista("John", 700);

        b1.makeCoffee(5);
        b2.makeCoffee(4);
    }
}
