import java.util.Scanner;

public class Skills {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int min=sc.nextInt();
		for(int i=0;i<n;i++) {
			int y=sc.nextInt();
			if(y>=min)System.out.println("YES");
			else System.out.println("NO");
		}
	}
	

}
