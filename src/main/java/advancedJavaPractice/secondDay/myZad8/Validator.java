package advancedJavaPractice.secondDay.myZad8;

public class Validator implements Validable {

    @Override
    public boolean validate(Parcel input) {
        boolean good = true;
        if (input.getxLength() + input.getyLength() + input.getzLength() > 300) {
            System.out.println("The sum of the dimensions is greater than 300");
//            System.out.println("We can't send the parcel");
            good = false;
        }
        if (input.getzLength() < 30
                || input.getxLength() < 30
                || input.getyLength() < 30) {
            System.out.println("One of the dimensions is less than 30");
//            System.out.println("We can't send the parcel");
            good = false;
        }
        if ((input.isExpress() && input.getWeight()>15) || (!input.isExpress() && input.getWeight()>30)) {
            System.out.println("The weight is too heavy for this type of shipment");
            good = false;
        }
        return good;
    }
}
