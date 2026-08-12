import java.util.*;

public class StringTokenizerDemo {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter integers:");
        String input = sc.nextLine();

        StringTokenizer st = new StringTokenizer(input);

        int sum = 0;

        while (st.hasMoreTokens()) {
            int n = Integer.parseInt(st.nextToken());
            System.out.println(n);
            sum += n;
        }

        System.out.println("Sum = " + sum);
    }
}