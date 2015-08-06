import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Twenty {
	public static void main(String[] args) {
		System.out.println(isValid("(){}[]"));
	}
	
    public static boolean isValid(String s) {
    	Stack<Character> s1 = new Stack<Character>();
    	char[] charArray = s.toCharArray();
    	for (char c: charArray){
    		if (c == '(' || c == '{' || c == '[' )
    			s1.push(c);
    		else if(c == ')')
				if(!s1.isEmpty() && s1.peek() == '(')
					s1.pop();
				else
					return false;
    		else if(c == '}')
				if(!s1.isEmpty() && s1.peek() == '{')
					s1.pop();
				else
					return false;
    		else if(c == ']')
				if(!s1.isEmpty() && s1.peek() == '[')
					s1.pop();
				else
					return false;
    	}
    	return (s1.isEmpty());
    }
}
