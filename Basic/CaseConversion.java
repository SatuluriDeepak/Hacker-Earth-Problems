import java.util.Scanner;

public class CaseConversion {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String r="";
		for(int i=0;i<s.length();i++) {
			char p=s.charAt(i);
			if(Character.isLowerCase(p)) {
				r+=Character.toUpperCase(p);	
			}
			else {
				r+=Character.toLowerCase(p);
			}
			
		}
		System.out.println(r);
	}

}
