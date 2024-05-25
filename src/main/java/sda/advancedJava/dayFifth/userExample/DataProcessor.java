package sda.advancedJava.dayFifth.userExample;

import sda.advancedJava.dayFifth.exceptionExamples.DatabaseConnectException;
import sda.advancedJava.dayFifth.exceptionExamples.FileAccessException;
import sda.advancedJava.dayFifth.exceptionExamples.ValidationException;
import sda.advancedJava.dayFifth.exceptionExamples.DatabaseConnectException;

public class DataProcessor {
    public static final String FILE_ACCESS_EXCEPTION = "Błąd dostępu";
    public void process(String data) throws ValidationException
            , FileAccessException, DatabaseConnectException {
        if (data == null || data.isEmpty()) {
            throw new ValidationException("Dane są niepoprawne");
        }
        //try {
            //otwarcie pliku
            fakeOpenFile(data);
            fakeDatabaceConnection(data);
        //} catch ()
    }
    private void fakeOpenFile(String data) throws  FileAccessException {
        //
        if (data.equalsIgnoreCase("Brak dostępu")) {
            throw new FileAccessException(FILE_ACCESS_EXCEPTION);
        }
    }
    private void fakeDatabaceConnection(String data) throws DatabaseConnectException {
        if (data.equalsIgnoreCase("Błąd przetwarzania"))
        System.out.println("przetwarz data");
        throw new DatabaseConnectException("Błąd przetwarzania");
    }
}
