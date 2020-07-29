import java.util.Scanner;
 
public class FuturePrediction {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		print(s);
	}
 
	private static void print(String s) {
		int c=0,res=0;
		for(int i=6;i<s.length();i++) {
			char ch=s.charAt(c);
			if(ch=='0') {
				for(int j=c;j<i;j++) {
					if(s.charAt(j)=='0') {
						res++;
					}
					else {
						res=0;
						break;
					}
				}
			}
			else {
				for(int j=c;j<i;j++) {
					if(s.charAt(j)=='1') {
						res++;
					}
					else {
						res=0;
						break;
					}
				}
			}
			c++;
			if(res==6) {
				System.out.println("Sorry, sorry!");
				return;
			}
		}
		System.out.println("Good luck!");		
	}
 
}