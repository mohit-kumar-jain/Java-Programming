class Student {

    int rollNo;
    String name;

    public void display() {
        System.out.println("Student details");
    }
}

public class ReflectionClassExample {

    public static void main(String[] args) throws Exception {

        Class<?> cls = Class.forName("Student");

        System.out.println("Class Name: " + cls.getName());
        System.out.println("Simple Name: " + cls.getSimpleName());
        System.out.println("Package Name: " + cls.getPackageName());
        System.out.println("Superclass: " + cls.getSuperclass().getName());
    }
}