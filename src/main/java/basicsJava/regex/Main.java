package basicsJava.regex;

public class Main {
    public static void main(String[] args) {

        String[] arrayPassword = new String[] {
                "AlamaM@Kota1",
                "A_amaMaKota_",
                "alamamakota1",
                "Ala+aM  Kota1",
                "AlamaMaKota1",
                "AlamaM23Kota1",
                "AlamaMaKota1",
                "AlamaMaKota1",
                "Al_ta1",
                "AlamaMaKota1acsac(dsc^mnjnkj",
                "AlamaMaKota1"

        };
        long regentStart = System.currentTimeMillis();
        for (String element : arrayPassword) {
            System.out.printf("Hasło %s isValid: %b\n", element, RegexPasswordValidate.isValid(element));
        }
        long regentStop = System.currentTimeMillis();
        System.out.println("Czas wykonywania 'Regent' is " + (regentStop-regentStart));

        long javatStart = System.currentTimeMillis();
        for (String element : arrayPassword) {
            System.out.printf("Hasło %s isValid: %b\n", element, JavaPasswordValidate.isValid(element));
        }
        long javaStop = System.currentTimeMillis();
        System.out.println("Czas wykonywania 'Regent' is " + (javaStop-javaStop));

    }
}
