import java.util.*;

public class ListDemo {

    public static void main(String[] args) {

        // ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Mohit");
        arrayList.add("Rahul");
        arrayList.add("Amit");

        System.out.println("ArrayList:");
        System.out.println(arrayList);

        arrayList.add("Raj");k
        System.out.println("After adding Raj: " + arrayList);

        arrayList.remove("Rahul");
        System.out.println("After removing Rahul: " + arrayList);

        System.out.println("First element: " + arrayList.get(0));


        // LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Mango");

        System.out.println("\nLinkedList:");
        System.out.println(linkedList);

        linkedList.addFirst("Orange");
        linkedList.addLast("Grapes");

        System.out.println("After adding elements: " + linkedList);

        linkedList.remove("Banana");

        System.out.println("After removing Banana: " + linkedList);
    }
}