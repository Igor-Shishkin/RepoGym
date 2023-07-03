package selfStudyJava.May.personData;

import java.util.Scanner;
import java.util.regex.Pattern;

public class App {
    private static final Scanner keyBoardScanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("In this app you can enter personal data, save it and view it. "
                .concat("You can register 10 users max."));
        byte action = 1;
        boolean further = true;
        byte i = 0;
        Person[] person = new Person[10];

        do {
            switch (action) {
                case 0 :
                    further = false;
                    System.out.println("Good day");
                    break;
                case 1 :
                    System.out.println("Please, enter the following data:");
                    person[i] = addPerson();
                    i++;
                    action = choose();
                    break;
                case 2 :
                    System.out.printf("There are %d persons in your list.\n", i);
                    view(person, i);
                    action = choose();
                    break;
                case 3 :
                    person = deletePerson(person, i);
                    i--;
                    action = choose();
                    break;
                default:
                    System.err.println("Wrong number. Try once more time.");
                    action = choose();

            }

        } while (further);
    }

    static void view (Person[] person, byte length) {
        for (int i = 0; i < length; i++) {
            System.out.printf("Person %d\n", (i+1));
            System.out.println(person[i]);
        }
    }


    static Person addPerson () {

        Person person = new Person();

        person.setName(setNamePerson());
        person.setSurName(setSurnamePerson());
        person.setSex(setSexPerson());
        person.setAge(setAgePerson());
        person.setPesel(setPeselPerson(person.getSex()));

        return person;
    }

    static String setNamePerson() {
        String name = "[A-Z][a-z]+";
        Pattern nameCheck = Pattern.compile(name);
        String nameOfPerson;

        boolean right = false;
        do {
            System.out.print("Name: ");
            nameOfPerson = keyBoardScanner.nextLine().trim();
            if (nameCheck.matcher(nameOfPerson).matches()) {
                right = true;
            } else {
                System.err.println("Wrong format! Try once more time.");
            }
        } while (!right);
        return nameOfPerson;
    }


    static String setSurnamePerson() {

        String surName = "[A-Z][a-z]+";
        Pattern surNameCheck = Pattern.compile(surName);
        String surnameOfPerson;

        boolean right = false;
        do {
            System.out.print("Surname: ");
            surnameOfPerson = keyBoardScanner.nextLine().trim();
            if (surNameCheck.matcher(surnameOfPerson).matches()) {
                right = true;
            } else {
                System.err.println("Wrong format! Try once more time.");
            }
        } while (!right);
        return surnameOfPerson;
    }


    static char setSexPerson() {
        String sex = "[mMfFkK]";
        Pattern sexCheck = Pattern.compile(sex);
        boolean right = false;
        String sexPerson;
        do {
            System.out.print("Sex: ");
            sexPerson = keyBoardScanner.nextLine().trim();
            if (sexCheck.matcher(sexPerson).matches()) {
                right = true;
            } else {
                System.err.println("Wrong format! Try once more time.");
            }
        } while (!right);
        return sexPerson.charAt(0);
    }

    static byte setAgePerson () {
        System.out.print("Age: ");
        boolean right = false;
        byte age = -1;

        while (!right) {
            if (keyBoardScanner.hasNextByte()) {
                age = keyBoardScanner.nextByte();
                keyBoardScanner.nextLine();
                right = true;
            } else {
                System.err.println("Wrong format! Try once more time.");
                keyBoardScanner.nextLine();
            }
        }
        return age;
    }

    static String setPeselPerson(char sex) {
        String pesel = "([14567890]\\d|2[0123])(0\\d|1[12])([012]\\d|3[01])\\d{5}";
        Pattern peselCheck = Pattern.compile(pesel);
        String peselPerson;

        String sexMale = "\\d{9}[13579]\\d";
        Pattern ninthDigitPeselCheck = Pattern.compile(sexMale);

        boolean right = false;
        do {
            System.out.print("Pesel: ");
            peselPerson = keyBoardScanner.nextLine().trim();
            if (peselCheck.matcher(peselPerson).matches()) {
                if ( ( (sex == 'm' || sex == 'M' ) && ninthDigitPeselCheck.matcher(peselPerson).matches())
                        || (( sex == 'f' || sex == 'F' || sex == 'k' || sex == 'K' )
                        &&  !ninthDigitPeselCheck.matcher(peselPerson).matches() )) {
                    right = true;
                } else {
                    System.err.println("Wrong format - it's not according with sex! Try once more time.");
                }
            } else {
                System.err.println("Wrong format! Try once more time.");
            }
        } while (!right);
        return peselPerson;
    }


    static byte choose () {
        System.out.println("Please choose, what you want now:\nenter '1' - register one more Person"
                .concat("\nenter '2' - view the list of written persons ")
                .concat("\nenter '3' - delete one of the persons ")
                .concat("\nenter '0' - exit the program "));
        boolean check = false;
        byte answer = 100;
        while (!check) {
            if (keyBoardScanner.hasNextByte()) {
                answer = keyBoardScanner.nextByte();
                check = true;
            } else {
                System.err.println("Wrong value! Try once more time.");
                keyBoardScanner.nextLine();
            }
        }
        keyBoardScanner.nextLine();

        return answer;

    }

    static Person[] deletePerson (Person[] person, byte i) {
        System.out.println("It's the list of persons:");
        for (int j = 0; j < i; j++) {
            System.out.printf("%d. %s %s\n", j+1, person[j].getName(), person[j].getSurName());
        }
        System.out.print("Which person's data do you want to delete. Enter person's number:");
        for (int j = keyBoardScanner.nextInt() - 1; j < i-1; j++) {
            person[j] = person[j+1];
        }
        return person;
    }
}
