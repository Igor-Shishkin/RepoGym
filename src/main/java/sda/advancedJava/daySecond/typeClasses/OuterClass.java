package sda.advancedJava.daySecond.typeClasses;

public class OuterClass {
    private  static int outerClassStaticField;
    private int outerClassField;
    static void setOuterClassStaticField() {
        System.out.println("I'm in 'OuterClass' - static method");
    }
    void setOuterClassField() {
        System.out.println("I'm in 'OuterClass' - simple method");
    }
//    public class Outer {

        static class NestedStatic {
            String name;
            void useOutClassField() {
                System.out.println(outerClassStaticField);
//                System.out.println(outerClassField);
                setOuterClassStaticField();

            }
        }


        class Inner {
            String name;
            void useOutClassField() {
                System.out.println(outerClassStaticField);
                System.out.println(outerClassField);
                setOuterClassStaticField();
                setOuterClassField();

            }
        }
    }
//}
