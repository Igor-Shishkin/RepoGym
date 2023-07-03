package myOwnProjects.ticTacToeGame;

import java.util.Random;
import java.util.Scanner;
public class TicTacToeGame {
    private static final Scanner in = new Scanner(System.in);
    private static final Random generate = new Random();
    public static void main(String[] args) {
        System.out.println("Let's PLAY!");

        char[][] board = new char[][] { {' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '} };
        boolean firstStep = generate.nextBoolean();
        char symbolPerson;
        char symbolComputer;
        String coordinates;

        if (firstStep) {
            System.out.println("You are first. Your symbol is 'x'.");
            symbolPerson = 'x';
            symbolComputer = 'o';

        } else {
            System.out.println("Computer goes first. Your symbol is 'o'.");
            symbolPerson = 'o';
            symbolComputer = 'x';
            board[generate.nextInt(3)][generate.nextInt(3)] = symbolComputer;

        }
        int counter = 0;
        char winChar;
        do {
            showBoard(board);
            boolean right = false;
            do {
                coordinates = step();
                int line = (coordinates.charAt(0)) - 48;
                int columne = coordinates.charAt(1) - 49;
                if (board[line][columne] == ' ') {
                    board[line][columne] = symbolPerson;
                    right = true;
                } else {
                    System.out.println("It field is busy. Try one more time.");
                    showBoard(board);
                }

            } while (!right);

            right = false;
            do {
                int randomLine = generate.nextInt(3);
                int randomColumne = generate.nextInt(3);

                if (board[randomLine][randomColumne] == ' ') {
                    board[randomLine][randomColumne] = symbolComputer;
                    right = true;
                }
            } while (!right);
            counter++;
            winChar = checkWhoWin(board);
            if (winChar == symbolComputer) {
                System.out.println("Computer WIN");
                break;
            } else if (winChar == symbolPerson) {
                System.out.println("You WIN");
                break;
            }
        } while (counter < 100);
        in.close();

    }
    static void showBoard (char [][] board) {
        System.out.println(" | 1 | 2 | 3 |");
        System.out.printf("a| %c | %c | %c |\n", board[0][0], board[0][1], board[0][2]);
        System.out.println(" | - | - | - |");
        System.out.printf("b| %c | %c | %c |\n", board[1][0], board[1][1], board[1][2]);
        System.out.println(" | - | - | - |");
        System.out.printf("c| %c | %c | %c |\n", board[2][0], board[2][1], board[2][2]);
        System.out.println(" | - | - | - |");
    }
    static String step () {
        String coordinates = "";
        boolean rightEnter = false;
        System.out.println("Your move! Enter the coordinates of the field without space. For example 'a1'\n");
        while (!rightEnter) {
            coordinates = in.nextLine();
            if ( (coordinates.charAt(0) == 'a' || coordinates.charAt(0) == 'b' || coordinates.charAt(0) == 'c')
                    && (coordinates.charAt(1) == '1' || coordinates.charAt(1) == '2' || coordinates.charAt(1) == '3') ){
                rightEnter = true;
            } else {
                System.err.println("Wrong format");
            }
        }
        coordinates = coordinates.replace('a', '0');
        coordinates = coordinates.replace('b', '1');
        coordinates = coordinates.replace('c', '2');
        return coordinates;
    }
    static char checkWhoWin (char[][] board) {
        char winChar = '0';
        if ((board[0][0] == board[1][1] && board[2][2] == board[1][1])
                ||(board[2][0] == board[1][1] && board[0][2] == board[1][1])){
            winChar = board[1][1];
        }
        for (int i = 0; i < board.length; i++) {
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                winChar = board[0][i];
            }
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                winChar = board[i][0];
            }
        }
        return winChar;
    }
}

