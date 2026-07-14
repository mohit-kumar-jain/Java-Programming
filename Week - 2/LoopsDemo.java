public class LoopsDemo {
    public static void main(String[] args) {
        System.out.println("Using For Loop.");
        int n = 5;
        for (int i = 0; i < n; i++) {
            System.out.println("i = "+i);
        }
        System.out.println();
        System.out.println("Using While Loop.");
        while(n > 0) {
            System.out.println("n = "+n);
            n -= 1;
        }
        System.out.println();
        n = 5;
        System.out.println("Using Do - While Loop.");
        do {
            System.out.println("n = "+n);
            n--;
        } while (n > 0);
        System.out.println();
        System.out.println("Using For - Each Loop.");
        int [] arr = {10,15,6,1,0};
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
