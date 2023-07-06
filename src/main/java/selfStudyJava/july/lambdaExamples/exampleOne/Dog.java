package selfStudyJava.july.lambdaExamples.exampleOne;

public class Dog implements WithNameAndAge {
private String name;
private int age;

@Override
public void setName(String name) {
        this.name = name;
        }

@Override
public void setAge(int age) {
        this.age = age;
        }

@Override
public String toString() {
        return "Cat{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
        }
}
