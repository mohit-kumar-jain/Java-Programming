import java.util.Scanner;
class Arr {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of 1D array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("1D Array:");

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        System.out.println();

        int a[][] = new int[2][2];

        System.out.println("Enter 2D Array elements:");

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                a[i][j] = sc.nextInt();

        System.out.println("2D Array:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
        sc.close();
    }
}
