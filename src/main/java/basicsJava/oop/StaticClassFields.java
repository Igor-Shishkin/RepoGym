package basicsJava.oop;

public class StaticClassFields {
    public static void main(String[] args) {
        Phone phoneOne = new Phone("Sumsung", "Galaxy", 2021);
        Phone phoneTwo = new Phone("iPhone", "7", 2019);
        Phone phoneThree = new Phone("Xiaomi", "Mi9", 2015);

        System.out.println("The quontity of writing phones is " + Phone.numberOfPhones);

        Phone.decrementNumberOfPhones();
        System.out.println("The quontity of writing phones is " + Phone.numberOfPhones);

    }


}
