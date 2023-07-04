package selfStudyJava.codeWars.kyu5;

/*
The rgb function is incomplete. Complete it so that passing in RGB decimal values will result in a hexadecimal
representation being returned. Valid decimal values for RGB are 0 - 255. Any values that fall out of that range must
be rounded to the closest valid value.

Note: Your answer should always be 6 characters long, the shorthand with 3 will not work here.

The following are examples of expected output values:

RgbToHex.rgb(255, 255, 255) // returns FFFFFF
RgbToHex.rgb(255, 255, 300) // returns FFFFFF
RgbToHex.rgb(0, 0, 0)       // returns 000000
RgbToHex.rgb(148, 0, 211)   // returns 9400D3
 */

public class RGBToHexConversion {
    public static void main(String[] args) {
        int r = -20;
        int g = 0;
        int b = 333;

        String txtR;
        String txtG;
        String txtB;
        if (r<=0) {
            txtR = "00";
        } else if (r>255) {
            txtR = "FF";
        } else {
            txtR = String.format("%2s",Integer.toHexString(r));
        }
        if (g<=0) {
            txtG = "00";
        } else if (g>255) {
            txtG = "FF";
        } else {
            txtG = String.format("%2s",Integer.toHexString(g));
        }
        if (b<=0) {
            txtB = "00";
        } else if (b>255) {
            txtB = "FF";
        } else {
            txtB = String.format("%2s",Integer.toHexString(b));
        }
        String txt = "".concat(txtR).concat(txtG).concat(txtB).replaceAll(" ","0").toUpperCase();

        System.out.println(txt);;

    }
}