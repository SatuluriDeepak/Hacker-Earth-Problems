import java.util.Scanner;

public class BrickGame {
	public static void main(String...args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("E");
		int n=sc.nextInt();
		int f=0;
		int b_rem=n;
		for(int i=1;i<n/2;i++) {
			b_rem=b_rem-i;
			
			if(b_rem<=0) {
				f=1;
				break;
			}
			
			b_rem-=i*2;
			if(b_rem<=0) {
				f=0;
				break;
				}
			
		}
		if(f==1)
			System.out.println("Patlu");
		else
			System.out.println("Motu");
	}

}
