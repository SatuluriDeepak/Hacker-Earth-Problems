import java.util.Scanner;
import java.util.Stack;

public class StackAndQueues {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String [] s1=sc.nextLine().split(" ");
        int n = Integer.parseInt(s1[0]);
        int k = Integer.parseInt(s1[1]);
        
        String [] s=sc.nextLine().split(" ");
        Stack<Integer> st = new Stack<Integer>();
        
        for(int i=n-1;i>=0;i--) {
        	st.push(Integer.parseInt(s[i]));
        }
        int j=0;
        int sum=st.pop();
        k--;
        while(!st.empty() && st.peek()>st.get(j)) {
        	sum+=st.pop();
        		j++;
        		k--;
        }
        for(int i=0;i<k;i++) {
        	sum+=st.get(i);
        }
       System.out.println(sum);
        
	}

}
