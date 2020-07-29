import java.util.Scanner;

public class CostofBallons {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
	
		System.out.println("TestCases : ");
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			int s1=0;
			int s2=0;
		
			//System.out.println("Cost : ");
			int cgreen=sc.nextInt();
			int cpurple=sc.nextInt();
			//System.out.println("Participants : ");
			int n=sc.nextInt();
			
			int c1=0;
			int c2=0;
			
			for(int j=0;j<n;j++) {
				int q1=sc.nextInt();
				int q2=sc.nextInt();
				if(q1==1 && q2==1) {
					c1+=1;
					c2+=1;
				}
				else if(q1==1 && q2==0) {
					c1+=1;
					c2+=0;
				}
				else if(q1==0 && q2==1) {
					c1+=0;
					c2+=1;
				}
				else {
					c1+=0;
					c2+=0;
				}
			}
			s1=c1*cgreen+c2*cpurple;
			s2=c1*cpurple+c2*cgreen;
			
			if(s1<s2) {
				System.out.println(s1);
			}
			else
				System.out.println(s2);
		}
	}

}
