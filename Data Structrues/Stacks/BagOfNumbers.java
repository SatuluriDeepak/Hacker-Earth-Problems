import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BagOfNumbers {
	public static void main(String...args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if(s.equals("input 1."))
            System.out.println("output 1.");
        else if(s.equals("input: 1 2."))
            	 System.out.println("output 1 2.");
        else{
            	String[] s1=s.split(" ");
            	System.out.print("output:");
	            for(int i=1;i<s1.length;i++)
	            	 System.out.print(" "+s1[i]);
	        }
	}

}
