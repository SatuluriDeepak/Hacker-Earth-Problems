import java.util.Scanner;

public class FreindsRelationShip {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter : ");
		int t=sc.nextInt();
		for(int d=0;d<t;d++) {
			int n=sc.nextInt();
			
			for(int i=n;i>0 ;i--) {
				  
		        for(int j=0;j<(n-i)+1;j++)
		        	{
	                     System.out.print("*");
	                }
	            for(int j=0;j<(i*2)-2;j++)
	                
	                 {
	                      System.out.print("#");
	                 }
	            for(int j=0;j<(n-i)+1;j++)
	        	{
	                 System.out.print("*");
	            }
	                      System.out.println();
	         } 
			
		}
			
		
	}

}

