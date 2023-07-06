package selfStudyJava.july.lambdaExamples.exampleOne;

public interface Settable <C extends WithNameAndAge> {
    void set (C entity, String name, int age);
}
