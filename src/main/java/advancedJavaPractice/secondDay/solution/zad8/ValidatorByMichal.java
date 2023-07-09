package advancedJavaPractice.secondDay.solution.zad8;

public class ValidatorByMichal implements Validator {

	public boolean validate(Parcel input) {
		int sum = input.getXLength() + input.getYLength() + input.getZLength();

		if (sum > 300) {
			System.out.println("Parcel is to big.");
			return false;
		}

		if (input.getXLength() < 30 || input.getYLength() < 30 || input.getZLength() < 30) {
			System.out.println("One of the dimension is to small.");
			return false;
		}

		float maxWeight = getMaxWeight(input);
		if (input.getWeight() > maxWeight) {
			System.out.println("Weight is to high.");
			return false;
		}
		return true;
	}

	private float getMaxWeight(Parcel input) {
		float maxWeight;
		if (input.isExpress()) {
			maxWeight = 15.0f;
		} else {
			maxWeight = 30.0f;
		}
		return maxWeight;
	}
}
