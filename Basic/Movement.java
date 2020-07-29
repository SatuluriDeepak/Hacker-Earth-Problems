import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Movement {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("F");

		
		int n=sc.nextInt();
		int c=0;
		
		if(n%10!=0) {
			System.out.println(((n/5)+1));
		}
		else System.out.println(((n/5)));
		
		
	}

}
