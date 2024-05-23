package sda.advancedJava.dayForth.lambdaExercises;

public class ConcatenateLambda {
    public static void main(String[] args) {
        ConcatenateInterface anonymousClass = new ConcatenateInterface() {
            @Override
            public String concat(String a, String b) {
                return a + " | " + b;
            }
        };
        System.out.println(anonymousClass.concat("Wersja", "anonimowa"));

        ConcatenateInterface asLambda = (x, y) -> x + " | " + y;
        System.out.println(asLambda.concat("Wersja", "Lambda"));
    }
}
