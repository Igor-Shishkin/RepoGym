package sda.testingWithSDA.service;

import java.util.Random;

public class RandomService {
    private final Random random = new Random();

    public int getRandomInt(final int bound) {
        return random.nextInt(bound);
    }
}

