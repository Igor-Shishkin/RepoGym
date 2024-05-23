package sda.advancedJava.daySecond.serializable;

import java.io.*;

public class SerializableWriterReader {
    public static void main(String[] args) {
        Person pOne = new Person("Igor", 30, "M");
        Person pTwo = new Person("Karol", 1, "M");

        try (FileOutputStream fos = new FileOutputStream("myPerson.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos))
             {
                 oos.writeObject(pOne);
                 oos.writeObject(pTwo);

        } catch (FileNotFoundException e) {
            System.out.println("File isn't found");
        } catch (IOException e) {
            System.out.println("Error: initialization stream");
        }

        try (FileInputStream fis = new FileInputStream("myPerson.txt");
            ObjectInputStream ois = new ObjectInputStream(fis) ) {

            Object object1 = ois.readObject();
            Object object2 = ois.readObject();

            System.out.println(object1);
            System.out.println(object2);

        } catch (FileNotFoundException e) {
            System.out.println("File isn't found");
        } catch (IOException e) {
            System.out.println("Error: initialization stream");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
