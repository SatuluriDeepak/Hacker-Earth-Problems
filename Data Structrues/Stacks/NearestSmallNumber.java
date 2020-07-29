
import java.io.IOException;

import java.util.Scanner;

public class NearestSmallNumber {
	public static void main(String args[]) throws NumberFormatException, IOException {
		
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		
		sc.nextLine();
        String arr[]=sc.nextLine().split(" ");
        
        StringBuilder sb=new StringBuilder();
        sb.append("-1 ");
        for(int i=1;i<n;i++) {
        	int flag=0;
        	for(int j=i;j>-1;j--) {
        		if(Integer.parseInt(arr[j])<Integer.parseInt(arr[i])) {
        			sb.append(arr[j]+" ");
        			flag=1;
        			break;
        		}
        	}
        	if(flag==0) 
        		sb.append("-1 ");
        	
        }
        System.out.println(sb.toString());
	}

}
