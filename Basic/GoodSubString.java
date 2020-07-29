import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class GoodSubString {
	public static void main(String...args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		String res="";
		long c=1,count=0;
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i-1)==s.charAt(i)) {
				c=1;
			}
			else c++;
			count =Math.max(count, c);
		}
		System.out.println(count);
		
		
	}

}
