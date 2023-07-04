package advancedJava.dayFifth.exceptionExamples;
//własny wyjątek - błąd dostępu do pliku
public class FileAccessException extends Exception{
    public FileAccessException(String message) {
        super(message);
    }
}
