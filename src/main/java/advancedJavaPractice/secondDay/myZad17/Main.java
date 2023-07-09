package advancedJavaPractice.secondDay.myZad17;

public class Main {
    public static void main(String[] args) {
        MeasurementConverter measurementConverter = new MeasurementConverter();
        System.out.println(measurementConverter.convert(1, ConversionType.CENTIMETERS_TO_INCHES));
        System.out.println(measurementConverter.convert(3, ConversionType.KILOMETERS_TO_MILES));
        System.out.println(measurementConverter.convert(4, ConversionType.METERS_TO_YARDS));
        System.out.println(measurementConverter.convert(3, ConversionType.MILES_TO_KILOMETERS));
        System.out.println(measurementConverter.convert(1, ConversionType.INCHES_TO_CENTIMETERS));
    }
}
