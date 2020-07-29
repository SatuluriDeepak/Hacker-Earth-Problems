import java.util.Scanner;

public class EMaze {
	public static void main(String...args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("E");
		String s=sc.nextLine();
		int l=0,r=0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='L') {
				l--;
			}
			else if(s.charAt(i)=='R') {
				l++;
			}
			else if(s.charAt(i)=='U') {
				r++;
			}
			else {
				r--;
			}
		}
		System.out.println(l+" "+r);
	}

}
