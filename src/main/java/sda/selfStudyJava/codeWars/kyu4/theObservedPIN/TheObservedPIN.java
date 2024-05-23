package sda.selfStudyJava.codeWars.kyu4.theObservedPIN;

import java.util.*;

public class TheObservedPIN {

    private static Map<Character, String[]> POSSIBLE_NUMBERS = new HashMap<>();

    public static void main(String[] args) {
        String observedPassword = "369";
        System.out.printf("observed password: %s%noptions: [%s]%n",
                observedPassword, getPINs(observedPassword));
        String[] answer = new String[]{"236", "238", "239", "256", "258", "259", "266", "268", "269", "296", "298",
                "299", "336", "338", "339", "356", "358", "359", "366", "368", "369", "396", "398", "399", "636", "638",
                "639", "656", "658", "659", "666", "668", "669", "696", "698", "699"};
        System.out.println("answer: " + Arrays.toString(answer));
    }

    public static List<String> getPINs(String observed) {

        POSSIBLE_NUMBERS.put('1', new String[]{"1", "2", "4"});
        POSSIBLE_NUMBERS.put('2', new String[]{"2", "1", "3", "5"});
        POSSIBLE_NUMBERS.put('3', new String[]{"3", "2", "6"});
        POSSIBLE_NUMBERS.put('4', new String[]{"4", "5", "1", "7"});
        POSSIBLE_NUMBERS.put('5', new String[]{"5", "2", "4", "6", "8"});
        POSSIBLE_NUMBERS.put('6', new String[]{"6", "5", "3", "9"});
        POSSIBLE_NUMBERS.put('7', new String[]{"7", "8", "4"});
        POSSIBLE_NUMBERS.put('8', new String[]{"8", "5", "7", "0", "9"});
        POSSIBLE_NUMBERS.put('9', new String[]{"9", "8", "6"});
        POSSIBLE_NUMBERS.put('0', new String[]{"0", "8"});

        List<String> listOfPasswords = new ArrayList<>();
        String passwordOption = "";

        getPasswordOptionsToList(observed, listOfPasswords, passwordOption, 0);

        return listOfPasswords;
    } // getPINs
    static void getPasswordOptionsToList (String observed, List<String> listOfPasswords, String passwordOption, int index) {
        for (String number : POSSIBLE_NUMBERS.get(observed.charAt(index))) {
            String password = passwordOption.concat(number);
            if (index == observed.length()-1) {
                listOfPasswords.add(password);
            } else {
                getPasswordOptionsToList(observed, listOfPasswords, password, index+1);
            }
        }
    }
}
