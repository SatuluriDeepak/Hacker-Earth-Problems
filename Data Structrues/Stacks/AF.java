
import java.util.Scanner;
import java.util.Stack;
 
 
public class AF {
	public static void main(String...args) {
		
		Scanner sc=new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Stack<Integer> s1 = new Stack<Integer>();
				
		int n=sc.nextInt();
		
		
		for(int i=0;i<n;i++) {
			
			long k=sc.nextInt();
			int f=1;
			for(int j=2;j<k/2;j++) {
				if(k%j==0) {
					f=0;
					s1.push((int) k);
					break;
				}
			}
			if(f==1) {
				sb.append(k+" ");
			}
				
		}
		
		System.out.println(sb.toString());
		
		while(!s1.empty()) {
			System.out.print(s1.pop()+" ");
		}
		
		
	}
 
}