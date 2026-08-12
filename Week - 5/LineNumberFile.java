import java.io.*;
import java.util.*;

public class LineNumberFile {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String name = sc.nextLine();

        BufferedReader br = new BufferedReader(new FileReader(name));

        String line;
        int count = 1;

        while ((line = br.readLine()) != null) {
            System.out.println(count + ": " + line);
            count++;
        }

        br.close();
    }
}