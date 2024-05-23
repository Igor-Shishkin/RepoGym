package sda.advancedJava.dayFifth.exceptionExamples;
//własny wyjątek - błąd połączenia z bazą dannych
public class DatabaseConnectException extends Exception {
    public DatabaseConnectException(String message) {
        super(message);
    }
}
