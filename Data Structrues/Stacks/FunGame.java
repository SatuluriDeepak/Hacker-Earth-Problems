import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class FunGame {
	public static void main(String []args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String [] s=sc.nextLine().split(" ");
        Stack<Integer> b=new Stack<Integer>();
        Stack<Integer> a=new Stack<Integer>();
        ArrayList<Integer> ls=new ArrayList<Integer>();
        int j=n-1,i=0;
        
        for(int k=0;k<s.length;k++) {
        	b.push(Integer.parseInt(s[i]));
        	a.push(Integer.parseInt(s[j]));
        	i++;
        	j--;
        }
        StringBuilder sb=new StringBuilder();
       while(!(a.empty() || b.empty())) {
        	 if(a.peek()>b.peek()) {
        		b.pop();
				
        		sb.append(1);
        	}
        	else if(a.peek()<b.peek()) {
        		a.pop();
        		sb.append(2);
        	}
        	else {
        		sb.append(0);
        		a.pop();
        		b.pop();
        		
        	}
        	 sb.append(" ");
        }
        
        System.out.println(sb);  
        
	}

	


}
