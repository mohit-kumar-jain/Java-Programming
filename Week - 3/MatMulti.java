import java.util.Scanner;

class MatMulti {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        int[][] a = new int[rows][cols];
        int[][] b = new int[rows][cols];
        int[][] c = new int[rows][cols];

        System.out.println("Enter first matrix:");

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Enter second matrix:");

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                b[i][j] = sc.nextInt();

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                for (int k = 0; k < cols; k++)
                    c[i][j] += a[i][k] * b[k][j];

        System.out.println("Result:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++)
                System.out.print(c[i][j] + " ");
            System.out.println();
        }
        sc.close();
    }
}