package basicsJava.practice;



import java.util.Scanner;
public class Waves {
    public static void main(String[] args) {
        Scanner keyBoardScanner = new Scanner(System.in);
        System.out.print("Enter quantity waves: ");
        byte quantity = keyBoardScanner.nextByte();
        Waves main = new Waves();

        String firstLine = "*      *";
        String secondLine = " *    * ";
        String thirdLine = "  *  *  ";
        String forthLine = "   **   ";

        main.printLine(firstLine, quantity);
        main.printLine(secondLine, quantity);
        main.printLine(thirdLine, quantity);
        main.printLine(forthLine, quantity);

        main.printUnder(quantity);
    }

    void printLine (String linePattern, byte quantity) {
        for (int i = 0; i < quantity; i++) {
            System.out.print(linePattern);
        }
        System.out.println("");
    }

    void printUnder (byte quatity){
        for (int i = 0; i < quatity; i++) {
            System.out.println("*      *\n *    * \n  *  *  \n   **   ");
        }
    }
}