import java.util.Scanner;

public class NumberofSteps {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		
		int min=Integer.MAX_VALUE,c=0,ind=-1;
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			if(a[i]<min) {
				ind =i;
				min=a[i];
			}
		}
		for(int i=0;i<n;i++) {
			b[i]=sc.nextInt();
		}
		boolean flag=false;
	
		while(min>=0) {
			 int i;
	            for(i=0;i<n;i++){
	                if(min==a[i]){
	                    continue;
	                }
	                else if((a[i]-min)%b[i]==0){
	                     c+=(a[i]-min)/b[i];
	                }
	                else{
	                    break;
	                }
	            }
	            if(i==n){
	  
	                System.out.println(c);
	                break;
	                }
	            min = min - b[ind];
	         }
	         if(min<0)
	            System.out.println("-1");
	    
	}
}
