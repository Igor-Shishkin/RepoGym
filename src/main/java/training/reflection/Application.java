package training.reflection;

import java.io.File;
import java.lang.reflect.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class Application {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException, MalformedURLException {

        Class annoClass = TestPack.class;
        Method[] declaredMethods1 = annoClass.getDeclaredMethods();
        for (Method method : declaredMethods1) {
            if (method.isAnnotationPresent(MyAnno.class)) {
                method.invoke(null);
                System.out.println("Priority: " + method.getAnnotation(MyAnno.class).priority());
            }
        }

        System.out.println("\n**************\n");

        ClassLoader classLoader = new URLClassLoader(new URL[] {
                new File(".").toURL()
        });
        Class humanClass = classLoader.loadClass("Human");
        Constructor humanClassConstructor = humanClass.getConstructor();
        Object human = humanClassConstructor.newInstance();
        Method greetingsMethod = humanClass.getMethod("greetings", String.class);
        greetingsMethod.invoke(human, "James");

        System.out.println("\n**************\n");


        Class cl = Cat.class;

        Cat cat = new Cat();
        cat.info();

        Field nameField = cl.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(cat, "Unknown");
        cat.info();


        Method[] declaredMethods = cl.getDeclaredMethods();

        for (Method m : declaredMethods) {
            System.out.println(m);
        }

        Method sumMethod = cl.getDeclaredMethod("sum", int.class, int.class, int.class);
        Method info = cl.getDeclaredMethod("info");
        info.invoke(cat);


        Constructor constructor = cl.getConstructor();


//        Field[] fields = cl.getFields();

//        for (Field field : fields) {
//            System.out.println(field);
//        }
//
//        System.out.println();
//
//        Field field = cl.getField("age");
//        int modifiers = field.getModifiers();
//        System.out.println(Modifier.isPublic(modifiers));
//        System.out.println(Modifier.isStatic(modifiers));





//        Field[] declaredFields = cl.getDeclaredFields();
//
//        for (Field field : declaredFields) {
//            System.out.println(field);
//        }


        //        Class<?> aClass = Class.forName("training.reflection.Cat");

//        Class cl1 = String.class;
//        Class cl2 = "Java".getClass();
//        Class cl3 = Class.forName("java.lang.String");
//
//        Class cl4 = int.class;
//        Class cl5 = int[].class;
//        Class cl6 = int[][].class;
//        Class cl7 = void.class;

    }
}
