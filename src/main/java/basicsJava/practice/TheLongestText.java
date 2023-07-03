package basicsJava.practice;

/*
Napisz program, który będzie od użytkownika pobierał kolejne teksty (zmienne typu String) tak długo, aż użytkownik poda
tekst „Starczy”, a następnie wypisze najdłuższy z podanych tekstów (nie biorąc pod uwagę tekstu „Starczy”). Jeśli
użytkownik nie poda żadnego tekstu, to wypisz „Nie podano żadnego tekstu”.
 */
import java.util.Scanner;

public class TheLongestText {
    public static void main(String[] args) {
        Scanner keyBoardScanner = new Scanner(System.in);
        String textIn = "";
        int length = 0;
        boolean end = false;

        do {
            length = (length < textIn.length()) ? textIn.length() : length;
            System.out.print("Enter some text: ");
            textIn = keyBoardScanner.nextLine();
        } while (!textIn.equalsIgnoreCase("Starczy"));

        if (length > 0) {
            System.out.printf("The longest text has %d symbols", length);
        } else {
            System.out.println("You enter nothing.");
        }
    }
}