package sda.advancedJava.daySecond.inheritance;

public class Lion extends Animal {
    private int age;
    public Lion (String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    public String getSound() {
        return "Wrrrrrr";
    }
    public int getAge() {
        return this.age;
    }
}
