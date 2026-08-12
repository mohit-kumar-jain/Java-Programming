import java.io.*;
import java.util.*;

public class FileCount {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String name = sc.nextLine();

        BufferedReader br = new BufferedReader(new FileReader(name));

        String line;
        int lines = 0, words = 0, chars = 0;

        while ((line = br.readLine()) != null) {
            lines++;
            chars += line.length();
            words += line.split("\\s+").length;
        }

        br.close();

        System.out.println("Lines: " + lines);
        System.out.println("Words: " + words);
        System.out.println("Characters: " + chars);
    }
}