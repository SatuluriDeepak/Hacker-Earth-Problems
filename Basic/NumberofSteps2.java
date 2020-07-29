import java.util.Scanner;
 
public class NumberofSteps2 {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter  : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		
		long s=Integer.MAX_VALUE,c=0;
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			if(a[i]<s)
				s=a[i];
		}
		for(int i=0;i<n;i++) {
			b[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			if(a[i]>b[i] && b[i]!=0 ) {
				while(a[i]!=s ) {
					if(a[i]>0) {
						a[i]=a[i]-b[i];
						c++;
						if(a[i]<s)
							s=a[i];
					}
					else {
						c=-1;
						break;
					}
					
				}
			}
		}
		//System.out.println(s);
		System.out.println(c);
		
	}
 
}