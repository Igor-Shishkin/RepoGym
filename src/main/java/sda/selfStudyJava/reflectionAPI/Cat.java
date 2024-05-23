package sda.selfStudyJava.reflectionAPI;

public class Cat extends Animal{
    private static final String ANIMAL_FAMILY = "Feline";


    public Cat(String name, int age) {
        super(name, age);
    }

    public void sayMeow() {

        System.out.println("Meow!");
    }

    public void jump() {

        System.out.println("Jump!");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}';
    }

}
