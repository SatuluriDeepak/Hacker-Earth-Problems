import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ValidParathensis {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Stack<Character> stack=new Stack<Character>();
        int c=0;
        for(int i=0;i<s.length();i++) {
        	char ch=s.charAt(i);
        	
        	if(ch=='(') {
        		stack.push(ch);
        	}
        	else {
        		if(stack.empty() && ch==')') {
        			c++;
        			
        		}
        		else if(ch==')' && stack.peek()=='(') {
    				stack.pop();
    			}
    			else c++;
        	}
        }
        if(!stack.empty()) {
        	System.out.println(c+stack.size());
        }
        else System.out.println(c);
	}

}
