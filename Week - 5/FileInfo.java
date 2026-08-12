import java.io.*;
import java.util.*;

public class FileInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String name = sc.nextLine();

        File file = new File(name);

        System.out.println("Exists: " + file.exists());
        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());

        if (file.isFile())
            System.out.println("Type: File");
        else if (file.isDirectory())
            System.out.println("Type: Directory");

        System.out.println("Size: " + file.length() + " bytes");
    }
}