package sda.advancedJava.dayForth.lambdaExercises;

public class IncrementByValueTraditional implements IncrementByValue{
    @Override
    public int incrementValue(int a) {
        return a+33;
    }

    public static void main(String[] args) {
        IncrementByValue incrementTraditional = new IncrementByValueTraditional();
        System.out.println(incrementTraditional.incrementValue(22));
    }
}
