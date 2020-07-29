import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BalancedParanthesis {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        while(n-->0) {
        	String s=br.readLine();
        	Stack<Character> stack=new Stack<Character>();
        	int flag=1;
        	for(int i=0;i<s.length();i++) {
        		char ch=s.charAt(i);
        		if(ch=='{' || ch=='[' || ch=='(') {
        			stack.push(ch);
        		}
        		
        		else {
        			if (stack.empty()){
        				flag=0;
        				break;
        			}
        			else if(ch==')' && stack.peek()=='(') {
        				stack.pop();
        			}
        			else if(ch==']' && stack.peek()=='[') {
        				stack.pop();
        			}
        		
        			else if(ch=='}' && stack.peek()=='{') {
        					stack.pop();
        			}
        			else {
        				flag=0;
        				break;
        				
        			}
        		}
        	}
        	if(flag==1 && stack.empty()) 
        		System.out.println("YES");
        	else 
        		System.out.println("NO");
        }
	}

}
