import java.util.Arrays;
import java.util.Scanner;

public class SplitHouses {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("E");
		int n=sc.nextInt();
		int c=0;
		sc.nextLine();
		String s=sc.nextLine();
		String a[]=s.split("");
		if(a[0].equals("."))
			a[0]="B";
		
		for(int i=1;i<n;i++) {
			if(a[i].equals("H") && a[i-1].equals("H")) {
				System.out.print("NO");
				break;
			}
			else {
				if(a[i].equals("."))
					a[i]="B";
			}
		}
		 
	    System.out.println("YES");
	    for(int i=0;i<n;i++) {
	       	System.out.print(a[i]);
	    }	
	}
}
