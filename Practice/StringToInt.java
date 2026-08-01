import java.util.*;
public class StringToInt{
    public static int myAtoi(String s) {
        if (s == null || s.length() == 0) return 0;
        long num = 0;
        int n = s.length();
        int i = 0;
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        if (i == n) return 0;
        
        int sign = 1;
        if(s.charAt(i) == '-'){
            sign = -1;
            i++;
        }else if(s.charAt(i) == '+'){
            i++;
        }
        
        while(i < n && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');
            
            if(sign == 1 && num > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(sign == -1 && -num < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int)(sign * num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String x = sc.next();
            System.out.println(myAtoi(x));
        }
        sc.close();
    }
}