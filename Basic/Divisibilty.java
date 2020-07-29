import java.util.Scanner;

public class Divisibilty {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		
		long n=sc.nextLong();
		String s="";
		for(int i=0;i<n;i++) {
			s=sc.next();
		}
		//System.out.println(s);
		if(s.charAt(s.length()-1)=='0') {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	
	}

}
