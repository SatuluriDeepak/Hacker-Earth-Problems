import java.util.Scanner;

public class LiftQueries {
	public static void main(String...args) {
		int A=0;
		int B=7;
		
		System.out.println("Enter : ");
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		for(int i=0;i<t;i++) {
			int n=sc.nextInt();
		
				int l=n-A;
				int u=B-n;
				if(Math.abs(l)>Math.abs(u)) {
					B=n;
					System.out.println("B");
				}
				else if(Math.abs(l)>Math.abs(u)) {
					A=n;
					System.out.println("A");
					
				}
				else {
					if(A<B) {
						A=n;
						System.out.println("A");
					}
					else {
						B=n;
						System.out.println("B");
					}
				}
	
				
			}
	}

}
