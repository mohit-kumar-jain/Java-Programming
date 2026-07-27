import java.util.Scanner;
public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the coefficients for ax^2 + bx + c = 0");
        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        System.out.print("Enter c: ");
        double c = input.nextDouble();
        if (a == 0) {
            System.out.println("Invalid input: 'a' cannot be 0 in a quadratic equation.");
            input.close();
            return;
        }
        double d = (b * b) - (4 * a * c);
        System.out.printf("\nDiscriminant (D) = %.2f\n", d);
        if (d > 0) {
            System.out.println("Nature of Roots: Real and Distinct (Different)");

            double root1 = (-b + Math.sqrt(d)) / (2 * a);
            double root2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.printf("Root 1 = %.2f\n", root1);
            System.out.printf("Root 2 = %.2f\n", root2);
        } else if (d == 0) {
            System.out.println("Nature of Roots: Real and Equal");

            double root = -b / (2 * a);

            System.out.printf("Root 1 = Root 2 = %.2f\n", root);
        } else {
            System.out.println("Nature of Roots: Complex and Distinct (Imaginary)");

            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-d) / (2 * a);

            System.out.printf("Root 1 = %.2f + %.2fi\n", realPart, imaginaryPart);
            System.out.printf("Root 2 = %.2f - %.2fi\n", realPart, imaginaryPart);
        }

        input.close();
    }
}
