import java.lang.reflect.*;

class Student {

    private int rollNo;
    private String name;

    public Student() {
        rollNo = 0;
        name = "Unknown";
    }

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}

public class ReflectionConstructor {

    public static void main(String[] args) throws Exception {

        Class<?> cls = Student.class;

        // Get all constructors
        Constructor<?>[] constructors = cls.getDeclaredConstructors();

        System.out.println("Constructors:");

        for (Constructor<?> constructor : constructors) {

            System.out.println(constructor);

            System.out.println("Parameters:");

            Parameter[] parameters = constructor.getParameters();

            for (Parameter parameter : parameters) {
                System.out.println(
                    parameter.getType().getSimpleName()
                    + " " + parameter.getName()
                );
            }

            System.out.println();
        }

        // Get parameterized constructor
        Constructor<?> constructor =
            cls.getConstructor(int.class, String.class);

        // Invoke constructor
        Student s =
            (Student) constructor.newInstance(101, "Mohit");

        System.out.println("Object created using Reflection:");

        s.display();
    }
}