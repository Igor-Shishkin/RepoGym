package sda.selfStudyJava.reflectionAPI;

import java.util.Arrays;

public class trainOne {


    public static void analyzeClass(Object o) {
        Class clazz = o.getClass();
        System.out.println("class: " + clazz);
        System.out.println("fields: " + Arrays.toString(clazz.getDeclaredFields()));
        System.out.println("parent class: " + clazz.getSuperclass());
        System.out.println("methods: " + Arrays.toString(clazz.getDeclaredMethods()));
        System.out.println("constructors: " + Arrays.toString(clazz.getConstructors()));

    }

    public static void main(String[] args) {

        analyzeClass(new Cat("Barsik", 6));
    }
}


