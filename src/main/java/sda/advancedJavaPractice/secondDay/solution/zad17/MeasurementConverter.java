package sda.advancedJavaPractice.secondDay.solution.zad17;

public class MeasurementConverter {

	public double convert(double value, ConversionType conversionType) {
		return value * conversionType.getFactor();
	}
}
