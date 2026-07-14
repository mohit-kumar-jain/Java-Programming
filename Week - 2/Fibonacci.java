import java.util.Scanner;

class Fibonacci {
    static int getFibonacci(int n){
        if(n <= 1){
            return n;
        }
        return getFibonacci(n-1) + getFibonacci(n-2);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        //Using Iteration. 

        // int a=0,b=1,c;
        // System.out.print(a+" "+b+" ");
        // for(int i=3;i<=n;i++){
        //     c=a+b;
        //     System.out.print(c+" ");
        //     a=b;
        //     b=c;
        // }
        
        
        //Using Recursion. 
        for(int i = 0; i < n; i++)
            System.out.print(getFibonacci(i)+" ") ;
        System.out.println();
    }
}
