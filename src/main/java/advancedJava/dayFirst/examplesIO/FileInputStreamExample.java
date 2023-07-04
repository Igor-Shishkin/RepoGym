package advancedJava.dayFirst.examplesIO;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) throws IOException {
        //wersja z prezentacji - wymaga dodania pliku Hobbit.txt
//        FileInputStream in = new FileInputStream("Hobbit.txt");
//        FileOutputStream out = new FileOutputStream("user_output.txt");
//        int c;
//        while ((c = in.read()) != -1) {
//            out.write(c);
//        }
/*
        try {
            FileInputStream in = new FileInputStream("Hobbit.txt");
            FileOutputStream out = new FileOutputStream("user_output.txt");
            int c;
            while ((c = in.read()) != -1) {
                System.out.println("Pobrany znak: ".concat(Integer.toString(c))
                        .concat(",\tto: ").concat(Character.toString((char) c)));
                out.write(c);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: Hobbit.txt");
        } catch (IOException e) {
            //throw e;
            System.out.println("Problems with IO");
        } finally {

        }*/


        /*FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("Hobbit.txt");
            out = new FileOutputStream("user_output.txt");
            int c;
            while ((c = in.read()) != -1) {
                System.out.println("Pobrany znak: ".concat(Integer.toString(c))
                        .concat(",\tto: ").concat(Character.toString((char) c)));
                out.write(c);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: Hobbit.txt\t" + e);
            System.exit(3);
        } catch (IOException e) {
            //throw e;
            System.out.println("Problems with IO");
        } finally {
            System.out.println("I'm in 'finally' bloke");
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (in != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }*/

        //Domyślnie przeferowany sposób


        try (
                FileInputStream in = new FileInputStream("Hobbit.txt");
                FileOutputStream out = new FileOutputStream("user_output.txt");
        ) {
            int c;
            while ((c = in.read()) != -1) {
                System.out.println("Pobrany znak: ".concat(Integer.toString(c))
                        .concat(",\tto: ").concat(Character.toString((char) c)));
                out.write(c);
            }
            out.write(100);
        } catch (IOException e) {
            System.out.println("Error: ".concat(e.toString()));
        }

    }

}
