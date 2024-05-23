package sda.selfStudyJava.july.lambdaExamples.exampleOne;

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        Dog friendsDog = new Dog();

        System.out.println(myCat);
        System.out.println(friendsDog);

        Settable<Cat> setCat = (obj, name, age) -> {
            obj.setName(name);
            obj.setAge(age);
        };
        Settable<Dog> setDog = (obj, name, age) -> {
            obj.setName(name);
            obj.setAge(age);
        };

        changeEntity(myCat, setCat);
        setDog.set(friendsDog,"Bob", 10);

        System.out.println(myCat);
        System.out.println(friendsDog);
    }

    private static <T extends WithNameAndAge> void changeEntity (T entity, Settable <T> s) {
        s.set(entity, "Jack", 3);
    }
}
