package advancedJavaPractice.secondDay.myZad8;

public class Main {
    public static void main(String[] args) {
        Parcel parcel1 = new Parcel(50, 50, 200, 20, false);
        Parcel parcel2 = new Parcel(50, 50, 100, 20, true);
        Parcel parcel3 = new Parcel(10, 50, 30, 20, true);
        Parcel parcel4 = new Parcel(100, 100, 110, 10, true);

        Validator validator = new Validator();
        System.out.println("Can we ship parcel1: " + validator.validate(parcel1) + "\n");
        System.out.println("Can we ship parcel2: " + validator.validate(parcel2) + "\n");
        System.out.println("Can we ship parcel3: " + validator.validate(parcel3) + "\n");
        System.out.println("Can we ship parcel4: " + validator.validate(parcel4) + "\n");
    }
}
