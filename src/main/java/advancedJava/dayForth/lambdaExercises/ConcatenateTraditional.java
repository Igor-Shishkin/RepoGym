package advancedJava.dayForth.lambdaExercises;

public class ConcatenateTraditional implements ConcatenateInterface{

    @Override
    public String concat(String a, String b) {
        return a.concat(" - ").concat(b);
    }

    public static void main(String[] args) {
        ConcatenateInterface concatenate = new ConcatenateTraditional();
        System.out.println(concatenate.concat("Wersja", "tradycyjna"));
    }
}
