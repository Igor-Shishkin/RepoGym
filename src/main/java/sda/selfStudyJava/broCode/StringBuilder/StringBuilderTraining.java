package sda.selfStudyJava.broCode.StringBuilder;

import java.util.Arrays;
public class StringBuilderTraining {
    public static void main(String[] args) {
        String str = "00Hello Bro!";
        String strTest = str.substring(2,7);
        System.out.println(strTest);
        int[] arrInt = new int[] {1,0,-10,43};

        StringBuilder sbOne = new StringBuilder();
        StringBuilder sbTwo = new StringBuilder("ABCD");
        sbOne.append(strTest);
        sbOne.append("; ");
        sbOne.append(2);
        sbOne.append("; ");
        sbOne.append(Arrays.toString(arrInt));
        sbOne.append("; ");
        sbOne.append(true);

        System.out.println(sbOne);

        sbOne.delete(0,sbOne.length());
        sbOne.append("In a hole in the ground there lived a hobbit.");

        System.out.println(sbOne);
        System.out.println("Substring method (3): "
                .concat(sbOne.substring(3)));
        System.out.println("Substring method (3, 10): "
                .concat(sbOne.substring(3, 10)));
        System.out.println("Replace method (3, 17, ABCD): "
                + (sbOne.replace(3, 17, "ABCD")));
        System.out.println("Reverse method: "
                + sbOne.reverse());
        sbOne.reverse();
        System.out.println("Delete method (3, 7): "
                + sbOne.delete (3, 7));
        System.out.println("DeleteCharAt() method (3): "
                + sbOne.deleteCharAt(3));
        System.out.println("Insert method (3, (ABCD)): "
                + sbOne.insert (3, "ABCD"));

        String number = "10";
        int a = Integer.parseInt(number);
    }
}
