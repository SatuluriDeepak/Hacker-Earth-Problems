import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
 
import java.util.Collections;
 
 
public class StackOperations {
	public static void main(String...args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        String s1[] = br.readLine().split(" ");
        int n=Integer.parseInt(s[0]);
        int k=Integer.parseInt(s[1]);
        ArrayList<Long> arr = new ArrayList<Long>();
        for(int i=0;i<n;i++) {
        	
        	arr.add(Long.parseLong((s1[i])));
        }
        if(k>=n) {
        	if(n==1 && k%2==1)
        		System.out.println("-1");
        	else {
        		
        		System.out.println(Collections.max(arr));
        		}
        }
        else System.out.print(Math.max(arr.get(k+1),arr.get(k)));
        
    }
}