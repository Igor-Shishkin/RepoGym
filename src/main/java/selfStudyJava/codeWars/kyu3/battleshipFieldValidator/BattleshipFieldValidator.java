package selfStudyJava.codeWars.kyu3.battleshipFieldValidator;

import java.util.HashMap;
import java.util.Map;

public class BattleshipFieldValidator {
    public static void main(String[] args) {
        int[][] battleField = {
                {1, 0, 1, 0, 0, 1, 1, 0, 0, 0},
                {1, 0, 1, 0, 0, 0, 0, 0, 1, 0},
                {1, 0, 1, 0, 1, 1, 0, 0, 1, 0},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 1, 0, 0, 0, 0, 1}};

        System.out.println(fieldValidator(battleField));
    }


    public static boolean fieldValidator(int[][] field) {
        int quantity = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (field[i][j] == 1) {
                    quantity++;
                }
            }
        }
        if (quantity != 20) {
            return false;
        }

        Map<Integer, Integer> kindOfShips = new HashMap<>(20, 0.8f);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (field[i][j] == 1) {
                    field[i][j] = 2;

                    int length = 1;

                    boolean horizontal = false;
                    int startY = (i==0) ? i : i-1;
                    int startX = (j==0) ? j : j-1;
                    int endX = (j==9) ? j : j+1;
                    int endY = (i==9) ? i : i+1;

                    for (int k = j + 1; k < 10; k++) {
                        if (field[i][k] == 1) {
                            field[i][k] = 2;
                            length++;
                            endX = (k==9) ? k : k+1;
                            endY = (i==9) ? i : i+1;
                            horizontal = true;
                        } else {
                            break;
                        }
                    }
                    if (!horizontal) {
                        for (int k = i + 1; k < 10; k++) {
                            if (field[k][j] == 1) {
                                field[k][j] = 2;
                                length++;
                                endY = (k==9) ? k : k+1;
                                endX = (j==9) ? j : j+1;
                            } else {
                                break;
                            }
                        }
                    }
                    if (length>4) { return false; }

                    for (int k = startY; k <= endY; k++) {
                        for (int l = startX; l <= endX; l++) {
                            if (field[k][l] == 1) { return false; }
                        }
                    }

                    kindOfShips.compute(length, (k,v) -> (v==null) ? 1 : v+1);

                    j = endX;
                }
            }
        }

        if (kindOfShips.get(4) != 1) return false;
        if (kindOfShips.get(3) != 2) return false;
        if (kindOfShips.get(2) != 3) return false;
        if (kindOfShips.get(1) != 4) return false;


        if (kindOfShips.containsKey(5) && kindOfShips.get(5) != 4) return false;

        return true;
    }
}
