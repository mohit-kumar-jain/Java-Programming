import java.util.Scanner;
class Student {

    String name;
    int rollnum;

    Scanner input = new Scanner(System.in);
    void getData() {
        System.out.print("Enter the name : ");
        name = input.nextLine();
        System.out.print("Enter the roll number : ");
        rollnum = input.nextInt();
        System.err.println();
        input.close();
    }

    void displayDetails() {
        System.out.println("Name : " + name + ".\nRoll Number : " + rollnum + ".");
    }
}

public class NewClass{
    public static void main(String[] args) {
        Student s = new Student();
        s.getData();
        s.displayDetails ();
    }
}
