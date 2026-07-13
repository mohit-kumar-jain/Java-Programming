public class SumOfTwo {
    public static void main(String[] args) {
        // byte a = 5,b = 6;
        // System.out.println(a+" + "+b+" = "+(a+b));
        if (args.length < 2) {
            System.out.println("Please Provide two inputs to proceed.");
        }
        int num = Integer.parseInt(args[1])+ Integer.parseInt(args[0]);
        System.out.println(num);
    }
}