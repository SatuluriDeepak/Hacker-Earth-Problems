import java.util.Scanner;

public class VCPairs {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			int c=0;
			int n=sc.nextInt();
			String s=sc.next();
			char a[]=s.toCharArray();
			
			for(int j=1;j<s.length();j++) {
				if(a[j]=='a' || a[j]=='e' || a[j]=='i' || a[j]=='o' ||a[j]=='u'){
					if(a[j-1]!='a' && a[j-1]!='e' && a[j-1]!='i' && a[j-1]!='o' &&a[j-1]!='u') {
						c++;
					}
				}
			}
			System.out.println(c);
		}
	}

}
