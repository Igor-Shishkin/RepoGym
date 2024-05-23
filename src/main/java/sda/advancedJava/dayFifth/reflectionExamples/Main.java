package sda.advancedJava.dayFifth.reflectionExamples;

import advancedJava.dayForth.models.Car;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Car car = new Car();
        System.out.println(car);
        Field field = Car.class.getDeclaredField("make");
        field.setAccessible(true);
        field.set(car, "Toyota-MGM");
        Field modelField = Car.class.getDeclaredField("model");
        modelField.setAccessible(true);
        modelField.set(car, "Camry");
        System.out.println(car);
    }
}
