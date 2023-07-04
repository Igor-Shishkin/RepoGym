package basicsJava.practice.patientData;

public class Pacjent {
    private String imie;
    private String nazwisko;
    private int wiek;
    private double temperatura;

    public Pacjent(String imie, String nazwisko, int wiek, double temperatura) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.temperatura = temperatura;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getTemperatura(char wybor) {
        switch (wybor) {
            case 'c':
                return this.temperatura;
            case 'f':
                return this.konwertujNaFahrenheita();
            default:
                return 0.0;
        }
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double konwertujNaFahrenheita() {
        return temperatura * 9 / 5 + 32;
    }
}