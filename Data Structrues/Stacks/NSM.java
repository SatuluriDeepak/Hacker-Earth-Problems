import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class NSM {
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String [] s=br.readLine().split(" ");
       
        long []res=new long[n];
        
        
        Stack<Integer> st=new Stack<Integer>();
        for(int i=n-1;i>=0;i--) {
        	while(!st.empty() && Integer.parseInt(s[st.peek()])>Integer.parseInt(s[i])) {
        		res[st.peek()]=Integer.parseInt(s[i]);
        		st.pop();
        	}
        	st.push(i);
        }
        while(!st.empty()) {
        	res[st.peek()]=-1;
        	st.pop();
        }
        
        for(int i=0;i<n;i++) {
        	System.out.print(res[i]+" ");
        }
        
        
	}

}
