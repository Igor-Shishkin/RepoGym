package advancedJava.daySecond.typeClasses.anonimousClass;

import advancedJava.daySecond.inheritance.Animal;

public class Main {
    public static void main(String[] args) {
        Animal elephant = new Animal("George") {
            @Override
            public String getSound() {
                return "Turrruuu";
            }

            @Override
            public String toString() {
                return getName() + "\t" + getSound();
            }
        };
        System.out.println(elephant);
    }
}