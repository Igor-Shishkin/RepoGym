package advancedJavaPractice.secondDay.solution.zad8;

public class ValidableParcelByPiotr implements Validator {

	public final int xLength;
	public final int yLength;
	public final int zLength;
	public final float weight;
	public final boolean isExpress;

	public ValidableParcelByPiotr(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
		this.xLength = xLength;
		this.yLength = yLength;
		this.zLength = zLength;
		this.weight = weight;
		this.isExpress = isExpress;
	}

	@Override
	public String toString() {
		return "Parcel{" +
				"xLength=" + xLength +
				", yLength=" + yLength +
				", zLength=" + zLength +
				", weight=" + weight +
				", isExpress=" + isExpress +
				'}';
	}

	@Override
	public boolean validate(Parcel input) {
		if ((input.getXLength() + input.getYLength() + input.getZLength()) <= 300
				&& input.getXLength() >= 30
				&& input.getYLength() >= 30
				&& input.getZLength() >= 30) {
			if (input.getWeight() <= 30F && !input.isExpress()
					|| input.getWeight() <= 15F && input.isExpress()) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
