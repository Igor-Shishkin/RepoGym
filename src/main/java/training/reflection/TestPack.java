package training.reflection;

public class TestPack {

    public static void m1() {
        System.out.println("m1");
    }

    @MyAnno(priority = 2, defInt = 7)
    public static void m2() {
        System.out.println("m2");
    }

    @MyAnno(priority = 10)
    public static void m3() {
        System.out.println("m3");
    }
}
