package selfStudyJava.codeWars.kyu6;
/*
Complete the method/function so that it converts dash/underscore delimited words into camel casing.
The first word within the output should be capitalized only if the original word was capitalized
(known as Upper Camel Case, also often referred to as Pascal case). The next words should be always capitalized.

Examples
"the-stealth-warrior" gets converted to "theStealthWarrior"

"The_Stealth_Warrior" gets converted to "TheStealthWarrior"

"The_Stealth-Warrior" gets converted to "TheStealthWarrior"
 */

public class ConvertStringToCamelCase6kyu {
    public static void main(String[] args) {
        String s = "The_stealth-warrior";
        StringBuilder sb = new StringBuilder(s);
        int length = s.length();
        for (int i = 0; i < length; i++) {
            if (sb.charAt(i) == '-' || sb.charAt(i) == '_') {
                sb.setCharAt(i+1,Character.toUpperCase(sb.charAt(i+1)));
                sb.deleteCharAt(i);
                length--;
            }
        }

        System.out.println(sb.toString());
    }
}