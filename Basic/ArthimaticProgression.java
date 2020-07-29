import java.util.Scanner;

public class ArthimaticProgression {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		
		
		int t=sc.nextInt();
		long count=0;
		for(int i=0;i<t;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			int f=b-a;
			int s=c-b;
			count=Math.abs(f-s);
			
			
			
			System.out.println(count);
			System.out.println((int) Math.ceil(count/2));
			
			
		
		}
		
		
	}

}
