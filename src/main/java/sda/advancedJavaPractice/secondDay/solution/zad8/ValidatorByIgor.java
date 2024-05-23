package sda.advancedJavaPractice.secondDay.solution.zad8;

public class ValidatorByIgor implements Validator {

	@Override
	public boolean validate(Parcel input) {
		boolean good = true;
		if (input.getXLength() + input.getYLength() + input.getZLength() > 300) {
			System.out.println("The sum of the dimensions is greater than 300");
			System.out.println("We can't send the parcel");
			good = false;
		}
		if (input.getZLength() < 30
				|| input.getXLength() < 30
				|| input.getYLength() < 30) {
			System.out.println("One of the dimensions is less than 30");
			System.out.println("We can't send the parcel");
			good = false;
		}
		if ((input.isExpress() && input.getWeight()>15) || (!input.isExpress() && input.getWeight()>30)) {
			System.out.println("Parcel is too heavy");
			System.out.println("The weight is too heavy for this type of shipment");
			good = false;
		}
		return good;
	}
}
