package advancedJava.dayFifth.userExample;

import advancedJava.dayFifth.exceptionExamples.DatabaseConnectException;
import advancedJava.dayFifth.exceptionExamples.FileAccessException;
import advancedJava.dayFifth.exceptionExamples.ValidationException;

public class Main {
    public static void main(String[] args) {
        DataProcessor processor = new DataProcessor();
        try {
            processor.process(null);
            processor.process(DataProcessor.FILE_ACCESS_EXCEPTION);
            //processor.process("Dane do przetworzenia");

        } catch (ValidationException e) {
            //obsługa błędu walidacji dannych
            System.out.println("Błąd validacji dannych: " + e.getMessage());
        } catch (FileAccessException e) {
            System.out.println("Błąd dostępu do pliku: " + e.getMessage());
        } catch (DatabaseConnectException e) {
            System.out.println("Błąd połączenia z bazą dannych: " + e.getMessage());
        }
    }
}
