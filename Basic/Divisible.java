import java.io.*;
import java.util.*;

public class Divisible {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        System.out.println("Enter : "); 
        int N = Integer.parseInt(br.readLine().trim());
         String[] arr_A = br.readLine().split(" ");
         int[] A = new int[N];
         for(int i_A=0; i_A<arr_A.length; i_A++)
         {
         	A[i_A] = Integer.parseInt(arr_A[i_A]);
         }

         String out_ = solve(arr_A);
         System.out.println(out_);

         br.close();
    }
    static String solve(String[] A){
    	//String f="";
    	int odd=0,even=0;
    	
    	for(int i=0;i<(A.length/2);i++) {
    		String s=A[i];
    		String d=String.valueOf(s.charAt(0));
    		
    		if(i%2==0) {
    			odd+=s.charAt(0)-'0';
    		}
    		else even+=s.charAt(0)-'0';
    	}
    	
    	for(int i=A.length/2;i<A.length;i++) {
    		int s=(Integer.parseInt(A[i]))%10;
    		
    		if(i%2==0) odd+=s;
    		else even+=s;
    		    		

    	}
    	/*
    	System.out.println(f);
    	
    	int n=f.length();
    	
    	for(int i=0;i<n;i++) {
    		if(i%2==0) {
    			odd+=(f.charAt(i)-'0');
    			//System.out.println(Integer.parseInt(String.valueOf(f.charAt(i))));
    			//System.out.println(f.charAt(i)-'0');
    			}
    		else 
    			even+=(f.charAt(i)-'0');
    	}*/
    	
    	
    	if((odd-even)%11==0)
    		return "OUI";
    	else return "NON";
       
    
    }
}