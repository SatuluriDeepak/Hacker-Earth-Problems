import java.util.Scanner;

public class Factorial {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(rec(n));
	}

	private static int rec(int n) {
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else
			return n*rec(n-1);
		
		
		
	}

}
