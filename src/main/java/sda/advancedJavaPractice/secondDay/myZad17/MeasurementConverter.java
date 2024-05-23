package sda.advancedJavaPractice.secondDay.myZad17;

public class MeasurementConverter {
    public double convert (double value, ConversionType conversionType) {
        return value*conversionType.getFactor();
    }
}
