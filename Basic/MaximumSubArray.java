import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MaximumSubArray {
	public static void main(String...args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		sc.nextLine();
		String[]s=sc.nextLine().split(" ");
		
		int[] arr=Arrays.stream(s).mapToInt(Integer::parseInt).toArray();
		
		
		for(int i=0;i<=n-k;i++) {
			int max=arr[i];
			for(int j=1;j<k;j++) {
				if(arr[i+j]>max) max=arr[j];
			}
			System.out.print(max+" ");
	
		}
		
	}

}
