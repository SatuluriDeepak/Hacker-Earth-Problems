import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dice {
	public static void main(String...args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str=bf.readLine();
		if(str.charAt(str.length()-1)=='6')
			System.out.println("-1");
		else {
			
			int c=0;
			for(int i=0;i<str.length();i++) {
				char ch=str.charAt(i);
				if(ch!='6')
					c++;
			}
			
			System.out.println(c);
		}
	}

	
	
}
