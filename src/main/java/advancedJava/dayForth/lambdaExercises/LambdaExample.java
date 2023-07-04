package advancedJava.dayForth.lambdaExercises;
@FunctionalInterface
interface Executable {
    // void execute();
    int execute();
}
class Runner {
    public void run(Executable e) {
        System.out.println("Jestem w runner");
        e.execute();
    }
}
public class LambdaExample {
    public static void main(String[] args) {
        Runner runner = new Runner();
        /*runner.run(new Executable() {
            @Override
            public void execute() {
                System.out.println("Jestem w implementacji clasy anonimowej");
            }
        });*/
        runner.run(new Executable() {
            @Override
            public int execute() {
                System.out.println("Jestem w implementacji clasy anonimowej");
                return 75;
            }
        });
        System.out.println("###############################");

        runner.run(() -> 50);
    }
}
