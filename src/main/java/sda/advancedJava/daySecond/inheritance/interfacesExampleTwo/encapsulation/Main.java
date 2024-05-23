package sda.advancedJava.daySecond.inheritance.interfacesExampleTwo.encapsulation;

public class Main {
    public static void main(String[] args) {
        Prisoner pr1 = new Prisoner("1143-AM","Adrean", "Mickiewić");
        System.out.println("Name: ".concat(pr1.getName()));
        System.out.println("Lastname: ".concat(pr1.getLastName()));
    }
}
