public class gcd{
    static int GCD(int a, int b) {
        if(b == 0) return a;
        return GCD(b, a % b);
    }
    public static void main(String[] args) {
        int a = 48,b = 18;
        System.out.println(GCD(a,b));
    }
}