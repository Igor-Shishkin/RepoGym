package sda.selfStudyJava.broCode.abstractionClass.personHero;

public class Main {
    public static void main(String[] args) {
        Hero heroOne = new Hero("BatMan", 42, "$$$");
        Hero heroTwo = new Hero("Superman", 39, "fly");

        System.out.println(heroOne.name);
        System.out.println(heroOne.age);
        System.out.println(heroOne.power);

        System.out.println(heroTwo);
    }
}