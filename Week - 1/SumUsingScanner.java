import java.util.Scanner;

public class SumUsingScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter the value of num1 : ");
        int num1 = input.nextInt();
        System.out.print("Enter the value of num2 : ");
        int num2 = input.nextInt();
        input.close();
        int sum = num1+num2;
        System.out.println("The Sum of " +num1 +" + "+num2+" = "+sum);
    }
}