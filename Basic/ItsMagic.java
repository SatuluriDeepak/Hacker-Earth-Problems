import java.util.Scanner;


public class ItsMagic {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		long sum=0,res=0,current=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		
		for(int i=0;i<n;i++) {
			if((sum-arr[i])%7==0) {
				if(arr[i]<current) {
					current=arr[i];
					res=i;
				}
			}
		}
		if(res==0)
			System.out.println("-1");
		else System.out.println(res);
		
	}

}