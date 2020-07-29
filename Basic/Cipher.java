import java.util.Scanner;

class Cipher {

public static void main(String args[] ) {
	Scanner s = new Scanner(System.in);

		String str=s.next();
		
		int no=s.nextInt();
		
		int len=str.length();
		
		for(int i=0;i<len;i++)
		{
			char c=str.charAt(i);
			
		 if(Character.isLetter(c))
			{
				int l=c;
				
				if(l>=97 && l<=122){
					int k=l;   
					k=k-97+no;   
					k=k%26;  
					k=k+97;
				
					System.out.print((char)k);
				}
				
				else{
				
					int k=l;  k=k-65+no;  k=k%26;  k=k+65;
				
					System.out.print((char)k);
				}
			
			}
			
			else if(Character.isDigit(c))
			
			{
				int k=Character.getNumericValue(c);
			
				int h=k+no;
				
				System.out.print(h%10);
			}
			
			else{
			
				System.out.print(c);
	
			}
		}
  	}
}