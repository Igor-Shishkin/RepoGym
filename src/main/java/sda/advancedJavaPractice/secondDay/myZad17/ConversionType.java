package sda.advancedJavaPractice.secondDay.myZad17;

public enum ConversionType {
    METERS_TO_YARDS (1.09361),
    YARDS_TO_METERS(0.9144),
    CENTIMETERS_TO_INCHES(0.393701),
    INCHES_TO_CENTIMETERS (2.54),
    KILOMETERS_TO_MILES(0.621371),
    MILES_TO_KILOMETERS (1.60934);


    private double factor;

    ConversionType(double converter) {
        this.factor = converter;
    }

    public double getFactor() {
        return factor;
    }
}
