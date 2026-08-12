import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text:");
        String text = sc.nextLine();

        String[] words = text.toLowerCase().split("\\s+");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Frequency:");
        for (String word : map.keySet()) {
            System.out.println(word + " : " + map.get(word));
        }
    }
}