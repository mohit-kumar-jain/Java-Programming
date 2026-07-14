public class MethodOverloading {
    static int add(int a, int b){
        return a+b;
    }

    static int add(int a, int b,int c){
        return a+b+c;
    }

    static int add(int a, int b,int c,int d){
        return a+b+c+d;
    }

    public static void main(String[] args){
        System.out.println(add(5,7));
        System.out.println(add(5,7,8));
        System.out.println(add(5,7,9,10));
    }
}
