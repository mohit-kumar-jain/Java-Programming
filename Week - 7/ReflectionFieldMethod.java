import java.lang.reflect.*;

class Student {

    private String name = "Mohit";
    public int age = 20;

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ReflectionFieldMethod {

    public static void main(String[] args) throws Exception {

        Class<?> cls = Student.class;

        // Display fields
        System.out.println("Fields:");

        Field[] fields = cls.getDeclaredFields();

        for (Field field : fields) {
            System.out.println(field.getName());
        }

        // Display methods
        System.out.println("\nMethods:");

        Method[] methods = cls.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println(method.getName());
        }

        // Create object
        Student s = new Student();

        // Invoke display() method
        Method m = cls.getDeclaredMethod("display");

        System.out.println("\nInvoking display method:");

        m.invoke(s);
    }
}