package sda.basicsJava.regex;

public class JavaPasswordValidate {
    public static boolean isValid(String password) {
        int counterUpperLetterCase = 0;
        int counterLowerLetterCase = 0;
        int counterSymbol = 0;
        int counterDigit = 0;
        if (password.length() >= 8 && password.length() <= 20) {
            for (int i = 0; i < password.length(); i++) {
                char charLetter = password.charAt(i);
                if (Character.isDigit(charLetter)) {
                    counterDigit++;
                }
                if (Character.isUpperCase(charLetter)) {
                    counterUpperLetterCase++;
                }
                if ((charLetter >= 33 && charLetter <= 47) || (charLetter >= 91 && charLetter <= 96)
                        || (charLetter >= 58 && charLetter <= 64) || (charLetter >= 123 && charLetter <= 126)) {
                    counterSymbol++;
                }
                if (Character.isLowerCase(charLetter)) {
                    counterLowerLetterCase++;
                }
            }
            return counterDigit > 0 && counterSymbol > 0 &&
                    counterLowerLetterCase > 0 && counterUpperLetterCase > 0;
        } else {
            return false;
        }
    }
}
