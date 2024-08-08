package training.reflection;

public class Cat {
    private String name;
    String color;
    public int age;

    public Cat() {
        this.age = 3;
        this.color = "red";
        this.name = "John";
    }

    public void publicMethod() {
        System.out.println("Public");
    }
    private void privateMethod() {
        System.out.println("Private");
    }

    public void info() {
        System.out.println(name + ", " + age + ", " + color);
    }

    public int sum (int a, int b) {
        return a + b;
    }
    public int sum (int a, int b, int c) {
        return a + b + c;
    }
}
