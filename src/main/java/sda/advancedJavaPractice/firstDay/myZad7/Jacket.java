package sda.advancedJavaPractice.firstDay.myZad7;

import java.util.AbstractQueue;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Jacket {
    private Deque<String> stack = new ArrayDeque<>();
    private final int size;

    public Jacket (int size) {
        this.size = size;
        this.stack = new ArrayDeque<>();
    }

    public boolean isLoaded () {
        if (stack.size() == this.size) {
            System.out.println("is full");
            return true;
        } else {
            System.out.println("isn't full");
            return false;
        }
    }
    public void loadBullet (String bullet){
        if (!isLoaded()) {
            stack.add(bullet);
            System.out.println("Bullet is loaded!");
        } else {
            System.out.println("Error :(");
        }
    }
    public void shot () {
        if (!stack.isEmpty()) {
            System.out.println("Bullet '" + stack.removeLast() + "' is shot");
        } else {
            System.out.println("There aren't bullets");
        }
    }


}
