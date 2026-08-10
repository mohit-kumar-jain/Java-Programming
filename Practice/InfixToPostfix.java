import java.util.*;

class InfixToPostfix
{
    static int precedence(char ch) {
        if(ch == '+' || ch == '-') {
            return 1;
        }    else if(ch == '*' || ch == '/'){
            return 2;
        } else if(ch == '^') return 3;
        
        return 0;
    }
    
	public static void main (String[] args)
	{
	    Deque<Character> stack = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            String s = sc.next();
            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if(Character.isLetter(ch)){
                    ans.append(ch);
                } else if(ch == '(') {
                    stack.push(ch);
                } else if(ch == ')') {
                    while(!stack.isEmpty() && stack.peek() != '(') {
                        ans.append(stack.pop());
                    }
                    stack.pop();
                }else {
                    while(!stack.isEmpty() && stack.peek() != '(' && precedence(stack.peek()) >= precedence(ch)){
                        ans.append(stack.pop());
                    }
                    stack.push(ch);
                }
                
            } 
            while(!stack.isEmpty()){
                ans.append(stack.pop());
            }
            System.out.println(ans);
        }
	}
}
