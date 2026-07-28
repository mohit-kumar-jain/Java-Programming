import java.util.*;

public class  StringSort{
    public static void main(String[] args) {
        String[] fruits = {"Orange", "Apple", "Mango", "Banana", "Grape"};
        System.out.println("Original array: " + Arrays.toString(fruits));
        Arrays.sort(fruits);
        System.out.println("Sorted array:   " + Arrays.toString(fruits));
    }
}
