package advancedJava.dayForth.lambdaExercises;

public class IncrementByValueLambda {
    public static void main(String[] args) {
        IncrementByValue increment = new IncrementByValue() {
            @Override
            public int incrementValue(int a) {
                return a*11;
            }
        };
        IncrementByValue incrL = (x) -> x*11;
        System.out.println(incrL.incrementValue(10));
    }
}
