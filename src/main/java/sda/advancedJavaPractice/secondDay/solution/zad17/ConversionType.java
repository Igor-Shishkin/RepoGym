package sda.advancedJavaPractice.secondDay.solution.zad17;

public enum ConversionType {
	METERS_TO_YARDS (1.09361d),
	YARDS_TO_METERS(0.9144d),
	CENTIMETERS_TO_INCHES(0.393701d),
	INCHES_TO_CENTIMETERS(2.54d),
	KILOMETERS_TO_MILES(0.621371d),
	MILES_TO_KILOMETERS(1.60934d);

	private final double factor;

	ConversionType(double factor) {
		this.factor = factor;
	}

	public double getFactor() {
		return factor;
	}
}
