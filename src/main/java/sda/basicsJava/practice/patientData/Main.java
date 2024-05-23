package sda.basicsJava.practice.patientData;
/*
Napisz klasę o nazwie "Pacjent", która będzie przechowywała informacje o pacjencie, takie jak imię, nazwisko, wiek i
temperatura ciała w stopniach Celsjusza. Klasa powinna mieć metody do ustawiania i pobierania tych informacji.

Dodatkowo, w klasie Pacjent, dodaj metodę o nazwie "konwertujNaFahrenheita", która będzie przekształcała temperaturę z
stopni Celsjusza na stopnie Fahrenheita. Metoda powinna zwracać wynik przekształcenia.
 */
public class Main {
    public static void main(String[] args) {
        Pacjent pacjentOne = new Pacjent("Igor", "Shishkin", 29, 36.5f);
        Pacjent pacjentTwo = new Pacjent("Jan", "Paderewski", 100, 36.9f);

        System.out.println("Temperatura pacjentOne w farenheitach: " + pacjentOne.getTemperatura());
        System.out.println("Temperatura pacjentTwo w farenheitach: " + pacjentTwo.getTemperatura());

        System.out.println("Temperatura pacjentOne w farenheitach: " + pacjentOne.getTemperatura('f'));
        System.out.println("Temperatura pacjentTwo w farenheitach: " + pacjentTwo.getTemperatura('f'));



    }
}
