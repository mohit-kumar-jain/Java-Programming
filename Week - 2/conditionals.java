import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b;
        System.out.print("Enter the value of num1 : ");
        a = s.nextInt();
        System.out.print("Enter the value of num2 : ");
        b = s.nextInt();
        if (a > b) {
            System.out.println(a + " is greater than " + b);
        } else if (a == b) {
            System.out.println(a + " is equal to " + b);
        } else {
            System.out.println(a + " is smaller than " + b);
        }
        char op;
        System.out.print("Enter the Mathematical operator(+,-,*,/,%) : ");
        op = s.next().charAt((0));
        switch (op) {
            case '-':
                System.out.println(a+" - " +b+ " =  "+ (a-b));
                break;
            case '+':
                System.out.println(a+" + " +b+ " =  "+ (a+b));
                break;
            case '*':
                System.out.println(a+" * " +b+ " =  "+ (a*b));
                break;
            case '/':
                System.out.println(a+" / " +b+ " =  "+ (a/b));
                break;
            case '%':
                System.out.println(a+" % " +b+ " =  "+ (a%b));
                break;
            default:
                break;
        }
        s.close();
    }
}