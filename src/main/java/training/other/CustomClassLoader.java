package training.other;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class CustomClassLoader extends ClassLoader {


    private final String path;

    public CustomClassLoader(String path) {
        this.path = path;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] data = loadClassData(name);
        return defineClass(name, data, 0, data.length);
    }

    private byte[] loadClassData(String name) {
        String fileName = path + File.separatorChar + name.replace('.', File.separatorChar) + ".class";
        try (FileInputStream fis = new FileInputStream(fileName);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            int ch;
            while ((ch = fis.read()) != -1) {
                baos.write(ch);
            }
            return baos.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) throws Exception {

        try {
            String path = "D:\\IdeaProjects\\RepoGym\\src\\main\\java";
            CustomClassLoader customClassLoader = new CustomClassLoader(path);

            // Full qualified name of the class
            String className = "training.other.ClassForLoading";
            Class<?> clazz = customClassLoader.loadClass(className);
            Object obj = clazz.getDeclaredConstructor().newInstance();
            clazz.getMethod("printMessage").invoke(obj);

        } catch (Exception e) {
            e.printStackTrace();
        }

//        CustomClassLoader customClassLoader =
//                new CustomClassLoader("D:\\IdeaProjects\\RepoGym\\src\\main\\java\\training\\other");
//
//        Class<?> clazz = customClassLoader.loadClass("ClassForLoading");
//        Object obj = clazz.newInstance();
//        System.out.println(obj.getClass().getClassLoader());
    }
}
