import  java.lang.reflect.*;
class Student {

    public int rollNo;
    privateString name;

    public void display() {
        System.out.println("Student details");
    }
}

public class ReflectionClassExample {

    public static void main(String[] args) throws Exception {

        Class<?> cls = Class.forName("Student");
        int modifiers = cls.getModifiers();
        System.out.println("Class Name: " + cls.getName());
        System.out.println("Simple Name: " + cls.getSimpleName());
        System.out.println("Package Name: " + cls.getPackageName());
        System.out.println("Superclass: " + cls.getSuperclass().getName());
        System.out.println("Modifiers: " + Modifier.toString(modifiers));
    }
}