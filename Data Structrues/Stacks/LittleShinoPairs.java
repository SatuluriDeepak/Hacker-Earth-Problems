import java.util.Scanner;

public class LittleShinoPairs {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		String []s=sc.nextLine().split(" ");
		int c=0;
		for(int i=1;i<n;i++) {
			if(Integer.parseInt(s[i-1])<Integer.parseInt(s[i])) {
				c++;
			}
		}
		System.out.println(c);
	}

}
