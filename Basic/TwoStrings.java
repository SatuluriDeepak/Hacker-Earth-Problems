
import java.util.Arrays;
import java.util.Scanner;

public class TwoStrings {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter : ");
		
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			String s1=sc.next();
			String s2=sc.next();
			
			char[]arr1=s1.toCharArray();
			char[]arr2=s2.toCharArray();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			s1=new String(arr1);
			s2=new String(arr2);
			
			if(s1.equals(s2)) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	
	}

	

}
