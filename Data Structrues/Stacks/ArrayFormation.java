
import java.util.Scanner;
import java.util.Stack;
 
 
public class ArrayFormation {
	public static void main(String...args) {
		
		Scanner sc=new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Stack<String> s1 = new Stack<String>();
				
		int n=sc.nextInt();
		sc.nextLine();
		String [] arr = sc.nextLine().split(" ");
		
		for(int i=0;i<n;i++) {
			int k=Integer.parseInt(arr[i]);
			int f=1;
			for(int j=2;j<k/2;j++) {
				if(k%j==0) {
					f=0;
					s1.push(arr[i]);
					break;
				}
			}
			if(f==1) {
				sb.append(arr[i]+" ");
			}
				
		}
		
		System.out.println(sb.toString());
		
		while(!s1.empty()) {
			System.out.print(s1.pop()+" ");
		}
		
		
	}
 
}