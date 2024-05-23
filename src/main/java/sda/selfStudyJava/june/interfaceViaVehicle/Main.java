package sda.selfStudyJava.june.interfaceViaVehicle;

public class Main {
    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);
        System.out.println("Bicycle present states: ");
        bicycle.printStates();

        Bike bike = new Bike();
        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBrakes(3);
        System.out.println("Bike present state: ");
        bike.printStates();

    }
}