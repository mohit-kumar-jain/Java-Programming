import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        // Add elements
        names.add("Mohit");
        names.add("Rahul");
        names.add("Amit");
        names.add("Raj");

        System.out.println("ArrayList: " + names);

        // Access element
        System.out.println("First element: " + names.get(0));

        // Change element
        names.set(1, "Rohan");

        System.out.println("After updating: " + names);

        // Remove element
        names.remove(2);

        System.out.println("After removing: " + names);

        // Size
        System.out.println("Size: " + names.size());

        // Check element
        System.out.println("Contains Raj: " + names.contains("Raj"));

        // Iterate
        System.out.println("Elements:");

        for (String name : names) {
            System.out.println(name);
        }
    }
}