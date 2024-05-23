Zadanie 17.
Stwórz klasę enum `ConversionType` ze stałymi METERS_TO_YARDS, YARDS_TO_METERS,
CENTIMETERS_TO_INCHES, INCHES_TO_CENTIMETERS, KILOMETERS_TO_MILES, MILES_TO_KILOMETERS.
Enum powinien posiadać parametr typu `Converter` służący do przeprowadzania obliczeń dla danego typu.
Następnie stwórz klasę `MeasurementConverter`, która będzie posiadała metodę `convert(double value,
ConversionType conversionType)` i na podstawie przekazanej wartości oraz typu konwersji, korzystała z
Convertera danego typu i zwracała wynik.


metry na jardy - 1.09361
jardy na metry - 0.9144
centymetry na cale - 0.393701
cale na centymetry - 2.54
kilometry na mile - 0.621371
mile na kilometry - 1.60934