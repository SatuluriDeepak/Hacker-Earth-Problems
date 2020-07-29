import java.util.Scanner;

public class Duration {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int sh=sc.nextInt();
			int sm=sc.nextInt();
			int eh=sc.nextInt();
			int em=sc.nextInt();
			int h=0,m=0;
			if(em>=sm) {
				 m=em-sm;
				 h=eh-sh;
			}
			else {
			 h=(eh-sh)-1;
			 m=(60-sm)+em;
			 }
			
			if(h<0) {
				System.out.println("0 "+m);
			}
			else {
				System.out.println(h+" "+m);
			}
			
		}
		sc.close();
	}

}
